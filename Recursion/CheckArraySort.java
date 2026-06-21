package Recursion;

public class CheckArraySort {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,10,7,8};
        System.out.println(Checker(arr));
    }
    static boolean Checker(int[] arr){
        if(arr.length==1){
            return true;
        }
        return helper(arr,0);
    }
    private static boolean helper(int[] arr, int index) {

            if(index == arr.length-1){
                return true;
            }
            return arr[index]<arr[index+1] && helper(arr,index+1);
    }
}
