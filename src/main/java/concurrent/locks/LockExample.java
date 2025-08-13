package concurrent.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private static int counter = 0;
    private static final Lock lock = new ReentrantLock();

    public static void addCounter() {
        try {
            lock.lock(); // blocking call
            int c =  counter;
            System.out.println("Before counter = " + counter + " Thread-id: " + Thread.currentThread().threadId());
            counter = c + 1;
            System.out.println("After counter = " + counter + " Thread-id: " + Thread.currentThread().threadId());
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> addCounter()).start();
        }
    }

}
