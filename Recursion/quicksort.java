package Recursion;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int low, int high){
        /*  low and high are parts in which if the values < pivot should be in low part 
        and viceversa */

        if(low>=high){
            return;
        }
        int s = low;   // pointers(index) for swapping
        int e = high;
        int mid = s+(e-s)/2;
        int pivot = arr[mid];
        while(s<=e){
            while(arr[s]<pivot){ //We stop ONLY when we find a WRONG element i.e,arr[s]>=pivot
                s++;
            }
            while(arr[e]>pivot){ //We stop ONLY when we find a WRONG element i.e,arr[e]<=pivot
                e--;
            }
            if(s<=e){  // this checks only index not value
                /*  after stopping of s and e which means large value than pivot is in low
                    then it checks if s<=e then it swaps and move forward*/ 
                int temp = arr[s];  
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr, s, high);
    }
}
