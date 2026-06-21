package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

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

 public class levelOrder {
    public List<List<Integer>> levelorder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            
            int levelsize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelsize);
            for(int i=0; i<levelsize; i++){
                TreeNode currentNode = queue.poll();
                
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
    public static void main(String[] args) {
    levelOrder obj = new levelOrder();

    // Constructing tree:
    //        1
    //       / \
    //      2   3
    //     / \   \
    //    4   5   6

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(6);

    List<List<Integer>> result = obj.levelorder(root);

    System.out.println(result);
    }
}