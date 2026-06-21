package Recursion;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        Bubble(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr, int Lindex, int Iindex){
        if(Lindex == 0){
            return;
        }
        if(Iindex<Lindex){
            if(arr[Iindex] > arr[Iindex+1]){
                int temp = arr[Iindex];
                arr[Iindex] = arr[Iindex+1];
                arr[Iindex+1] = temp;
            }
            Bubble(arr, Lindex, Iindex+1);
        }else{
            Bubble(arr, Lindex-1, 0);
        }
    }
}
