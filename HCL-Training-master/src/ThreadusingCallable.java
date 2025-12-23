import java.util.concurrent.*;

class ThreadDemo1 implements Callable<String> {

    @Override
    public String call() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "Hello World - " + Thread.currentThread().getName();
    }
}

public class ThreadusingCallable {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            Future<String> future = executor.submit(new ThreadDemo1());

            // get() blocks until result is available
            System.out.println(future.get());
        }

        executor.shutdown();
        System.out.println("In main Method");
    }
}
