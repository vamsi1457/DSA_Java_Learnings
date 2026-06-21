package LinkedList;

public class mergeTwoSortedLists {
   static public class ListNode {
     int val;
    ListNode next;
     ListNode() {}
      ListNode(int val){
         this.val = val; 
        }
     ListNode(int val, ListNode next) { 
        this.val = val; this.next = next;
     }
  } 
  static void printList(ListNode head){
    while (head != null) {
        System.out.print(head.val+" -> ");
        head = head.next;
    }
    System.out.println("null"); 
  }
    // For leetcode
    public static ListNode mergelist(ListNode l1, ListNode l2){
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while(l1 != null & l2 != null){
            if(l1.val<=l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        while(l1 != null){
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
        }
        while(l2 != null){
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }
        return head.next;
        
    }
    public static void main(String[] args) {
        // LL list1 = new LL();
        // LL list2 = new LL();
        
        // list1.InsertLast(1);
        // list1.InsertLast(3);
        // list1.InsertLast(5);
        // list2.InsertLast(1);
        // list2.InsertLast(2);
        // list2.InsertLast(9);
        // list2.InsertLast(14);
        // LL ans = new LL();

        // ans = ans.merge(list1, list2);
        // ans.display();
        ListNode l1 = new ListNode(-9);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(10);
        printList(l1);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(22);
        l2.next.next = new ListNode(11);
        printList(l2);
        ListNode mergee = mergelist(l1, l2);
        printList(mergee);
    }
}
