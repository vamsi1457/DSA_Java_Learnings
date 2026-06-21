import java.util.Arrays;

public class twoDsearch {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},
                    {5,7,98,75,22},
                {33,55,12,11,44,78,97,65},
                {54,34}};
        int target = 11;
        int[] res = search(arr, target);
        System.out.println(Arrays.toString(res));
    }
    static int[] search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(target == arr[i][j]){
                    return new int[]{i,j};
                }
            }
            
        }
        return new int[]{-1,-1};
    }
}
