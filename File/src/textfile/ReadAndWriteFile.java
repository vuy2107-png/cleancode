package textfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    // Đọc file và trả về danh sách số nguyên
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                // Tách các số cách nhau bằng dấu cách
                String[] parts = line.split("\\s+");
                for (String p : parts) {
                    if (!p.trim().isEmpty()) {
                        numbers.add(Integer.parseInt(p.trim()));
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }
        return numbers;
    }

    // Ghi giá trị lớn nhất ra file result.txt
    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
            System.out.println("Đã ghi kết quả vào file: " + filePath);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file!");
        }
    }
}
