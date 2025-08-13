package concurrent.thread;

public class NewThread extends Thread {

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int i = 0;
        while (i < 10) {
            System.out.println(this.getName() + ": New Thread is running..." + i++);
            try {
                // Wait for one sec so it doesn't print too fast
                Thread.sleep(1000);
            } catch (InterruptedException _) {
                System.out.println("Interrupted while waiting for thread to start");
            }

        }
    }

}
