package virtualthreads;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Virtual threads were previewed in Java 19 and finalized in 21
 * They are much cheaper than OS Threads and scales a lot better
 */
public class VirtualThreadsExample {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try(var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 2_000_000).forEach(i -> {
                executor.submit(() -> {
                    // Simulate a task doing a blocking call...
                    Thread.sleep(Duration.ofSeconds(1));
                    return i;
                });
            });
        }
        long stop = System.currentTimeMillis();
        System.out.println("Total time taken: " + (stop - start));
    }

}
