public class evensum {
    public static void main(String[] args) {
        int[] arr = {-12,445,6,78,-987654};
        int y = findnum(arr);
        System.out.println(y);
    }
    static int findnum(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int nums){
        if(digit(nums)%2 == 0){
            return true;
        }
        return false;
    }
    static int digit(int nums){
        if(nums<0){
            nums = nums*-1;
        }
        if(nums == 0){
            return 1;
        }
        int count=0;
        while(nums>0){
            count++;
            nums=nums/10;
        }
        return count;
    }
}
