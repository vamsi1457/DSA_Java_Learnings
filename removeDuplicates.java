public class removeDuplicates {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    static Node removeduplicates(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
         Node node = head;
            while(node.next != null){
                if(node.val == node.next.val){
                    node.next = node.next.next;
                    
                }else{
                    node = node.next;
                }
            }
            
            node.next = null;
        return head;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5,5,5,6};
        printList(removeduplicates(arr));
    }
}
