package function;

import java.util.Scanner;

public class returnexample {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = n+m;
        return s;
    }
}
