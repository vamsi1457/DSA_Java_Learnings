
public class Queue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    Queue(){
        this(DEFAULT_SIZE);
    }
    Queue(int size){
        this.data = new int[size];
    }
    public boolean isfull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public void insert(int item) throws Exception{
        if(isfull()){
            throw new Exception("We can not insert an element in fulled Queue");
        }
        data[end] = item;
        end++;
        // or data[end++] = item;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Can not remove element from an empty Queue!!");
        }
        int removed = data[0];
        for(int i=1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("There is no front element in Empty Queue");

        }
        return data[0];
    }
    public void display(){
        for(int i=0; i<end;i++){
            System.out.print(data[i]);
            System.out.print(" <- ");
        }
        System.out.println("END");

    }
    
}