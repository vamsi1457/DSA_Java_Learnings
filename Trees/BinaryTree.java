package Trees;

import java.util.Scanner;

public class BinaryTree {
     class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }
    Node root;
    public void populate(Scanner sc){
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }
    public void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left to of "+ node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of left of "+ node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of right of "+ node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }
    // public void display(){
    //     display(root, "");
    // }
    // public void display(Node node, String indent){
    //     if(node == null){
    //         return;
    //     }
    //     System.out.println(indent+node.value);
    //     display(node.left, indent+"\t");
    //     display(node.right, indent+"\t");
    // }
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
    // preorder prints node ---> left ---> right
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value+"->");
        preOrder(node.left);
        preOrder(node.right);
    }
    // In order prints left ---> node ---> right
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+"->");
        inOrder(node.right);
    }
    // postorder prints left ---> right ---> node
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+"->");
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BinaryTree tree = new BinaryTree();
    tree.populate(sc);   // build tree from user input
    System.out.println("\nTree Structure:");
    //tree.display();      // display the tree
    //tree.prettyDisplay();
    System.out.println("preOrder tree: \n");
    tree.preOrder();
    System.out.println("inOrder tree: \n");
    tree.inOrder();
    System.out.println("postOrder tree: \n");
    tree.postOrder();
}
}
