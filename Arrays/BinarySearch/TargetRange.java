package BinarySearch;

import java.util.Arrays;
// Find the range of the target value in a sorted array
public class TargetRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,7,7,7,7,7,8,9,10};
        int target = 7;
        int[] res = Range(arr, target);
        System.out.println(Arrays.toString(res));

    }
    static int[] Range(int[] arr, int target){
        int[] ans = {-1,-1};
        int start = findIndex(arr, target, true);
        int end = findIndex(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int findIndex(int[] arr, int target, boolean FirstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid+1;
            }else if(arr[mid] > target){
                end = mid -1;
            }else{
                ans = mid;
                if(FirstIndex){
                    end = mid - 1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
