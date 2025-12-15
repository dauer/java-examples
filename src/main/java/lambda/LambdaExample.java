package lambda;

@FunctionalInterface
interface I {
    void doSomething();
}

@FunctionalInterface
interface X {
    void doSomethingElse(int i);
}

public class LambdaExample {

    public static void main(String[] args) {
        // Pre Java 8 lambdas
        I i1 = new I() {
            @Override
            public void doSomething() {
                System.out.println("I do something");
            }
        };
        // Java 8+
        i1.doSomething();

        I i2 = () -> System.out.println("I2 do something");
        i2.doSomething();

        X x2 = (int x) -> System.out.println("X2 do something " + (x * 2));
        x2.doSomethingElse(10);
    }

}
