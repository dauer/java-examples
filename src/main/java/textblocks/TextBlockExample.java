package textblocks;

public class TextBlockExample {

    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = """
                Hello World!""";
        String str3 = """
                "Hello world in quotes!"
                """;
        String str4 = """
                "Hello world in quotes!"\
                """;
        String str5 = """
                "Hello world in quotes!"\
            """;
        //  ^ Sets where whitespaces "count" from

        System.out.println(str1.equals(str2));
        System.out.println("str2 >|" + str2 + "|");
        System.out.println("str3 >|" + str3 + "|");
        System.out.println("str4 >|" + str4 + "|");
        System.out.println("str5 >|" + str5 + "|");
    }

}
