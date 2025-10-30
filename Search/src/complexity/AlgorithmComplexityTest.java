package complexity;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // {1} Tạo mảng đếm tần suất 255 ký tự ASCII
        int[] frequentChar = new int[255];

        // {2} Duyệt chuỗi và đếm số lần xuất hiện của mỗi ký tự
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = (int) inputString.charAt(i); // {3} Chuyển ký tự sang mã ASCII
            frequentChar[ascii] += 1;                // {4} Tăng giá trị tần suất
        }

        // {5}, {6} Khởi tạo biến theo dõi ký tự có tần suất cao nhất
        int max = 0;
        char character = (char) 255; // empty char

        // {7} Duyệt qua toàn bộ bảng ASCII
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {  // {8}
                max = frequentChar[j];    // {9}
                character = (char) j;     // {10}
            }
        }

        System.out.println("The most appearing letter is '" + character +
                "' with a frequency of " + max + " times");
    }
}
