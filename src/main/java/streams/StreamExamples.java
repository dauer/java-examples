package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hans", "Grete", "Lille Per");
        Stream<String> res = names.stream()
                .filter(val -> val.length() > 5)
                .map(String::toUpperCase);

        // The returned value is wrapped in an Optional
        System.out.println(res.findFirst().orElse("Empty stream"));

        // reduce() the stream into one string (identity '-> ' is also default value if list is empty)
        String str = names.stream().reduce("-> ", (a, b) -> a + b);
        System.out.println(str);

        // flatMap() - map() would return a type Optional<Optional<String>> but flatMap gives us an Optional<String>
        Optional<String> oString = Optional.of("string").flatMap(s -> Optional.of("STRING"));
        System.out.println(oString.get());
    }

}
