package filetext;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {

    // Ghi sẵn vài số nguyên vào file student.txt
    public static void createSampleFile(String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write("5\n");
            writer.write("10\n");
            writer.write("7\n");
            writer.write("3\n");
            writer.close();
            System.out.println("Đã tạo file " + filePath + " với dữ liệu mẫu thành công!");
        } catch (IOException e) {
            System.err.println("Lỗi khi tạo file mẫu!");
        }
    }

    // Đọc file và tính tổng
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            // Kiểm tra nếu file không tồn tại thì ném ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            System.out.println("\nNội dung file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("=> Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\Module2\\File\\student.txt"; // đường dẫn file của bạn

        // Tạo file mẫu nếu cần
        createSampleFile(path);

        // Đọc và tính tổng
        ReadFileExample example = new ReadFileExample();
        example.readFileText(path);
    }
}
