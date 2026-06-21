public class palindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println(Palindromecheck(str));
    }
    static boolean Palindromecheck(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        for(int i=0; i<str.length()/2;i++){
            char start = str.charAt(0);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }

}
