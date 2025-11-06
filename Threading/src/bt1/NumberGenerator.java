package bt1;

public class NumberGenerator implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Number: " + i + " - HashCode: " + this.hashCode());
                Thread.sleep(500); //Dừng 0,5 giây mỗi lần in
            }
        } catch (InterruptedException e) {
            System.out.println("Thread bị gián đoạn");
        }
    }
}
