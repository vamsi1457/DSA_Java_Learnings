package BinarySearch;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 5;
        int res = FindTarget(arr,target);
        System.out.println(res);
    }
    static int FindTarget(int[] arr, int target){
        int pivot = FindPivot(arr);
        if(pivot == -1){
           return BinarySearch(arr, target, 0, arr.length-1);
        }
        if(target == arr[pivot]){
            return pivot;
        }
        if(target >= arr[0]){
           return BinarySearch(arr, target, 0, pivot-1);
        }else{
            return BinarySearch(arr, target, pivot+1, arr.length -1);
        }
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
    static int BinarySearch(int[] arr, int target, int start, int end){
       while (start<=end) {
            // Find the middle element
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            // searches in left side of an array with respect to middel index
            else if(arr[mid]<target){
            start = mid+1;
        }
        // searches in right side an array with respect to middle index
        else{
            end = mid -1;
        }
        }
        return -1;
    }
}
