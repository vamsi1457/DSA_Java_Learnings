package BinarySearch;

public class RotatedCount {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int res = FindRotations(arr);
        System.out.println(res);
    }
    static int FindRotations(int[] arr){
        int pivot = FindPivot(arr);
        return pivot + 1;
    }
    static int FindPivot(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid - 1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
     static int FindPivot_duplicate(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid - 1;
            }
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                // skip the duplicates
                // Note: what if these elements at start and end were the pivot??
               if(arr[start]>arr[start+1]){
                return start;
               }
               start++;
               if(arr[end]<arr[end-1]){
                return end-1;
               }
               end--;
            }
            else if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
