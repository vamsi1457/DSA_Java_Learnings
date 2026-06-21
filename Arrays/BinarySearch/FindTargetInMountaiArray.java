package BinarySearch;

public class FindTargetInMountaiArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,1};
        int target = 4;
        int y = SearchTarget(arr, target);
        System.out.println(y);
    }
    static int SearchTarget(int[] arr, int target){
        int peak = PeakValue(arr);
        int firsttry = IgnosticBinarySearch(arr, target, 0, peak);
        if(firsttry != -1){
            return firsttry;
        }
        return IgnosticBinarySearch(arr, target, peak+1,arr.length-1);
    }
    static int PeakValue(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    static int IgnosticBinarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(arr[start]<arr[end]){
                if(arr[mid]<target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(arr[mid]>target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
