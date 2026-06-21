package Recursion;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumdigits(12345));
        System.out.println(productdigits(12345));
    }
    static int sumdigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumdigits(n/10); 
    }
    static int productdigits(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*productdigits(n/10);
    }
}
