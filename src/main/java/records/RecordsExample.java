package records;

/**
 * Records - available from Java 14
 *  - Records are immutable data classes that require only the type and name of fields.
 */
public class RecordsExample {

    public static void main(String[] args) {
        /*
         * Default constructor, hashcode and toString methods are provided by records
         */
        Person aRecord = new Person("Hello Kitty", "The Rainbow", "hello@kitty.com");
        System.out.println("Name: " + aRecord.name() + ", Address: " + aRecord.address());
        System.out.println("ToString: " + aRecord);
        System.out.println("HashCode: " + aRecord.hashCode());

        Person anotherPerson = new Person("John Doe");
        System.out.println(anotherPerson);
    }

}
