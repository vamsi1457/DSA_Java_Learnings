package TwoPointers;
// leetcode: Remove Duplicates from Sorted Array
// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums 
// being 0, 1, 2, 3, and 4 respectively.
// It does not matter what you leave beyond the returned k 
// (hence they are underscores).
public class RemoveDuplicates {
    int removeDuplicates(int[] arr) {
        int j =0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                j++;
                arr[j] = arr[i];

            }
        }
        return j+1;
    }
}
