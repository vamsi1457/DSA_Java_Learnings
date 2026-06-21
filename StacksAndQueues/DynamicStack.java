
public class DynamicStack extends Stack {
    DynamicStack(){
        super();
    }
    DynamicStack(int size){
        super(size);
    }
    /* Here all the functions in normal stack we are going to 
        to utilise as it is in dynamic stack. The only problem is 
        with "push()".
        If we use push any element ater the stack is fulled. It throws an 
        exception error.
        DynamicStack does not full at any time.
        So we gradually double the size of the stack if stack is fulled
        so that we have to @Override the "pus()" function
     */
    @Override
    public void push(int item) throws Exception{
        if(isFull()){
            int[] temp = new int[data.length*2];
            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        super.push(item);
    }
}
