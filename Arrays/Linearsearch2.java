public class Linearsearch2 {
    public static void main(String[] args) {
        String name = "vamsi";
        char target = 's';
        boolean res = LinearSearch(name, target);
        System.out.println(res);
    }
    static boolean LinearSearch(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
