package Trees;
import java.util.ArrayList;
import java.util.Deque;
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
  
 public class levelOrderAverage {
    public List<Double> levelorderavg(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            
            int levelsize = queue.size();
            double currentvalue = 0;
            for(int i=0; i<levelsize; i++){
                TreeNode currentNode = queue.poll();
                
                currentvalue += currentNode.val;
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
            result.add(currentvalue);
        }
        return result;
    }
    public int findSuccessor(TreeNode root, int key){
        if(root == null){
            return -1;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
            if(currentNode.val == key){
                break;
            }
        }
        return queue.peek().val;

    }
    public List<List<Integer>> zigzaglevelorder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean reverse = false;
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<level; i++){
                if(!reverse){
                    TreeNode currentNode = queue.pollFirst();
                    list.add(currentNode.val);
                    if(currentNode.left != null){
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right != null){
                        queue.addLast(currentNode.right);
                    }
                }else{
                    TreeNode currentNode = queue.pollLast();
                    list.add(currentNode.val);
                    if(currentNode.right != null){
                        queue.addFirst(currentNode.right);
                    }
                    if(currentNode.left != null){
                        queue.addFirst(currentNode.left);
                    }
                }
                
            }
            reverse = !reverse;
            result.add(list);
            
        }
        return result;
    }
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
    levelOrderAverage obj = new levelOrderAverage();

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

    List<Double> result = obj.levelorderavg(root);

    System.out.print("Average of level: ");
    System.out.println(result);
    System.out.print("Successor of an element in levelOrder: ");
    System.out.println(obj.findSuccessor(root, 4));
    System.out.print("LevelOrder: ");
    System.out.println(obj.levelorder(root));
    System.out.print("Zigzag LevelOrder: ");
    System.out.println(obj.zigzaglevelorder(root));
}
}