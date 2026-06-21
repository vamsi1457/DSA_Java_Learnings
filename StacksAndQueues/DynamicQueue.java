public class DynamicQueue extends Queue{
    DynamicQueue(){
        super();
    }
    DynamicQueue(int size){
        super(size);
    }
    @Override
    public void insert(int item) throws Exception{
        if(isfull()){
            int[] temp = new int[data.length*2];
            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        data[end] = item;
        end++;
        // or data[end++] = item;
    }
    
}
