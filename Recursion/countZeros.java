package Recursion;

public class countZeros {

    public static void main(String[] args) {
        System.out.println(countzeros(1230040007));
    }
    static int countzeros(int n){
        return helper(n,0);
    }
    static int helper(int n, int count) {
        if(n==0){
            return count;
        }
        int digit = n%10;
        if(digit!=0){
            return helper(n/10, count);
        }
        return helper(n/10, count+1);
    }
}
