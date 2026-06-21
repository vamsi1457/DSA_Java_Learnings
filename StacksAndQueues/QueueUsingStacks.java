import java.util.Stack;
public class QueueUsingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;
    QueueUsingStacks(){
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        first.push(item);
    }
    public int remove() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public int Peek() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peakval = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peakval;
    }
    public boolean Empty(){
        return first.isEmpty();
    }
    public static void main(String[] args) throws Exception {
        QueueUsingStacks stack = new QueueUsingStacks();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
        stack.add(60);
        System.out.println(stack.Peek());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.Peek());
        System.out.println(stack.Empty());

    }
}
