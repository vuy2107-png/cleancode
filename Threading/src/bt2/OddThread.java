package bt2;

public class OddThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Odd: " + i);
                Thread.sleep(10); // dừng 10ms
            }
        } catch (InterruptedException e) {
            System.out.println("OddThread bị gián đoạn");
        }
    }
}
