public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 66;
        int result = LinearSearch(arr, target);
        if(result == -1){
            System.out.println("The target is not found!!!");
        }else{
            System.out.println("The target is at "+result+" index position.");
        }
    }
    static int LinearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
