package Recursion.SubsequenceAndString;

public class skipChar {
    public static void main(String[] args) {
        String text = "baccdaff";
        skip("", text);
        System.out.println(skip2(text));
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }

    }
    static String skip2(String text){
        if(text.isEmpty()){
            return "";
        }
        char ch = text.charAt(0);
        if(ch == 'a'){
          return  skip2(text.substring(1));
        }else{
            return ch + skip2(text.substring(1));
        }
    }
}
