package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.InsertFirst(1);
        list.InsertFirst(2);
        list.InsertFirst(3);
        list.InsertFirst(4);
        list.InsertFirst(5);
        // list.InsertFirst(6);
        // list.InsertLast(99);
        // list.InsertPosition(7, 3);
        // list.display();
        // System.out.println("Deleted at first: "+list.DeleteFirst());
        // list.display();
        // System.out.println("Deleted at last: "+list.DeleteLast());
        // list.display();

        // DoublyLinkedList list = new DoublyLinkedList();
        // list.insertFirst(3);
        // list.insertFirst(6);
        // list.insertFirst(8);
        // list.insertFirst(11);
        // list.insertFirst(9);
        // list.insertFirst(13);
        // list.insert(99);
        // list.insert(11, 22);
        // list.display();
        // list.displayrev();

        // CircularLinkedList list = new CircularLinkedList();
        // list.insert(1);
        // list.insert(2);
        // list.insert(13);
        // list.insert(44);
        // list.insert(12);
        // list.insert(17);
        // list.display();
        // list.Delete(44);
        // list.display();
        
        list.display();
        list.insertrec(45,3);
        list.display();

    }

  
}
