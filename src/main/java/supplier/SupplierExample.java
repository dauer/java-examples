package supplier;

import java.time.LocalTime;
import java.util.function.Supplier;


/**
 * Supplier
 *  - Takes no arguments and has a single method: T get()
 */
public class SupplierExample {

    public static void main(String[] args) {
        Supplier<LocalTime> supplier = () -> LocalTime.now();
        System.out.println("LocalTime: " + supplier.get());
    }

}
