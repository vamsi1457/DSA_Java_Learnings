package SlidingWindow;
// Leetcode : 2379
// Minimum Recolors to get k consecutive Black blocks
// Input: blocks = "WBBWWBBWBW", k = 7
// Output: 3
// Explanation:
// One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
// so that blocks = "BBBBBBBWBW". 
// It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
// Therefore, we return 3.
public class MinimumRecolors {
    static int Minrecolors(String s, int k){
        int whites = 0;
        for(int i=0; i<k; i++){
            if(s.charAt(i) == 'W'){
                whites++;
            }
        }
        int minWhites = whites;
        int end = k;
        int start = 1;
        while(end < s.length()){
            if(s.charAt(start-1) == 'W'){
                whites--;
            }
            if(s.charAt(end) == 'W'){
                whites++;
            }
            minWhites = Math.min(whites, minWhites);
            end++;
            start++;
        }
        return minWhites;
    } 
    public static void main(String[] args) {
        String s = "WBWBBBW";
        System.out.println(Minrecolors(s, 2));
    }
}