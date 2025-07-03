package consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Consumer
 *  - Consumes the input and returns nothing: void accept(T t)
 */
public class ConsumerExample {

    public static void main(String[] args) {
        /*
         * Consumer
         */
        Consumer<String> consumer = (str) -> System.out.println("Hello " + str + "!");
        List<String> names =  new ArrayList<>(List.of("John", "Sara", "Mary", "Peter"));
        // forEach(...) takes a consumer
        names.forEach(consumer);

        /*
         * BiConsumer
         */
        var map = new HashMap<String, String>();
        BiConsumer<String, String> biConsumer = (str1, str2) -> map.put(str1, str2);
        biConsumer.accept("London", "England");
        biConsumer.accept("Copenhagen", "Denmark");
        biConsumer.accept("Berlin", "Germany");

        BiConsumer<String, String> mapConsumer = (str1, str2) -> System.out.println(str1 + " is the capital of " + str2);
        map.forEach(mapConsumer);
    }

}
