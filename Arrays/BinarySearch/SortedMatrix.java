package BinarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int[] res = Search(matrix, 10);
        System.out.println(Arrays.toString(res));
        
    }

    static int[] Binary(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return Binary(matrix, 0, 0, cols-1, target);
        }

        // reducce the search space in the matrix until until we get 2 rows
        int rStart = 0;
        int rEnd = matrix.length-1;
        int cMid = cols/2;

        while(rStart < (rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }

            // now we get two rows of matrix
            // Check weather the mid Column you are at contain the target
            if(matrix[rStart][cMid] == target){
                return new int[]{rStart,cMid};
            }
            if(matrix[rStart+1][cMid] == target){
                return new int[]{rStart+1,cMid};
            }
            // if we not found the answer in mid column then consider the 4 parts and search among them
            // search in part-1
            if(target <= matrix[rStart][cMid]){
                return Binary(matrix, rStart, 0, cMid-1, target);
            }
            // search in part-2
            if(target>=matrix[rStart][cMid] && target<=matrix[rStart][cols-1]){
                return Binary(matrix, rStart, cMid+1, cols-1, target);
            }
            // search in part-3
            if(target <= matrix[rStart+1][cMid]){
                return Binary(matrix, rStart+1, 0, cMid-1, target);
            }
            // search in part-4
            else{
                return Binary(matrix, rStart+1, cMid+1, cols-1, target);
            }
        }
        return new int[]{-1,-1};
    }
}