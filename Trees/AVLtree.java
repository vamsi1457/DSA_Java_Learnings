package Trees;

public class AVLtree {
    class Node {
        int value;
        int height;
        Node right;
        Node left;
        Node(int value){
            this.value = value; 
        }
    }
    Node root;
    public boolean isEmpty(){
        return root == null;
    }
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public void populate(int[] arr){
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
    }
    // pretty display
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
    // Normal insert
     public void normalinsert(int value){
        root = normalinsert(root, value);
    }
    public Node normalinsert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
          node.left =  normalinsert(node.left, value);
        }
        if(value > node.value){
           node.right = normalinsert(node.right, value);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        return node;
    }
    public void normalpopulate(int[] arr){
        for(int i=0; i<arr.length; i++){
            normalinsert(arr[i]);
        }
    }
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right)) <=1 && balanced(node.left) && balanced(node.right); 
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
            node.left = insert(node.left, value);
        }
        if(value > node.value){
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        return rotate(node);
    }
    public Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            // left heavy tree
            if(height(node.left.left)- height(node.left.right)>0){
                // left-left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right)<0){
                // left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left) - height(node.right) < -1){
            // right heavy case
            if(height(node.right.left) - height(node.right.right) < 0){
                // Right-right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                // right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;
        c.height = Math.max(height(c.left), height(c.right))+1;
        p.height = Math.max(height(p.left), height(p.right))+1;
        return c;
    }
    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        c.height = Math.max(height(c.left), height(c.right))+1;
        p.height = Math.max(height(p.left), height(p.right))+1;
        return p;
    }

    public static void main(String[] args) {
        AVLtree tree = new AVLtree();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Normal binary search tree: ");
        tree.normalpopulate(arr);
        tree.prettyDisplay();
        System.out.println("\n\n");
        System.out.println("AVL tree: ");
        tree.populate(arr);
        tree.prettyDisplay();


    }
}
