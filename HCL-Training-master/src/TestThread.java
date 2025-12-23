import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // static method
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello World - " + Thread.currentThread().getName());
    }
}

public class TestThread {

    public static void main(String[] args) {

        // Normal method
//        for (int i = 0; i < 5; i++) {
//            Thread t = new Thread(new ThreadDemo());
//            t.start();
//
//        }

        // modern method using executor service

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            executor.submit(new ThreadDemo()); // submit task
        }

        executor.shutdown();
        System.out.println("In main Method");
    }
}
