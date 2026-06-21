import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(4);
        for(int i=0;i<20;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
