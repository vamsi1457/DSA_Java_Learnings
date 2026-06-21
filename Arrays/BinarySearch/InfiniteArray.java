package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9,12,13,14,16,17,133,22,33,44,55,66,77,88};
       int target = 14;
       System.out.println(answer(arr, target));  
    }
    static int answer(int[] arr, int target){
        // first find the range of the box
        // intitial range
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int Initial_Start = end + 1;
            end = end + (end - start + 1)*2;
            start = Initial_Start;
        }
        return BinarySearch(arr, target, start, end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){ 
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]<target){
                start = mid + 1;
            }else if(arr[mid]>target){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
