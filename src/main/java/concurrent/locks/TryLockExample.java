package concurrent.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {
    private static int counter = 0;
    private static final Lock lock = new ReentrantLock();

    public static void attemptToAddCounter() {
        if (lock.tryLock()) {
            try {
                //lock.lock(); // blocking call
                int c = counter;
                System.out.println("Got the Lock. Before counter = " + counter + " Thread-id: " + Thread.currentThread().threadId());
                counter = c + 1;
                System.out.println("Got the Lock. After counter = " + counter + " Thread-id: " + Thread.currentThread().threadId());
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Failed to acquire lock!"  + " Thread-id: " + Thread.currentThread().threadId());
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(TryLockExample::attemptToAddCounter).start();
        }
    }

}
