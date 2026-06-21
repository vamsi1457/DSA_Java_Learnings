package Recursion.SubsequenceAndString;
import java.util.ArrayList;
public class dice {
    public static void main(String[] args) {
        Dicee("", 5);
        ArrayList<String> res = Dicereturn("", 5);

        System.out.println(Dicereturn("", 5));
        System.out.println(res.size());
    }
    static void Dicee(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i=1; i<=6 && i<=target; i++){
            Dicee(p+i, target-i);
        }
    } 
    static ArrayList<String> Dicereturn(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> values = new ArrayList<>();
        for(int i=1; i<=6 && i<=target; i++){
            values.addAll(Dicereturn(p+i, target-i));
        }
        return values;
    }
}
