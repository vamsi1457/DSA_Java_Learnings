package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,3,9,2,3,10};
        System.out.println(ReturnIndex(arr, 5, 0));
        System.out.println(ReturnTorF(arr, 8, 0));
        System.out.println(ReturnFromBack(arr, 9, arr.length-1));
        
    }
    // returning the index of the value
    static int ReturnIndex(int[] arr,int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return ReturnIndex(arr, target, index+1);
    }
    // returning weather the value is present in array or not
    static boolean ReturnTorF(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        if(arr[index] == target){
            return true;
        }
        return ReturnTorF(arr, target, index+1);
    }

    // searching from back side and returning the index
    static int ReturnFromBack(int[] arr, int target, int index){
        if(index < 0){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return ReturnFromBack(arr, target, index-1);
    }
}
