package Recursion;

public class ReverseAnumeber {
    // Way-1
    static int sum=0;
    static void Reverse1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        Reverse1(n/10);
    }

    static int reverse2(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        System.out.println("first way");
        Reverse1(1450);
        System.out.println(sum);
        System.out.println("second way");
        System.out.println(reverse2(1450));

    }
}
