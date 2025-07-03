package concurrent;

import concurrent.thread.NewThread;

public class ThreadExample {

    public static void main(String[] args) {
        NewThread t1 = new NewThread();
        NewThread t2 = new NewThread();
        t1.setName("MyThread-1");
        t2.setName("MyThread-2");
        t1.start();
        t2.start();
        System.out.println("Threads have been started!...");
    }

}
