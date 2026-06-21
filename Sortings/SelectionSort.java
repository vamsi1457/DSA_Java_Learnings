package Sortings;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            
            int last = arr.length-1-i;  // find the last index for every iteration
            int max = maxIndex(arr,0,last);         // find the Max Index in the every iteration
            swap(arr, max, last);       // swap the max value to the last index in every interation.
        }
    }
    static void swap(int[] arr,int max,int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
    static int maxIndex(int[] arr, int start, int end){
        int Max =start;
        for(int i=start; i<=end; i++){
            if(arr[i]>arr[Max]){
                Max = i;
            }
        }
        return Max;
    }
}
