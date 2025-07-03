package abstractclasses;

public class AbstractExample {

    public static void main(String[] args) {

        AbstractClass abstractClass= new AbstractClass() {
            @Override
            public String myAbstractMethod() {
                return "Hello world";
            }
        };

        System.out.println(abstractClass.myAbstractMethod());
        System.out.println(abstractClass.myMethod());
    }

}
