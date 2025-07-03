package methodoverloading;

/**
 * A class can provide multiple definitions of the same method. This is known as overloading.
 * Overloaded methods must have distinct signatures
 */
public class MethodOverloading {

    public static void main(String[] args) {
        print();
        print("Hello world");
        print(911);
    }

    static void print(String string) {
        System.out.println("A string " + string);
    }

    static void print(int i) {
        System.out.println("An int " + i);
    }

    static void print() {
        System.out.println("No parameter specified");
    }

}
