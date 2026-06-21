package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int res = search(arr, 7, 0, arr.length-1);
        System.out.println(res);
    }

    static int search(int[] arr,int target, int start, int end){ // arguments used for future funtion calls
        // Base condtion
        if(start > end){
            return -1;
        }
        // Body of the function for recurion
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
}
