package generic;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    // Constructor
    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    // Thêm phần tử vào đỉnh stack
    public void push(T element) {
        stack.addFirst(element);
    }

    // Lấy phần tử trên cùng ra khỏi stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    // Kiểm tra stack có rỗng không
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Trả về kích thước stack
    public int size() {
        return stack.size();
    }

    // --- Kiểm thử với String ---
    public static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");

        System.out.println("1.1. Size of stack after push operations: " + stack.size());
        System.out.print("1.2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations: " + stack.size());
    }

    // --- Kiểm thử với Integer ---
    public static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.print("2.2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop());
        }
        System.out.println("\n2.3. Size of stack after pop operations: " + stack.size());
    }

    // --- Hàm main để chạy thử ---
    public static void main(String[] args) {
        stackOfStrings();
        stackOfIntegers();
    }
}
