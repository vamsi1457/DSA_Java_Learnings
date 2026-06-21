package BinarySearch;

public class PeakIndexOfMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,4,3,2};
        int res = Peak(arr);
        System.out.println(res); 
    }
    static int Peak(int[] arr){
        int start =0;
        int end = arr.length -1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start; // or return end;
    }
}
