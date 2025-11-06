package demo2;

public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

        System.out.println("Mảng ban đầu:");
        printArray(list);

        System.out.println("Bắt đầu sắp xếp");
        selectionSort(list);

        System.out.println("Mảng sau khi sắp xếp");
        printArray(list);
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double currentMin = list[i]; // giá trị nhỏ nhất hiện tại
            int currentMinIndex = i; // vị trí của giá trị nhỏ nhất

            System.out.println("\nBước " + (i + 1) + ": Giả sử phần tử nhỏ nhất là " + currentMin + " tại vị trí " + i);

            // tìm phần tử nhỏ nhất trong phần còn lại
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            System.out.println("Phần tử nhỏ nhất trong đoạn còn lại là " + currentMin + " tại vị trí " + currentMinIndex);

            //Đổi chỗ (nếu cần)
            if (currentMinIndex != i) {
                System.out.println("Đổi chỗ " + list[i] + " và " + list[currentMinIndex]);
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            } else {
                System.out.println("Không cần đổi chỗ vì phần tử đúng vị trí");
            }

            System.out.print("Mảng sau bước " + (i + 1) + ": ");
            printArray(list);
        }
    }

    // Hàm in mảng
    public static void printArray(double[] list) {
        for (double v : list) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
