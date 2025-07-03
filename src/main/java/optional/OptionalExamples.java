package optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExamples {

    // TODO implement examples...
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        // Provide a default value if none is present
        try {
            optional.get();
        } catch(NoSuchElementException noSuchElementException) {
            System.out.println("Get failed as expected...." + noSuchElementException.getMessage());
        }
        System.out.println("Value: " + optional.orElse("Hello world"));

        // If value is available use that
        Optional<String> optionalWithValue = Optional.of("Hello Kitty!");
        System.out.println("Value: " + optionalWithValue.orElse("This will not be printed!") + " | " + optionalWithValue.get());

        // Calls a method that supplies a value if none is present
        System.out.println(optional.orElseGet(OptionalExamples::foo));
        System.out.println("Value: " + optional.orElseGet(() -> {
                int i = 19;
                return "Or a closure... " + (i * 2);
            })
        );
        System.out.println(optionalWithValue.orElseGet(OptionalExamples::foo));
    }

    private static String foo() {
        return "Value provided by method...";
    }

}
