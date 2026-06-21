package Trees;

public class SegmentTree {
    class Node{
        int value;
        int start;
        int end;
        Node left;
        Node right;
        Node(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    Node root;
    public SegmentTree(int[] arr){
        root = build(arr, 0, arr.length-1);
    }
    // build a tree
    private Node build(int[] arr, int start, int end){
        Node node = new Node(start, end);
        if(start == end){
            node.value = arr[start];
            return node;
        }
        int mid = start + (end - start)/2;
        node.left = build(arr, start, mid);
        node.right = build(arr, mid+1, end);
        node.value = node.left.value + node.right.value;
        return node;
    }
    public int query(int l, int r){
        return query(root, l, r);
    }
    private int query(Node node, int l, int r) {
        // No overlap
        if (node.end < l || node.start > r) {
            return 0;
        }

        // Complete overlap
        if (node.start >= l && node.end <= r) {
            return node.value;
        }

        // Partial overlap
        return query(node.left, l, r) + query(node.right, l, r);
    }
    // update leaf
     public void update(int index, int val) {
        update(root, index, val);
    }

    private void update(Node node, int index, int val) {
        // Leaf
        if (node.start == node.end) {
            node.value = val;
            return;
        }

        int mid = node.start + (node.end - node.start) / 2;

        if (index <= mid) {
            update(node.left, index, val);
        } else {
            update(node.right, index, val);
        }

        node.value = node.left.value + node.right.value;
    }

    // Debug print
    public void printTree() {
        printTree(root);
    }

    private void printTree(Node node) {
        if (node == null) return;

        printTree(node.left);
        System.out.println("[" + node.start + "," + node.end + "] -> " + node.value);
        printTree(node.right);
    }
    // Pretty print (rotated tree)
public void prettyPrint() {
    prettyPrint(root, 0);
}

private void prettyPrint(Node node, int level) {
    if (node == null) return;

    // First print right subtree
    prettyPrint(node.right, level + 1);

    // Print current node with indentation
    if (level != 0) {
        for (int i = 0; i < level - 1; i++) {
            System.out.print("|\t");
        }
        System.out.println("|---- [" + node.start + "," + node.end + "] -> " + node.value);
    } else {
        System.out.println("[" + node.start + "," + node.end + "] -> " + node.value);
    }

    // Then print left subtree
    prettyPrint(node.left, level + 1);
}
    public static void main(String[] args) {

    int[] nums = {2, 1, 5, 3, 4};

    // Build tree
    SegmentTree tree = new SegmentTree(nums);

    // Pretty print initial tree
    System.out.println("Initial Segment Tree:");
    tree.prettyPrint();

    // Perform queries
    System.out.println("\nQuery (0,4): " + tree.query(0, 4)); // total sum
    System.out.println("Query (1,3): " + tree.query(1, 3));   // 1+5+3 = 9
    System.out.println("Query (2,4): " + tree.query(2, 4));   // 5+3+4 = 12

    // Update operation
    System.out.println("\nUpdating index 2 to 10...");
    tree.update(2, 10);

    // Print tree after update
    System.out.println("\nSegment Tree After Update:");
    tree.prettyPrint();

    // Queries after update
    System.out.println("\nQuery (0,4): " + tree.query(0, 4)); // updated total
    System.out.println("Query (1,3): " + tree.query(1, 3));   // 1+10+3 = 14
    System.out.println("Query (2,4): " + tree.query(2, 4));   // 10+3+4 = 17
}
}
