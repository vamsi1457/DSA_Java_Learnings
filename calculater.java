import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation: ");
        char op = sc.next().trim().charAt(0);
        int ans = 0;
        while(true){
            
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.println("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(op=='+'){
                    ans = a+b;
                }if(op=='-'){
                    ans = a-b;
                }if(op=='*'){
                    ans = a*b;
                }if(op=='/'){
                    if(b!=0){
                    ans = a/b;
                    }else{
                        System.out.println("not defined!!!!");
                    }
                }if(op=='%'){
                    ans = a%b;
                }
                
            }
            else if(op=='x' || op=='X'){
                    break;
                }else{
                    System.out.println("invalid operation!!!!!");
                }
                System.out.println(ans);
        }
    }   
}
