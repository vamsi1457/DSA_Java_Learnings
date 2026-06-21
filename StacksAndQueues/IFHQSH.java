import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class IFHQSH {
    // Interleave the First Half of the Queue with the Second Half
    public static void ifhqsh(Queue<Integer> q){
        Stack<Integer> stack = new Stack<>();
        int n = q.size();
        // push first half elements into the stack form queues
        for(int i=0; i<n/2; i++){
            stack.push(q.poll());
        }
        // add elements again into the queue from the stack
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        // flip the first half elements in the queue
        for(int i=0; i<n/2; i++){
            q.add(q.poll());
        }
        //again push first half elements into the stack form queues
        for(int i=0; i<n/2; i++){
            stack.push(q.poll());
        }
        
        while(!stack.isEmpty()){
            q.add(stack.pop());
            q.add(q.poll());
        }

    }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        ifhqsh(q);
        System.out.println(q);
  }  
}
