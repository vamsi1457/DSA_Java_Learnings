public class StackMain {
    public static void main(String[] args) throws Exception {
        // Normal stack implementation 
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(12);
        stack.push(14);
        stack.push(15);
        stack.push(16);

       System.out.println( stack.pop());
       System.out.println(stack.peek());
        // Dynamic stack implementation
    }
}
