public class maxval {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,3,9,2};
        int largevalue = max(arr);
        System.out.println(largevalue);
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
