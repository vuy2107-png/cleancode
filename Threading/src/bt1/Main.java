package bt1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread bắt đầu...");

        // Tạo 2 đối tượng Runnable
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        // Tạo 2 thread và gán Runnable tương ứng
        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        // Đặt độ ưu tiên (priority)
        thread1.setPriority(Thread.MIN_PRIORITY); // Ưu tiên thấp
        thread2.setPriority(Thread.MAX_PRIORITY); // Ưu tiên cao

        // Bắt đầu 2 thread
        thread1.start();
        thread2.start();

        System.out.println("Main thread kết thúc!");
    }
}
