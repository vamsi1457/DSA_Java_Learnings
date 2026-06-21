import java.util.Arrays;

public class IndexrangeOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,7,7,7,7,7,7,7,8,9,10};
        int target = 7;
        int[] res = indRange(arr, target);
        System.out.println(Arrays.toString(res));
    }
    static int[] indRange(int[] arr, int target){
        int start = -1;
        int end = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                start= i;
                break;
            }
        }for(int j=arr.length-1; j>=0;j--){
            if(arr[j] == target){
            end =j;
            break;
            }
        }
        return new int[]{start,end};
    }
}
