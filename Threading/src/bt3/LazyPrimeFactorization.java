package bt3;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                System.out.println("LazyPrimeFactorization found: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {  // kiểm tra hết từ 2 đến n-1
            if (n % i == 0) return false;
        }
        return true;
    }
}
