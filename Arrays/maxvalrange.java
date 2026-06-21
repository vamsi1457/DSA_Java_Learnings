public class maxvalrange {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,3,9,2};
        int largevalue = rangemax(arr,1,4);
        System.out.println(largevalue);
    }
    static int rangemax(int[] arr,int start,int end){
        int max = arr[0];
        for(int i=start; i<end; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
