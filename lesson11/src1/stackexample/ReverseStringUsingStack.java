package stackexample;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String sentence = "Hello Java Stack Example";
        System.out.println("Chuỗi ban đầu:");
        System.out.println(sentence);

        String reversed = reverseWords(sentence);
        System.out.println("Chuỗi sau khi đảo:");
        System.out.println(reversed);
    }

    public static String reverseWords(String str) {
        Stack<String> stack = new Stack<>();
        String[] words = str.split(" ");

        // Đưa từ vào stack
        for (String word : words) {
            stack.push(word);
        }

        // Lấy ra để đảo ngược
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            if (!stack.isEmpty()) reversed.append(" ");
        }

        return reversed.toString();
    }
}
