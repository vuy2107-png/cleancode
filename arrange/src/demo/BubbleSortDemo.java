package demo;


public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8}; // Mảng ban đầu

        System.out.println("Mảng ban đầu:");
        BubbleSort.printArray(arr);

        // Gọi hàm sắp xếp
        BubbleSort.bubbleSort(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        BubbleSort.printArray(arr);
    }
}

