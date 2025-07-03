package collectors;

import java.util.*;

import static java.util.stream.Collectors.*;

/**
 * Collectors implement various useful reduction operations, such as accumulating elements into collections,
 * summarizing elements according to various criteria, etc.
 */
public class CollectorsExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("a", "bb","ccc", "dddd", "xxxxxxx", "eeeee", "aa", "bbb", "cccc"));
        list.add("hhhh");

        Optional<String> result  = list.stream().max(Comparator.naturalOrder());
        System.out.println("Max value: " + result.orElse("X"));

        Map<Integer, Set<String>> res = list.stream().collect(groupingBy(String::length, toSet()));
        System.out.println("List grouped by string length: " + res);

        List<String> immutableList = list.stream().toList(); // Same as but shorter:: collect(toUnmodifiableList());
        try {
            // This will fail (won't even compile if not wrapped  in try-catch)
            immutableList.add("ggggggg");
        } catch(UnsupportedOperationException unsupportedOperationException) {
            System.out.println("The list is immutable");
        }
    }

}
