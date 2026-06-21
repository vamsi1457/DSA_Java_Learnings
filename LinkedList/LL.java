package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    LL(){
        this.size = 0;
    }
    private class Node{
        private int value;
        Node next;
       public Node(int value){
            this.value = value;
        }
       public Node(int val, Node next){
            this.value = val;
            this.next = next;
        }
    }
    // QUESTIONS
//-------------------------------------------------------------------------------------------
        // removing duplicate values   leetcode:83
        public void duplicates(){
            Node node = head;
            while(node.next != null){
                if(node.value == node.next.value){
                    node.next = node.next.next;
                    size--;
                }else{
                    node = node.next;
                }
            }
            tail = node;
            tail.next = null;
        }

        // merge two sorted lists    leetcode: 21
        public  LL merge(LL first, LL second){
            Node f = first.head;
            Node s = second.head;
            LL ans = new LL();
            while(f != null && s != null){
                if(f.value < s.value){
                    ans.InsertLast(f.value);
                    f = f.next;
                }else{
                     ans.InsertLast(s.value);
                    s = s.next;
                }
            }
            while(f != null){
                ans.InsertLast(f.value);
                f=f.next;
            }
            while(s != null){
                ans.InsertLast(s.value);
                s = s.next;
            }
            return ans;
            
        }
        // Detect the cycle
        public boolean detectCycle(){
            Node f = head;
            Node s = head;
            while(f != null && f.next != null){
                f = f.next.next;
                s = s.next;
                if(f == s){
                    return true;
                }
            }
            return false;
        }
        // count of the detected cycle
        public int countCycle(Node head) {
            Node f = head;
            Node s = head;

            while (f != null && f.next != null) {
                f = f.next.next;
                s = s.next;
                if (f == s) {   // cycle detected
                    Node temp = s;
                    int length = 0;
                    do {
                        temp = temp.next;
                        length++;
                    } while (temp != s);  // FIXED CONDITION

                    return length;
                }
            }
            return 0;  // no cycle
        }
        // leetcode: 42 --> linked-list-cycle-2
        public Node Cyclestart(Node head){
            Node f = head;
            Node s = head;
            int count = 0;
            while(f != null && f.next != null){
                f = f.next.next;
                s = s.next;
                if(f == s){
                    // Find the length of the cycle
                     count = countCycle(s);
                    break;
                }
            }
            // create the two pointers at head
            Node first = head;
            Node second = head;
            if(count == 0){
                return null;
            }
            // Traverse the second pointer to the length of the cycle
            while(count<0){
                second = second.next;
                count--;
            }
            // Move the two pointers by one step iterativly 
            while(first != second){
                first = first.next;
                second = second.next;
            }
            // the both pointers meet at the start of the cylce
            return second;
        }
//---------------------------------------------------------------------------------------------------
    // Inserting a value at first position
    public void InsertFirst(int value){
         /* for example 
        we want to add 14 at first position
        3->5->6->7->null
        14 ->null
         */
        Node node = new Node(value);  // create a new node
        node.next = head;   
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    // Insert the element at last position
    public void InsertLast(int value){
        /* for example 
        we want to add 14 at first position
        3->5->6->7->null
        14 ->null
         */
        if(tail==null){
            InsertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    // Inserting a value at particular position
    public void InsertPosition(int val, int index){
        if(index == 0){
            InsertFirst(val);
            return;
        }
        if(index == size){
            InsertLast(val);
            return;
        }
        Node temp = head;
        for(int i =1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    // Delete the values at first
    public int DeleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }
    // Get the perticular node using index
    public Node get(int index){
        Node node = head;
        for(int i=0; i<index;i++){
            node = node.next;
        }
        return node;
    }
    // Delete the value at last
    public int DeleteLast(){
        if(size <=1){
           return DeleteFirst(); 
        }
        Node secondLastNode = get(size-2);
        int val = tail.value;
        tail = secondLastNode;
        tail.next = null;
        return val;
    }
    // Delete at particular position
    public int DeleteNode(int index){
        if(index == 0){
            return DeleteFirst();
        }
        if(index == size -1){
            return DeleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    // Returning a node using value
    public Node findNode(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Display the linkedList
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
    // insert using recursion
    public void insertrec(int val, int index){
        head = insertrec(val, index, head);
    }
    private Node insertrec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertrec(val, index-1, node.next);
        return node;

    }
    
}
