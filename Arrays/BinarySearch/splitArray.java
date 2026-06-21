package BinarySearch;

public class splitArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int res = SplitArray(nums, 2);
        System.out.println(res);
    }
    static int SplitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i=0; i<nums.length; i++){
            
            start = Math.max(start, nums[i]); // gives the max value from the array if there are duplicate values
            end+=nums[i];   // Gives the sum of all values in the array
        }
        while(start<end){
            //initially possible largest value is mid
            int mid = start + (end-start)/2;
            int sum =0;
            int partitions = 1;
            for(int i=0; i<nums.length; i++){
                if(sum+nums[i] > mid){   
                    sum = nums[i];  // If the sum exceeds more than mid then increase the partitions.
                    partitions++;
                }else{
                    sum+=nums[i];  // other wise sum the values from the array
                }
            }
            if(partitions>k){
                start = mid + 1;   // If partitions exceeds the given number of partitions
            }else{
                end = mid;    // other wise
            }
        }
        return start;
    }
}