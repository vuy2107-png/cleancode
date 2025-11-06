public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    public RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Runing " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Dừng vòng lặp trong 50 ms
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {

        }
    }
}
