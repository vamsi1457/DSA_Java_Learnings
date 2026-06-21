package Recursion.SubsequenceAndString;

import java.util.ArrayList;

public class PhonePad {
    // solution for leetcode
    static ArrayList<String> LeetcodePhonepad(String digits){
        if(digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        return helper("",digits);
        
    }
    static ArrayList<String> helper(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digits = up.charAt(0)-'0';
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String letters = map[digits];
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<letters.length(); i++){
            result.addAll(helper(p+letters.charAt(i), up.substring(1)));
        }
        return result;
    }
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padret("", "12"));
        System.out.println(padcount("", "12"));
        System.out.println(LeetcodePhonepad("23"));
    }
    // traditional method
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i=(digit-1)*3; i<digit*3; i++){
            char  ch= (char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }
     static ArrayList<String> padret(String p, String up){
        
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> values = new ArrayList<>();
        for(int i=(digit-1)*3; i<digit*3; i++){
            char  ch= (char)('a'+i);
        values.addAll(padret(p+ch,up.substring(1)));
        }
        return values;
    }
    static int padcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for(int i=(digit-1)*3; i<digit*3; i++){
            char  ch= (char)('a'+i);
          count = count + padcount(p+ch,up.substring(1));
        }
        return count;
    }
}
