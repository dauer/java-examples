package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Predicate
 *  - A predicate asks a question where the answer is true or false (boolean) or, said another way, yes or no.
 *  - Has one method that returns a boolean: test()
 */
public class PredicateExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom");
        Predicate<String> predicate1 = str -> str.startsWith("A");
        Predicate<String> predicate2 =  str -> str.length() < 5;

        /*
         * Predicate has one default method: boolean test(T t)
         */
        if(predicate1.test("Adam")) {
            System.out.println("Adam tests OK");
        }

        /*
         * Combining using Complex Predicate using bitwise operations (&&)
         */
        List<String> result0 = names.stream()
                .filter(name -> name.startsWith("A") && name.length() < 5)
                .toList();

        System.out.println("Size: " + result0.size());
        System.out.println("Values: " + result0);

        /*
         * Combining using multiple filter()'s
         */
        List<String> result1 = names.stream()
                .filter(predicate1)
                .filter(predicate2)
                .toList();

        System.out.println("Size: " + result1.size());
        System.out.println("Values: " + result1);

        /*
         * Combining predicates with chaining using and(), or(), negate()
         */
        List<String> result2 = names.stream()
                .filter(predicate1.and(predicate2))
                .toList();

        System.out.println("Size: " + result2.size());
        System.out.println("Values: " + result2);

        /*
         * BiPredicate takes two arguments
         */
        BiPredicate<String, Integer> biPredicate = (str, len) ->  str.length() == len;
        System.out.println("BiPredicate: " + biPredicate.test("Adam", 10));
    }

}
