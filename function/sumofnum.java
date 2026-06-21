package function;

import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n = sc.nextInt();
        System.out.print("Enter second number: ");
        int m = sc.nextInt();
        int ans = n + m;
        System.out.println("Sum = "+ans);
    }
}
