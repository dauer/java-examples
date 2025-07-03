package patternmatching;

import records.Person;

/**
 * Pattern matching was introduced i Java 14
 */
public class PatternMatchingExample {

    public static String process(Object o) {
        if (o instanceof String str) {
            return "Received a string of length: " + str.length();
        }
        else if (o instanceof Integer number) {
            return "Received the number %d which multiplied by 10 is: %d".formatted(number, (10 * number));
        }
        // TODO only with Java 20 amd preview enabled...
        // else if (o instanceof Person(String name, String address, String email)) {
        //    return "Received an instance of Person %s".formatted(name);
        //}
        return "Whatever!...";
    }

    public static void main(String[] args) {
        System.out.println(process(6));
        System.out.println(process("Hello world"));
        System.out.println(process(new Person("Anders And"))); // TODO...
        System.out.println(process(null));
    }

}
