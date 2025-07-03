package concurrent.executorservice;

public class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from Task");
    }

}
