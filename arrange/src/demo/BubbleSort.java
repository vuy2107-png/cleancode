package demo;

public class BubbleSort {
    // Hàm sắp xếp nổi bọt
    public static void bubbleSort(int[] arr) {
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
            // In mảng sau mỗi vòng lặp để quan sát quá trình sắp xếp
            System.out.print("Sau lần lặp " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    // Hàm in mảng ra màn hình
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

