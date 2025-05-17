package Week_07;

public class ThreadComparison {

    public static void main(String[] args) throws InterruptedException {

        long startNormal = System.nanoTime();

        Thread[] nt = new Thread[10];

        for (int i = 0; i < 10; i++) {
            nt[i] = new NormalThread();
            nt[i].start();
        }

        for (Thread t : nt) {
            t.join();
        }

        long endNormal = System.nanoTime();
        double normalTime = (endNormal - startNormal) / 1_000_000_000.0;

        long startSync = System.nanoTime();

        Thread[] st = new Thread[10];

        for (int i = 0; i < 10; i++) {
            st[i] = new SynchronizedThread();
            st[i].start();
        }

        for (Thread t : st) {
            t.join();
        }

        long endSync = System.nanoTime();
        double syncTime = (endSync - startSync) / 1_000_000_000.0;

        System.out.printf("Normal thread = %.9f seconds\n", normalTime);
        System.out.printf("Synchronized thread = %.9f seconds\n", syncTime);
    }
}

class NormalThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            int x = i * i;
        }
    }
}

class SynchronizedThread extends Thread {
    private static final Object lock = new Object();

    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 1000; i++) {
                int x = i * i;
            }
        }
    }
}
