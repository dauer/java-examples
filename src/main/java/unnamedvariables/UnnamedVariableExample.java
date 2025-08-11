package unnamedvariables;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

record Person(String name, int age) {}

/**
 * Unnamed variables where introduces in Java 21 and finalized in 22
 */
public class UnnamedVariableExample {

    public static void main(String[] args) {
        String[] data = {"Hello", "world"};
        List<String> list = Arrays.asList(data);

        // IntelliJ no etc. longer complaining about unused variable
        for(String _ : data) {
            System.out.println("Performing a side-affect");
        }

        // We are not using the data in the lambda
        list.forEach(_ -> System.out.println("Performing more side-effects"));

        process(1);
        process("Hello");
        process(new Date());
        process(null);

        Person p = new Person("Andrew", 30);
        // We don't care about age, only name
        if (p instanceof Person(String name, _)) {
            System.out.println("It is a Person named " + name);
        }
    }

    private static void process(Object o) {
        switch(o) {
            case String _ -> System.out.println("Its a String");
            case Integer _ -> System.out.println("Its an Integer");
            case null, default -> System.out.println("Its an undefined");
        }
    }
}
