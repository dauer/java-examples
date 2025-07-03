package records;

import java.util.regex.Pattern;

/**
 * Default constructor, hashcode and toString methods are provided by records
 * Simple example of a record:
 *     public record Person(String name, String address, String email) {}
 * Records can also implement interfaces and methods (no inheritance!), this simple example does not though...
 */
public record Person(String name, String address, String email) {

    /*
     * We cannot add instance fields to our record. However, we can add static fields.
     */
    private static final Pattern EMAIL_REGEX_PATTERN = Pattern
            .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    static Pattern emailRegex() {
        return EMAIL_REGEX_PATTERN;
    }
    /*
     * Compact Constructors is an (optional) way of adding validation rules
    */
    public Person {
        if(!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
    }

    /*
     * Adding Custom Constructors (optional)
     */
    public Person(String name) {
        this(name, "Unknown", "example@example.com");
    }

}