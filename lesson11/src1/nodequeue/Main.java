package nodequeue;

public class Main {
    public static void main(String[] args) {
        Solution queue = new Solution();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.displayQueue();

        queue.deQuere();
        queue.deQuere();
        queue.displayQueue();
    }
}
