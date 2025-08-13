package concurrent.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    private final static AtomicInteger atomicCount = new AtomicInteger(0);

    public static void main(String[] args) {
        try(ExecutorService executorService = Executors.newFixedThreadPool(5)) {
            for (int i = 1; i <= 10; i++) {
                executorService.submit(() -> System.out.println(atomicCount.incrementAndGet()));
            }
        }
    }

}
