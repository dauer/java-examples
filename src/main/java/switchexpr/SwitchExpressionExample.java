package switchexpr;

public class SwitchExpressionExample {

    public static String process(int input) {
        return switch(input) {
            case 1 -> "One";
            case 2, 3 -> "Two or three";
            case 4 -> {
                System.out.println("Called...");
                yield "Four";
            }
            default -> "Whatever";
        };
    }

    public static void main(String[] args) {
        System.out.println(process(1));
        System.out.println(process(2));
        System.out.println(process(3));
        System.out.println(process(4));
        System.out.println(process(5));
    }
}
