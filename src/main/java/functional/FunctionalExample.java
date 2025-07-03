package functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Function
 *  - Has one method: R apply(T t)
 * BiFunction
 *  - Has a method that takes two input: R apply(T t, U u)
 */
public class FunctionalExample {

    public static void main(String[] args) {
        // The interface is of type SAM - therefor allows assigning lambda
        MyFunctionalInterface functional = () -> System.out.println("Hello world!");
        functional.doStuff();

        // Function <T, R>
        Function<Integer, String> foo = x -> "The entered value is: " + x;
        System.out.println(foo.apply(26));

        // UnaryOperator<T> - function accepts and return same type of parameter, Integer in this example...
        // Unary (especially of a mathematical operation) consisting of or involving a single component or element.
        UnaryOperator<Integer> bar = x -> x * 2;
        System.out.println("The result is: " + bar.apply(8));

        // BiFunction <T, U, R>
        BiFunction<String, String, Integer> lengthOfNames = (fname, lname) -> fname.length() + lname.length();
        System.out.println("Length of firstname and lastname is: " + lengthOfNames.apply("Sherlock", "Holmes"));

        // BinaryOperator<T>
        // Binary - involving two things.
        BinaryOperator<String> binOp = (a, b) -> "My name is " + a + " " + b;
        System.out.println(binOp.apply("William", "Shatner"));
    }

}
