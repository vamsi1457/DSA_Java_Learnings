public class rangesearch {
    public static void main(String[] args) {
        int[] nums = {1,4,5,7,3,9,2,3,8,10};
        int res = rangeSearch(nums, 0, 0, 0);
        if(res == -1){
            System.out.println("element not found!!!");
        }else{
            System.out.println("Element found at index "+res);
        }
    }
    static int rangeSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            System.out.println("sixe of an array is zero!!!");
            return -1;
        }
        for(int i=start; i<end; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
