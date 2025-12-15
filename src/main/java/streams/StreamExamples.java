package streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hans", "Grete", "Lille Per");
        Stream<String> res = names.stream()
                .peek(System.out::println)
                .filter(val -> val.length() > 5)
                .peek(System.out::println)
                .map(String::toUpperCase);

        // The returned value is wrapped in an Optional
        System.out.println(res.findFirst().orElse("Empty stream"));

        // reduce() the stream into one string (identity '-> ' is also default value if list is empty)
        String str = names.stream().reduce("-> ", (a, b) -> a + b);
        System.out.println(str);

        // flatMap() - map() would return a type Optional<Optional<String>> but flatMap gives us an Optional<String>
        Optional<String> oString = Optional.of("string").flatMap(s -> Optional.of("STRING"));
        System.out.println(oString.get());

        // anyMatch()
        boolean hasAnimal = Stream.of("Horse", "Cat", "Mouse", "Cow", "Tiger")
                .map(String::toLowerCase)
                .anyMatch(s -> s.equals("horse"));
        System.out.println(hasAnimal);

        // limit()
        var r = Stream.of("Tim", "Thomas", "Carl", "Ben", "Timmy", "John", "Tommy")
                .filter(s -> s.startsWith("T"))
                .limit(3)
                .reduce("", (a, b) -> a + b);
        System.out.println(r);

        // groupingBy
        Stream<String> someNames = Stream.of("Tom", "Tim", "Mike", "Carl", "Sean", "Tommy", "Walter", "Charles");
        Map<Integer, List<String>> mapped = someNames.collect(
                Collectors.groupingBy(String::length)
        );
        System.out.println(mapped);

        // partitioningBy
        List<Integer> intList = List.of(1, 2, 3, 4, 7, 8, 9, 11, 12, 13, 17, 19);
        Predicate<Integer> oddOrEven = i -> i % 2 == 0;
        Map<Boolean, List<Integer>> groups = intList.stream().collect(Collectors.partitioningBy(oddOrEven));
        List<List<Integer>> subSets = new ArrayList<List<Integer>>(groups.values());
        System.out.println("Always 2: " + groups.size());
        System.out.println("Odd numbers = " + subSets.get(0));
        System.out.println("Even numbers = " + subSets.get(1));
    }

}
