package BitManipulation;

public class findNonRepeatedInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        nonRepeated(arr);
    }
    static void nonRepeated(int[] arr){
        int a = 0;
        // XOR every element with 0 and store in a
        for(int n:arr){
            a ^= n;
        }
        System.out.println(a);
    }
}