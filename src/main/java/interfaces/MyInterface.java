package interfaces;

/**
 * A simple interface demonstrating
 * - classic method definition
 * - default methods
 * - static methods
 * - private methods
 */
public interface MyInterface {

    void foobar();

    default void bar() {
        System.out.println("Hello from bar()");
        foo();
    }

    static void buzz() {
        System.out.print("Buzzing!...");
    }

    private void foo() {
        System.out.println("Hello from private method foo");
    }

}
