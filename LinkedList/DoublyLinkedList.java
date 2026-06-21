package LinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size =0;
    // Display the linkedList
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
     // Display the linkedList reverse
    public void displayrev(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            last = temp;
            temp = temp.next;
        }
        while(last != null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("end");
    }

    // Insert the value at first position
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }
    // insert the value at last
    public void insert(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            head = node;
            node.prev = null;
            node.next = null;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;
    }
    // Get a node if value is given 
    public Node getNode(int val){
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    // inserting value at any place after a given value of a node
    public void insert(int after, int value){
        Node p = getNode(after);
        if(p == null){
            System.out.println("does not exist!!!");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    
    private class Node{
        int val;
        Node next;
        Node prev;
        Node (int val){
            this.val = val;
        }
        Node (int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
