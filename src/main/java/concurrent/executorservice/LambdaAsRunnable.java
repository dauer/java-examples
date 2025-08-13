package concurrent.executorservice;

public class LambdaAsRunnable {

    public static void main(String[] args) {
        var t = new Thread( () -> {
            System.out.println("Thread name: " + Thread.currentThread().getName() + " running...");
        });

        // Runnable is a functional interface
        t.start();

        // called directly it will run in main and not in its own thread
        t.run();
    }

}
