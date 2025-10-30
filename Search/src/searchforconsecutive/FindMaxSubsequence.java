package searchforconsecutive;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxSubsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>(); // lưu chuỗi tăng dần lớn nhất

        // Duyệt từng vị trí trong chuỗi
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>(); // danh sách tạm thời
            list.add(string.charAt(i)); // thêm ký tự hiện tại

            for (int j = i + 1; j < string.length(); j++) {
                // nếu ký tự sau lớn hơn ký tự cuối cùng trong list
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j)); // thêm vào list
                }
            }

            // nếu list tạm dài hơn list max thì cập nhật max
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        // In kết quả ra màn hình
        System.out.print("Chuỗi tăng dần lớn nhất: ");
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
