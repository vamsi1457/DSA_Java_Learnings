package BinarySearch;

public class implimentation {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,9,10,11,15,18,19};
        int target = 15;
        System.out.println(BinarySarches(arr, target));
    }
    static int BinarySarches(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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
