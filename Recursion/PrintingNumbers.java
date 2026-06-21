package Recursion;

public class PrintingNumbers {
    public static void main(String[] args) {
        System.out.println("decending order: ");
        fun(5);
        System.out.println("ascending order: ");
        fun2(5);
        System.out.println("Both ascending and decending order: ");
        funboth(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void fun2(int n){
        if(n==0){
            return;
        }
        
        fun2(n-1);
        System.out.println(n);
    }
    static void funboth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }
}
