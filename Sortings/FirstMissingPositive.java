package Sortings;
//https:leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,10,11};
        int res = PosivtiveMissing(arr);
        System.out.println(res);

    }
    static int PosivtiveMissing(int[] arr){
        int i =0;
        while(i < arr.length){
            int correct_index = arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[correct_index]){
                swap(arr,i,correct_index);
            }else{
                i++;
            }
        }
       for(int index=0; index<arr.length;index++){
            if (arr[index] != index+1) {
                return index+1;
            }
       }
       return arr.length+1;
    }
    static void swap(int[] arr, int i, int correct_index){
        int temp = arr[i];
        arr[i] = arr[correct_index];
        arr[correct_index] = temp;
    }
}
