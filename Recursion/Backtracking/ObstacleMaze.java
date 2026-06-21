package Recursion.Backtracking;

public class ObstacleMaze {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},
                            {true,false,true},
                            {true,true,true}};
        mazeObstacle("", maze, 0, 0);
    }
    static void mazeObstacle(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        if(r<maze.length-1){
            mazeObstacle(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            mazeObstacle(p+'R', maze, r, c+1);
        }
    }
}
