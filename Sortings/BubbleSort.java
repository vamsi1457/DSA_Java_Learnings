package Sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubblesort(int[] arr){
       boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;  // assummes there is no swaps
            for(int j=0; j<arr.length-1-i; j++){
                // first it checks i=0 and runs j loop. if there is any swaps(means swapped==true)
                // if there is any swaps then it goes to i=1 and repeat the loops
                // before going to run i=1, it checks the if condition of boolean. if there is swaps it skips the if condition
                // if there is no swaps then swapped becomes false. then it breaks the loop
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
}
