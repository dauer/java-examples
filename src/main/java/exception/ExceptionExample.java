package exception;

public class ExceptionExample {

    public static void main(String[] args) {
        // The code won't compile if we don't catch the exception
        try {
            bar();
        } catch(ClassNotFoundException notFoundException) {
            System.out.println("En error has occurred!");
        }
    }

    // We have to declare that an exception is thrown
    private static void bar() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

}
