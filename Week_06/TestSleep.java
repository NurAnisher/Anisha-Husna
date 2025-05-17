package Week_06;

public class TestSleep {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
                Thread t = new MyThread2();
                t.start();

                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}

class MyThread extends Thread {
    int threadNumber;
    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    public void run() {
        System.out.println("Thread " + threadNumber + " started");
        System.out.println("ONE");
        System.out.println("TWO");
        System.out.println("THREE");
        System.out.println("xxxxxxxxxxx");
    }
}
