package Trees;
import java.util.ArrayList;
public class PostOrder {
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }
    Node root;
    public void Postorder(){
        posthelper(root);
    }
    private void posthelper(Node node){
        if(node == null){
            return;
        }
        posthelper(node.left);
        posthelper(node.right);
        System.out.print(node.value+" ");
    }
    public ArrayList<Integer> listpostorder(){
        return listhelper(root);
    }
    private  ArrayList<Integer> listhelper(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        if(node == null){
            return list;
        }
        list.addAll(listhelper(node.left));
        list.addAll(listhelper(node.right));
        list.add(node.value);
        return list;
        
    }
    public static void main(String[] args) {
         PostOrder tree = new PostOrder();
        // Manually creating tree
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        
        PostOrder.Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);

        tree.root = root;

        // Print preorder traversal
        System.out.println("Preorder Traversal:");
        tree.Postorder();

        // Get preorder as list
        System.out.println("\nPreorder List:");
        System.out.println(tree.listpostorder());
    }
}
