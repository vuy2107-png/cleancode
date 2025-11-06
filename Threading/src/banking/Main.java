package banking;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "Người 1");
        Thread t2 = new Thread(() -> account.withdraw(700), "Người 2");

        t1.start();
        t2.start();
    }
}
