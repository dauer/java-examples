package functional;

/**
 * SAM - Single Abstract Method: Allows us to assign lambdas to the type
 * The annotation guarantees that only one method is defined
 * - default and static methods not counting
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    void doStuff();

    default void otherStuff() {
        System.out.println("Hello from otherStuiff");
    }

}
