public class Stack {
    protected int[] data;   
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    Stack(){
        this.data = new int[DEFAULT_SIZE];
    }  
    Stack(int size){
        this.data = new int[size];
    }

    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Stack is full!!");
        }
        ptr++;
        data[ptr] = item;
    }
    public boolean isFull() {
        return ptr == data.length-1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("You can not pop an element from Empyt Stack!!!");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;/
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("You can not pop an element from Empyt Stack!!!");
        }
        return data[ptr];
    }
}
