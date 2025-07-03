package concurrent.executorservice;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    @Override
    public String call() {
        return "Hello Kitty";
    }

}
