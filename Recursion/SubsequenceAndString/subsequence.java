package Recursion.SubsequenceAndString;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        String text = "abcd";
        Subseq("", text);
        System.out.println(SubSeqReturn("", text));
    }
    // just printing the strings
    static void Subseq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        Subseq(processed+ch, unprocessed.substring(1));
        Subseq(processed, unprocessed.substring(1));
    }
    // returning the strings in an ArrayList
    static ArrayList<String> SubSeqReturn(String processed, String unprocessed){
        if(unprocessed.isEmpty()){ 
            ArrayList<String> list = new ArrayList<String>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> left = SubSeqReturn(processed+ch, unprocessed.substring(1));
        ArrayList<String> rigth = SubSeqReturn(processed, unprocessed.substring(1));
        left.addAll(rigth);
        return left;
    }

}
