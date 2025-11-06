package copyfile;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {

    // Phương thức thực hiện sao chép file
    public static void copyFile(String sourcePath, String targetPath) {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra file nguồn có tồn tại không
        if (!sourceFile.exists()) {
            System.err.println("File nguồn không tồn tại!");
            return;
        }

        // Cảnh báo nếu file đích đã tồn tại
        if (targetFile.exists()) {
            System.err.println("File đích đã tồn tại! Hãy đổi tên hoặc xóa file đích trước khi chạy lại.");
            return;
        }

        // Thực hiện sao chép
        try (
                FileReader reader = new FileReader(sourceFile);
                BufferedReader bufferedReader = new BufferedReader(reader);
                FileWriter writer = new FileWriter(targetFile);
                BufferedWriter bufferedWriter = new BufferedWriter(writer)
        ) {
            String line;
            int charCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // xuống dòng
                charCount += line.length();
            }

            System.out.println("Sao chép thành công!");
            System.out.println("Tổng số ký tự trong file: " + charCount);

        } catch (IOException e) {
            System.err.println("Có lỗi xảy ra khi đọc hoặc ghi file!");
        }
    }

    // Hàm main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn file nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập đường dẫn file đích: ");
        String targetPath = scanner.nextLine();

        copyFile(sourcePath, targetPath);
    }
}
