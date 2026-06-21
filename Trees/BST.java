package Trees;

public class BST{
    
    class Node{
        int value;
        Node left;
        Node right;
        int height;
        Node(int value){
            this.value = value;
        }
    }
    Node root;
    public int Height(){
        return Height(root);
    }
    public int Height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    
    public void insert(int value){
        root = insert(root, value);
    }
    public Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
          node.left =  insert(node.left, value);
        }
        if(value > node.value){
           node.right = insert(node.right, value);
        }
        node.height = Math.max(Height(node.left), Height(node.right))+1;
        return node;
    }
    public void populate(int[] arr){
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
    }
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(Height(node.left)-Height(node.right)) <=1 && balanced(node.left) && balanced(node.right); 
    }
    public void display(){
        display(root, "root node: ");
    }
    public void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left,"left value of "+ node.value+" : ");
        display(node.right,"right value of "+ node.value+" : ");
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    public void prettyDisplay(Node node, int level){
        if (node == null){
            return;
        }
        prettyDisplay(node.right, level+1);
        if(level != 0){
            for(int i=0; i<level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.value);
        }else{
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level+1);
    }
    public static void main(String[] args){
        BST tree = new BST();
        int[] arr = {4,3,7,2,1,8,11,6,7};
        tree.populate(arr);
        System.out.println("Normal display of tree structure: ");
        tree.display();
        System.out.println("\n\n");
        System.out.println("pretty display of tree structure: ");
        tree.prettyDisplay();
        System.out.println("\n\n");
        System.out.println("Does tree is balanced: "+ tree.balanced());
        System.out.println();
        System.out.println("Tree height: "+ tree.Height());
        
        
    }
}