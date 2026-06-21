package Recursion.SubsequenceAndString;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        Permutations("", "abc");
       ArrayList<String> res = permutaionsArraylist("","abc");
       System.out.println(res);
       System.out.println(NumberOfPermutations("","abc"));
    }
    static void Permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            Permutations(first+ch+second,up.substring(1));
        }
    }
    static ArrayList<String> permutaionsArraylist(String p, String up){
        
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        char ch = up.charAt(0);
        ArrayList<String> val = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            val.addAll(permutaionsArraylist(first+ch+second, up.substring(1)));
        }
        return val;
    }
    static int NumberOfPermutations(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
           count = count + NumberOfPermutations(first+ch+second,up.substring(1));
        }
        return count;
    }
}
