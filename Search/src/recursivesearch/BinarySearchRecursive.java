package recursivesearch;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // bước 1: nhập mảng
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // bước 2: sắp xếp mảng tăng dần
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));

        // nhập giá trị cần tìm
        System.out.println("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();

        // bước 3-8: gọi hàm tìm kiếm nhị phân đệ quy
        int result = binarySearch(arr, 0, arr.length - 1, value);

        if (result == -1) {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng.");
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy tại chỉ số: " + result);
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        // Nếu left > right, nghĩa là không còn phần tử để tìm
        if (left > right) {
            return -1;
        }

        // Bước 4: Tính chỉ số giữa
        int middle = (left + right) / 2;

        // Bước 5: Nếu tìm thấy
        if (array[middle] == value) {
            return middle;
        }

        // Bước 6: Nếu giá trị cần tìm lớn hơn phần tử giữa
        if (array[middle] < value) {
            return binarySearch(array, middle + 1, right, value);
        }

        // Bước 7: Nếu giá trị cần tìm nhỏ hơn phần tử giữa
        return binarySearch(array, left, middle - 1, value);
    }
}
