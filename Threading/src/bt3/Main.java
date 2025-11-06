package bt3;

public class Main {
    public static void main(String[] args) {
        Thread lazyThread = new Thread(new LazyPrimeFactorization());
        Thread optimizedThread = new Thread(new OptimizedPrimeFactorization());

        lazyThread.setName("Lazy Thread");
        optimizedThread.setName("Optimized Thread");

        lazyThread.start();
        optimizedThread.start();
    }
}
