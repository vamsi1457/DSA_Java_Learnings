package Recursion.SubsequenceAndString;

public class skiipString {

    public static void main(String[] args) {
        System.out.println(SkipApple("abchdappleefgr"));
    }
    static String SkipApple(String text){
        if(text.isEmpty()){
            return "";
        }

        if(text.startsWith("apple")){
            return SkipApple(text.substring("apple".length()));
        }else{
            return text.charAt(0)+SkipApple(text.substring(1));
        }
    }
}