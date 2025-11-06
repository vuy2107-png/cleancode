package triangle;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        // Kiểm tra điều kiện không hợp lệ
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác phải lớn hơn 0!");
        }

        if ((side1 + side2 <= side3) ||
                (side1 + side3 <= side2) ||
                (side2 + side3 <= side1)) {
            throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại!");
        }

        // Nếu hợp lệ thì gán giá trị
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Tam giác có các cạnh: " + side1 + ", " + side2 + ", " + side3;
    }
}
