public class QueueMain {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(5);
        queue.insert(10);
        queue.insert(12);
        queue.insert(15);
        queue.insert(17);
        queue.insert(199);
        
        queue.display();
        System.out.println(queue.front());
        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.front());

    }
}
