package bt2;

public class EvenThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even: " + i);
                Thread.sleep(15); // dừng 15ms
            }
        } catch (Exception e) {
            System.out.println("EvenThread bị gián đoạn");
        }
    }
}
