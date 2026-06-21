package Recursion.Backtracking;

import java.util.ArrayList;

public class ThreeDirectionMazePath {
    public static void main(String[] args) {
        System.out.println(MazePath("", 3, 3));
    }
    static ArrayList<String> MazePath(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        if(r>1){ // this logic is for down direction
            res.addAll(MazePath(p+'D', r-1, c));
        }
        if(r>1 && c>1){ // this is for diagonal
            res.addAll(MazePath(p+'d', r-1, c-1));
        }
        if(c>1){
            res.addAll(MazePath(p+'R', r, c-1));
        }
        return res;
    }
}
