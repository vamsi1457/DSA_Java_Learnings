package Trees;

 class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
  }
public class FlattenTree {
    public static void flatten(TreeNode root){
        TreeNode current = root;
        while(current != null){
            if(current.left != null){
                TreeNode temp = current.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
            
        }
    }
        static void printTree(TreeNode root, int space) {
        if (root == null) return;

        space += 5; // spacing between levels

        // Print right child first
        printTree(root.right, space);

        // Print current node
        System.out.println();
        for (int i = 5; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println(root.val);

        // Print left child
        printTree(root.left, space);
    }
    public static void main(String[] args) {
         TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
            flatten(root);
            printTree(root, 0);

    }
}
