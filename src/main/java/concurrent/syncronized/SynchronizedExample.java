package concurrent.syncronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedExample {
    private int counter;
    private static int counterStatic;

    public void incrementA() {
        // Synchronize code block in method
        synchronized (this) {
            counter++;
        }
    }

    // Synchronize entire method
    public synchronized void incrementB() {
        counter++;
    }

    // Synchronize static method use the class instead of this
    public static void decrementA() {
        synchronized (SynchronizedExample.class) {
            counterStatic--;
        }
    }

    // Synchronize static method use the class instead of this
    public static synchronized void decrementB() {
        int c =  counterStatic;
        System.out.println("Before counterStatic = " + counterStatic + " " + Thread.currentThread().threadId());
        counterStatic = c - 1;
        System.out.println("After counterStatic = " + counterStatic + " " + Thread.currentThread().threadId());
    }

    public static void main(String[] args) {
        try(ExecutorService executorService = Executors.newFixedThreadPool(5)) {
            for (int i = 1; i <= 10; i++) {
                executorService.submit(SynchronizedExample::decrementB);
            }
        }
    }

}
