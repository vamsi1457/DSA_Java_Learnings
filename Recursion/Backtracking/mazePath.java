package Recursion.Backtracking;

import java.util.ArrayList;

public class mazePath {
    public static void main(String[] args) {
        pathOfMaze("", 3, 3);
        ArrayList<String> res = pathArrayReturn("", 3, 3);
        System.out.println(res);
    }
    static void pathOfMaze(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            pathOfMaze(p+'D', r-1, c);
        }
        if(c>1){
        pathOfMaze(p+'R', r, c-1);
        }
    }
    static ArrayList<String> pathArrayReturn(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        if(r>1){
        res.addAll(pathArrayReturn(p+'D', r-1, c));
        }
        if(c>1){
            res.addAll(pathArrayReturn(p+'R', r, c-1));
        }
        return res;
    }
}
