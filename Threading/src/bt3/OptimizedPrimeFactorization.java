package bt3;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                System.out.println("OptimizedPrimeFactorization found: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {  // chỉ duyệt tới căn bậc hai
            if (n % i == 0) return false;
        }
        return true;
    }
}
