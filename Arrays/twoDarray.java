import java.util.Arrays;
public class twoDarray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        for(int[] ele:arr){
            for(int val:ele){
                System.out.print(val+" ");
            }
            System.out.println();
        }
       // System.out.println(Arrays.deepToString(arr));
    }
    
}
