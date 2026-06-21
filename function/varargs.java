package function;

public class varargs {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8,9));
        System.out.println("second : "+sum(3,3,3,3,3,33,90));
        
    }
    static int sum(int ...nums){
        int total = 0;
        for(int i=0 ; i<nums.length ; i++){
            total = total + nums[i];
        }
        return total;
    }
}
