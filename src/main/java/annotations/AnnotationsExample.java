package annotations;

import java.lang.annotation.*;

@interface Human {}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface TestAnnotation {
    // primitive types, enums and classes are allowed and 1D arrays
    int startTime() default 0;
    int endTime();
    String name() default "John Doe" ;
    Human extraInfo() default @Human;
    String[] data() default {"S", "K"};

    /* wrapper types and multidimensional arrays are not allowed, fx:
     * Integer turnOff();
     * String[][] multiData();
     */
}

@TestAnnotation(startTime = 1, endTime = 2)
class Testing {}


public class AnnotationsExample {
    public static void main(String[] args) {
        var test = new Testing();
        // Test for annotations with reflection requires RetentionPolicy.RUNTIME
        Class<?> clazz = test.getClass();
        if (clazz.isAnnotationPresent(TestAnnotation.class)) {
            System.out.println("The class has the TestAnnotation annotation");
        }
        System.out.println("Annotations examples...");
    }
}
