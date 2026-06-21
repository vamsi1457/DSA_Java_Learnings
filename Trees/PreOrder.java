package Trees;

import java.util.ArrayList;

public class PreOrder {

    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }
    Node root;
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public ArrayList<Integer> ListPreorder(){
       return ListPreorder(root);
    }
    private ArrayList<Integer> ListPreorder(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        if(node == null){
            return list;
        }
        list.add(node.value);
        list.addAll(ListPreorder(node.left));
        list.addAll(ListPreorder(node.right));
        return list;
    }

    public static void main(String[] charan) {
        PreOrder tree = new PreOrder();
        // Manually creating tree
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        
        PreOrder.Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);

        tree.root = root;

        // Print preorder traversal
        System.out.println("Preorder Traversal:");
        tree.preorder();

        // Get preorder as list
        System.out.println("\nPreorder List:");
        System.out.println(tree.ListPreorder());
    }


}