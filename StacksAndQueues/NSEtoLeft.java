import java.util.*;
import java.util.Stack;
public class NSEtoLeft {
    public static ArrayList<Integer> NearestSmalletsToLeft(ArrayList<Integer> List){
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<List.size(); i++){
            while(!stack.isEmpty() && stack.peek() >= List.get(i)){
                stack.pop();
            }
            if(stack.isEmpty()){
                result.add(-1);
            }else{
                result.add(stack.peek());
            }
            stack.push(List.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(5);
            list.add(2);
            list.add(10);
            list.add(8);
        System.out.println(NearestSmalletsToLeft(list));
    }
}
