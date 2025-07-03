package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {
        try {
            Class<?> clazz = MyClass.class;
            Class<?> clazzByName = Class.forName("reflection.MyClass");

            try {
                try {
                    clazzByName.getMethod("foo").invoke(null);
                    clazz.getMethod("bar").invoke(new MyClass());
                    // This fails due to private method (see changeModifier() below...)
                    clazz.getDeclaredMethod("foobar").invoke(new MyClass());
                } catch(IllegalAccessException | InvocationTargetException illegalAccessException) {
                    System.out.println("Illegal access");
                }
            } catch(NoSuchMethodException noSuchMethodException) {
                System.out.println("Method not found");
            }
        } catch(ClassNotFoundException notFoundException) {
            System.out.println("Class not found");
        }
        changeModifier();
    }

    public static void changeModifier() {
        Class<?> clazz = MyClass.class;

        try {
            try {
                Method myMethod = clazz.getDeclaredMethod("foobar");
                // Changing the accessibility allows us to call the private method
                myMethod.trySetAccessible();
                myMethod.invoke(new MyClass());
            } catch(IllegalAccessException | InvocationTargetException illegalAccessException) {
                System.out.println("Illegal access!!!");
            }
        } catch(NoSuchMethodException noSuchMethodException) {
            System.out.println("Method not found!!!");
        }
    }

}
