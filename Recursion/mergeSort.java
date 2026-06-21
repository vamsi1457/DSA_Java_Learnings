package Recursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        System.out.println(Arrays.toString(mergesort(arr)));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        // divide the array into two parts
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid)); 
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        // return the sorted mixed array 
        // to sort and mix create new funtion named merge()
        return merge(left, right);
    }
    // sort and mix the array sorted array
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];
        int i=0; // pointer for first array
        int j=0; // pointer for second array
        int k=0; // pointer for third array
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++; 
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // there may be possiblility that one of the arrays is not complete of checking
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
