package textfile;
import java.util.List;

public class FindMaxValue {

    // Tìm giá trị lớn nhất trong danh sách
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String inputPath = "D:\\Module2\\File\\student.txt";  // File bạn có sẵn
        String outputPath = "D:\\Module2\\File\\result.txt";  // File kết quả

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(inputPath);

        if (numbers.isEmpty()) {
            System.err.println("File trống hoặc không đọc được dữ liệu!");
            return;
        }

        int maxValue = findMax(numbers);
        System.out.println("Giá trị lớn nhất là: " + maxValue);

        readAndWriteFile.writeFile(outputPath, maxValue);
    }
}
