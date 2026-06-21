package BinarySearch;
// We don't know weather the array is sorted in increasing order or decreasing order
public class agnosticSearch {
    public static void main(String[] args) {
        
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 8;
        System.out.println(agnostic(arr,target));
    }
    static int agnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            // Find the middle element
                int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    return mid;
                }
                if(arr[start]<arr[end]){
                    if(arr[mid] < target){
                        start = mid + 1;
                    }
                    else{
                        end = mid - 1;
                    }
                }else{
                    if(arr[mid] > target){
                        start = mid + 1;
                    }
                    else{
                        end = mid - 1;
                    }
                }
                
        }
    return -1;
  }
}