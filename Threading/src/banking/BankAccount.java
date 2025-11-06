package banking;

public class BankAccount {
    private int balance = 1000;

    // Đồng bộ hóa
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " đang rút tiền...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " rút tiền thành công. Số dư còn lại: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " không đủ tiền để rút!");
        }
    }

    public int getBalance() {
        return balance;
    }
}
