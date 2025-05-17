package Week_06;

import org.example.Multithreading;

public class MultiplicationThread extends Thread {

    private int num;
    public MultiplicationThread(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 3 ; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + num + " * " + i + " = " + (num * i));
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class MultiThreading {
    public static void main(String[] args) {
        for (int i =1; i <= 3; i++) {
            Thread thread = new MultiplicationThread(i);
            thread.setName("Thread- " + (i-1));
            thread.start();
        }
    }
}


