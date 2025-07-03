package lambda;

@FunctionalInterface
interface I {
    void doSomething();
}

public class LambdaExample {

    public static void main(String[] args) {
        // Pre Java 8 lambdas
        I i = new I() {
            @Override
            public void doSomething() {
                System.out.println("I do something");
            }
        };
        // Java 8+
        i.doSomething();
        I i2 = () -> System.out.println("I2 do something");
        i2.doSomething();
    }

}
