package nodequeue;

public class Solution {
    private Queue q = new Queue();

    public void enQueue(int data) {
        Node temp = new Node(data);

        if (q.front == null) {
            q.front = temp;
            q.rear = temp;
            q.rear.link = q.front;
        } else {
            q.rear.link =temp;
            q.rear = temp;
            q.rear.link = q.front;
        }
    }

    public void deQuere() {
        if (q.front == null) {
            System.out.println("Hàng đợi rỗng!");
            return;
        }

        if (q.front == q.rear) {
            q.front = null;
            q.rear = null;
        } else {
            q.front = q.front.link;
            q.rear.link = q.front;
        }
    }

    public void displayQueue() {
        if (q.front == null) {
            System.out.println("Hàng đợi rỗng!");
            return;
        }

        Node temp = q.front;
        System.out.print("Các phần tử trong hàng đợi: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != q.front);
        System.out.println();
    }
}
