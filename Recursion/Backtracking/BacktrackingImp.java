package Recursion.Backtracking;

public class BacktrackingImp {

     public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},
                            {true,true,true},
                            {true,true,true}};
        allpaths("", maze, 0, 0);
    }
    static void allpaths(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        maze[r][c] = false;
        if(r>0){
            allpaths(p+'U', maze, r-1, c);
        }
        if(r<maze.length-1){
            allpaths(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            allpaths(p+'R', maze, r, c+1);
        }
        if(c>0){
            allpaths(p+'L', maze, r, c-1);
        }
        // This is where funtion will over
        // so before funtion gets removed, also remove the changes that were made by functions
        maze[r][c] = true;
    }
}