import java.util.Scanner;

public class countnums {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value: ");
      int n = sc.nextInt();
      System.out.println("Enter a target value: ");
      int target = sc.nextInt();
      int count=0;
      while(n>0){
        if(n%10==target){
          count++;
        }
        n = n/10;
      }
      
      System.out.println("no.of times repeated = "+count);
   } 
}
