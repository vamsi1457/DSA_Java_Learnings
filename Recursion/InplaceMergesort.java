package Recursion;

import java.util.Arrays;

public class InplaceMergesort {
      public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergesort(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }
        // divide the array into two parts
        int mid = (start+end)/2;
        mergesort(arr,start,mid); 
        mergesort(arr,mid,end);
        // return the sorted mixed array 
        // to sort and mix create new funtion named merge()
        mergeinplace(arr,start,mid,end);
    }
    // sort and mix the array sorted array
    static void mergeinplace(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start];
        int i=start; // pointer for first array
        int j=mid; // pointer for second array
        int k=0; // pointer for third array
        while(i<mid && j<end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++; 
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // there may be possiblility that one of the arrays is not complete of checking
        while(i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0; l<mix.length; l++){
            arr[start+l] = mix[l];
        }
    }
}
