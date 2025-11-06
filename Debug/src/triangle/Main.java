package triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh 1: ");
            double side1 = scanner.nextDouble();

            System.out.print("Nhập cạnh 2: ");
            double side2 = scanner.nextDouble();

            System.out.print("Nhập cạnh 3: ");
            double side3 = scanner.nextDouble();

            // Tạo đối tượng Triangle (có thể ném lỗi)
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println(triangle);

        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage()); // In ra thông báo lỗi tùy chỉnh
        } catch (Exception e) {
            System.err.println("Lỗi không xác định: " + e.getMessage());
        }
    }
}
