package Trees;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
}
public class IsSymmetry {
     public static boolean isSymmetric(TreeNode root){
          if(root == null){
               return false;
          }
          return helper(root.left, root.right);
     }
     private static boolean helper(TreeNode left, TreeNode right){
           if(left == null && right == null){
               return true;
          }
          if(left.val != right.val){
               return false;
          }
          
          if(left == null || right == null){
               return false;
          }
          return helper(left.left, right.right) && helper(right.right, left.right);

     }
     public static void main(String[] args) {
          // Constructing tree:
    //        1
    //       / \
    //      2   3
    //     / \   \
    //    4   5   6

          TreeNode root = new TreeNode(1);
          root.left = new TreeNode(2);
          root.right = new TreeNode(2);
          
          System.out.println(isSymmetric(root));
     }
}