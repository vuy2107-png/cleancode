package mylinked;

public class MyLinkedList<E> implements Cloneable {
    private Node<E> head;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    // Constructor có phần tử đầu tiên
    public MyLinkedList(E element) {
        head = new Node<>(element);
        numNodes++;
    }

    // Thêm phần tử vào vị trí index
    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        if (index == 0) {
            addFirst(element);
            return;
        }

        Node<E> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node<E> newNode = new Node<>(element);
        newNode.next = temp.next;
        temp.next = newNode;
        numNodes++;
    }

    // Thêm phần tử vào đầu danh sách
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    // Thêm phần tử vào cuối danh sách
    public void addLast(E element) {
        if (head == null) {
            addFirst(element);
            return;
        }

        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node<>(element);
        numNodes++;
    }

    // Xóa phần tử tại vị trí index
    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        Node<E> temp = head;
        if (index == 0) {
            E data = head.data;
            head = head.next;
            numNodes--;
            return data;
        }

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        E data = temp.next.data;
        temp.next = temp.next.next;
        numNodes--;
        return data;
    }

    // Xóa phần tử theo giá trị
    public boolean remove(Object o) {
        if (head == null) return false;

        if (head.data.equals(o)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node<E> temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(o)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Lấy phần tử tại vị trí index
    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Kiểm tra danh sách có chứa phần tử hay không
    public boolean contains(E o) {
        Node<E> temp = head;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Trả về vị trí của phần tử trong danh sách
    public int indexOf(E o) {
        Node<E> temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    // Sao chép danh sách
    @Override
    public MyLinkedList<E> clone() {
        MyLinkedList<E> cloneList = new MyLinkedList<>();
        Node<E> temp = head;
        while (temp != null) {
            cloneList.addLast(temp.data);
            temp = temp.next;
        }
        return cloneList;
    }

    // Trả về số phần tử trong danh sách
    public int size() {
        return numNodes;
    }

    // In danh sách
    public void printList() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Lớp Node nội bộ
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }
}

