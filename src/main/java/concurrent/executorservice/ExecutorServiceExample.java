package concurrent.executorservice;

import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) {

        try(ExecutorService es = Executors.newSingleThreadExecutor()) {
            // Lambda
            es.execute(() -> System.out.println("Hello from: " + Thread.currentThread().getName()));

            // Runnable
            es.execute(new RunnableTask());

            // Callable
            Future<String> res = es.submit(new CallableTask());
            try {
                System.out.println("The answer is: " + res.get(500, TimeUnit.MILLISECONDS));
            } catch(InterruptedException | ExecutionException | TimeoutException e) {
                System.out.println(e.getMessage());
            }

            // shutdown no longer needed because of try-with-resources
            // ex.shutdown();
        }
    }

}
