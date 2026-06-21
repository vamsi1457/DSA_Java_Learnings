package Sortings;
// leetcode : 268
// amazon problem
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(Cyclicsort(arr));
    }
    static int Cyclicsort(int[] arr){
        int i =0;
        while(i < arr.length){
            int correct_index = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct_index]){
                swap(arr,i,correct_index);
            }else{
                i++;
            }
        }
       for(int j=0; j<arr.length;j++){
            if (arr[j] != j) {
                return j;
            }
       }
       return arr.length;
    }
    static void swap(int[] arr, int i, int correct_index){
        int temp = arr[i];
        arr[i] = arr[correct_index];
        arr[correct_index] = temp;
    }
}
