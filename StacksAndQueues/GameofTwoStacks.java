import java.util.LinkedList;
import java.util.Stack;
public class GameofTwoStacks {
    public static int GameOfstack(int maxSum, int[] a, int[] b){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        for(int i=a.length-1; i>=0; i--){
            stack1.push(a[i]);
        }
        for(int j = b.length-1; j>=0; j--){
            stack2.push(b[j]);
        }
        int sum =0;
        int count = 0;
        while(true){
            if(!stack1.isEmpty() && sum+stack1.peek() <= maxSum){
                sum += stack1.pop();
                count++;
            }
           if(!stack2.isEmpty() && sum+stack2.peek() <= maxSum){
                sum += stack2.pop();
                count++;
            }
            else break;
        }
        return count;
    }
    public static void main(String[] args) {
        int maxSum = 10;

        int[] a = {4, 2, 4, 6, 1};
        int[] b = {2, 1, 8, 5};

        int result = GameOfstack(maxSum, a, b);

        System.out.println("Maximum elements removed: " + result);
    }

    /*You are given two stacks of integers A and B and a maximum allowed sum X.
Rules:
You may remove elements only from the top of either stack.
Every removed element is added to a running sum.
The running sum must never exceed X.
Your goal is to remove the maximum number of elements from the two stacks.
Input
X → maximum allowed sum
A[] → elements of stack A
B[] → elements of stack B
Output
Return the maximum number of elements you can remove without the sum exceeding X */
}
