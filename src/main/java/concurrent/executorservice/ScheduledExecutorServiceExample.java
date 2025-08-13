package concurrent.executorservice;

import java.util.concurrent.*;

public class ScheduledExecutorServiceExample {

    private static ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

    public static void main(String[] args) {
        //schedule();
        //scheduledWithFixedDelay();
        scheduledAtFixedDelay();
    }

    public static void schedule() {
        Future<String> future = scheduledExecutorService.schedule(() -> "A", 2, TimeUnit.SECONDS);
        try {
            System.out.println("Answer: " + future.get()); // block
        } catch(InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        } finally {
            scheduledExecutorService.shutdown();
        }
    }

    public static void scheduledWithFixedDelay() {
        scheduledExecutorService.scheduleWithFixedDelay(
                () -> System.out.println("Thread-id: " + Thread.currentThread().threadId()),
                2000, 300, TimeUnit.MILLISECONDS
        );

        // if we call shutdown(), nothing happens
        //scheduledExecutorService.shutdown();
    }

    public static void scheduledAtFixedDelay() {
        scheduledExecutorService.scheduleAtFixedRate(
                () -> System.out.println("Thread-id: " + Thread.currentThread().threadId()),
                2000, 300, TimeUnit.MILLISECONDS
        );

        // if we call shutdown(), nothing happens
        //scheduledExecutorService.shutdown();
    }

}
