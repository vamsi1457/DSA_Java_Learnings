package BitManipulation;


public class evenORodd {
    public static void main(String[] args) {
        System.out.println(evenorodd(23));
    }
    static String evenorodd(int num){
        if((num&1) == 1){
            return "odd";
        }
        return "even";
    }
}
