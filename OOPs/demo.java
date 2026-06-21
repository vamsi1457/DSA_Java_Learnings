package OOPs;

public class demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(10, 20);
        System.out.println(a+" "+b);
        
    }
    
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

