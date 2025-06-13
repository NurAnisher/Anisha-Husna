package Assignment_2;

public class BankAccountMain {
    public static void main(String[] args) throws InterruptedException {

        BankAccountWithLock bank = new BankAccountWithLock(100);
        Thread t1 = new Thread(() -> bank.getBalance(), "Read Balance ");
        Thread t2 = new Thread(() -> bank.getBalance(), "Insufficient Funds ");

        Thread t3 = new Thread(() -> bank.deposit(35), "Amount Deposited ");
        Thread t4 = new Thread(() -> bank.withdraw(20), "Amount Withdraw ");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final balance : " + bank.getBalance());
    }
}
