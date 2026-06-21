package Recursion.Backtracking;

import java.util.Arrays;

public class printPathOfMaze {
     public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},
                            {true,true,true},
                            {true,true,true}};
        int[][] path = new int[maze.length][maze[0].length];
        allpaths("", maze, 0, 0,path,1);
    }
    static void allpaths(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r==maze.length-1 && c==maze[0].length-1){
             path[r][c] = step; // Mark the final cell with current step number
            for(int[] nums:path){
                System.out.println(Arrays.toString(nums));// Print the complete path matrix for THIS path
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        maze[r][c] = false;  // Mark current cell as visited so we don't revisit it
        path[r][c] = step;   // Store step number for current cell
        if(r>0){
            allpaths(p+'U', maze, r-1, c,path,step+1);
        }
        if(r<maze.length-1){
            allpaths(p+'D', maze, r+1, c,path,step+1);
        }
        if(c<maze[0].length-1){
            allpaths(p+'R', maze, r, c+1,path,step+1);
        }
        if(c>0){
            allpaths(p+'L', maze, r, c-1,path,step+1);
        }
        // ================= BACKTRACKING =================
        // Now ALL possible paths from this cell are explored.
        // Before returning to previous call:
        // 1) Unmark the cell (make it available again)
        // 2) Remove the step number
        // This allows the cell to be reused in OTHER paths
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
