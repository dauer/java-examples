package polymorphism;

/**
 * Method Overriding is one of the core concepts of polymorphism in Java, allowing a subclass to provide a specific
 * implementation of a method already defined in its superclass.
 */
public class Polymorphism {

    public static void main(String[] args) {
        var p = new Parent();
        var c = new Child();
        System.out.println("|-----------|");
        p.foo();
        System.out.println(">-----------<");
        c.foo();
        System.out.println("|-----------|");
    }

}
