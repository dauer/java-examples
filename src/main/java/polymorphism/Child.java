package polymorphism;

public class Child extends Parent {

    @Override
    void foo() {
        super.foo();
        System.out.println("This is the Child overriding the parent...");
    }

}
