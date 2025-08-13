package concurrent.executorservice;

public class RunnableTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from " + this.getClass().getName() + " -> " + Thread.currentThread().getName());
    }

}
