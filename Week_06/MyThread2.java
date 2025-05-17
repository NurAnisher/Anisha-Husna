package Week_06;
import java.io.IOException;
public class MyThread2 extends Thread {
        private volatile boolean running = true;

        public void run () {

            while (running) {

                System.out.println("Thread is running...");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Thread stopped.");
        }

        public void shutdown () {
            running = false;
        }
    }
    class MyVolatile {
        public static void main(String[] args) {

            MyThread2 thread = new MyThread2();
            thread.start();

            System.out.println("Press ENTER to stop the thread...");

            try {
                System.in.read();
            }

            catch (IOException e) {
                e.printStackTrace();
            }

            thread.shutdown();
    }
}
