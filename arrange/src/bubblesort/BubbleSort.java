package bubblesort;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    // cài đặt phương thức sắp xếp nổi bọt
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;

            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }

            if (!needNextPass) {
                System.out.println("Mảng đã được sắp xếp sau " + k + " lượt.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu:");
        for (int n : list) {
            System.out.print(n + " ");
        }

        bubbleSort(list);

        System.out.println("\nMảng sau khi sắp xếp:");
        for (int n : list) {
            System.out.print(n + " ");
        }
    }
}
