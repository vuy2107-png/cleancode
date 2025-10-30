package longest;

import java.util.Scanner;

public class LongestIncreasingSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String result = findLongestIncreasingSubstring(input);
        System.out.println("Chuỗi tăng dần có độ dài lớn nhất: " + result);
    }

    private static String findLongestIncreasingSubstring(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        String maxSub = "";
        String currentSub = "" + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (curr > prev) {
                currentSub += curr;
            } else {
                if (currentSub.length() > maxSub.length()) {
                    maxSub = currentSub;
                }
                currentSub = "" + curr;
            }
        }

        if (currentSub.length() > maxSub.length()) {
            maxSub = currentSub;
        }
        return maxSub;
    }
}
