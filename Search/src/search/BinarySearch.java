package search;

public class BinarySearch {
    // Bước 1: Mảng số nguyên được sắp xếp tăng dần
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    // Bước 2: Cài đặt phương thức tìm kiếm nhị phân
    static int binarySearch(int[] list, int key) {
        int low = 0;                  // chỉ số bắt đầu
        int high = list.length - 1;   // chỉ số kết thúc

        while (high >= low) {
            int mid = (low + high) / 2; // tìm vị trí giữa

            if (key < list[mid]) {
                high = mid - 1;         // tìm bên trái nếu nhỏ hơn
            } else if (key == list[mid]) {
                return mid;              // tìm thấy trả về chỉ số
            } else {
                low = mid + 1;           // tìm bên phải nếu lớn hơn
            }
        }

        return -1; // không tìm thấy
    }

    // Bước 3: Hàm main để kiểm thử
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));   // 0
        System.out.println(binarySearch(list, 11));  // 4
        System.out.println(binarySearch(list, 79));  // 12
        System.out.println(binarySearch(list, 1));   // -1
        System.out.println(binarySearch(list, 5));   // -1
        System.out.println(binarySearch(list, 80));  // -1
    }
}
