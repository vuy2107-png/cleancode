package bubblesort;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8}; // Mảng ban đầu

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        // Thuật toán sắp xếp nổi bọt
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // So sánh hai phần tử liền kề
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi nếu phần tử trước lớn hơn phần tử sau
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // In mảng sau mỗi vòng lặp để thấy quá trình sắp xếp
            System.out.print("Sau lần lặp " + (i + 1) + ": ");
            printArray(arr);
        }

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

    // Hàm in mảng ra màn hình
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
//Mảng ban đầu: [5, 1, 4, 2, 8]
//
//Lần lặp 1:
//So sánh 5 và 1 → Hoán đổi [1, 5, 4, 2, 8]
//So sánh 5 và 4 → Hoán đổi [1, 4, 5, 2, 8]
//So sánh 5 và 2 → Hoán đổi [1, 4, 2, 5, 8]
//So sánh 5 và 8 → Giữ nguyên [1, 4, 2, 5, 8]
//
//Lần lặp 2:
//So sánh 1 và 4 → Giữ nguyên [1, 4, 2, 5, 8]
//So sánh 4 và 2 → Hoán đổi [1, 2, 4, 5, 8]
//So sánh 4 và 5 → Giữ nguyên [1, 2, 4, 5, 8]
//
//        → Mảng đã được sắp xếp: [1, 2, 4, 5, 8]

// Giải thích ngắn gọn để thuyết trình:
//
//So sánh từng cặp phần tử liền kề.
//
//Nếu phần tử trước lớn hơn, thì đổi chỗ.
//
//Sau mỗi vòng lặp, phần tử lớn nhất sẽ “nổi lên trên” (ở cuối mảng).
//
//Lặp lại đến khi mảng được sắp xếp.