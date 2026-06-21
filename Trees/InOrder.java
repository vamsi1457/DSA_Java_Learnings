package Trees;
import java.util.ArrayList;
import java.util.List;
public class InOrder {
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }
    Node root;
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }
    public List<Integer> ListInorder(){
        return helper(root); 
    }
    private List<Integer> helper(Node node){
        List<Integer> list = new ArrayList<>();
        if(node == null){
            return list;
        }
        list.addAll(helper(node.left));
        list.add(node.value);
        list.addAll(helper(node.right));
        return list;
    }
    public static void main(String[] args) {
         InOrder tree = new InOrder();
        // Manually creating tree
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        
        InOrder.Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);

        tree.root = root;

        // Print preorder traversal
        System.out.println("Preorder Traversal:");
        tree.inOrder();

        // Get preorder as list
        System.out.println("\nPreorder List:");
        System.out.println(tree.ListInorder());
    }
}
