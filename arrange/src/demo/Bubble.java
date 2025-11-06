package demo;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 2, 5,};

        System.out.println("Mảng ban đầu");
        printArr(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Sau mỗi lần lặp " + (i + 1) + ":");
            printArr(arr);
        }
        System.out.println("Mảng sau khi sắp xếp:");
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
