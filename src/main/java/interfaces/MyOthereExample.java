package interfaces;

public class MyOthereExample {

    public static void main(String[] args) {
        /*
         * Implementer interfacet direkte, uden en specifik klasse der `implements MyInterface`
         */
        MyInterface mif = new MyInterface() {
            @Override
            public void foobar() {
                System.out.println("Hello world");
            }
        };

        /*
         * Alternatively as the interface only has a Single Abstract Method foobar() we can implement it as a lambda
         */
        MyInterface mifLambda = () -> System.out.println("Hello world");

        mif.foobar();
        mif.bar();
        mifLambda.foobar();
    }

}
