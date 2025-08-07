package equals;

class Person {
    public String getName() {
        return name;
    }

    private String name;

    public int getAge() {
        return age;
    }

    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class SomePerson extends Person {

    SomePerson(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof SomePerson person) {
            return this.getName() == person.getName();
        }
        return false;
    }

}

public class EqualsExample {

    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = 1;
        Integer i3 = i1;
        System.out.println(i1.equals(i2)); // true
        System.out.println(i1.equals(i3)); // true

        Person s1 = new Person("Test", 1);
        Person s2 = new Person("Test", 1);
        Person s3 = s1;
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // true

        SomePerson sp1 = new SomePerson("Test", 7);
        SomePerson sp2 = new SomePerson("Test", 8);
        SomePerson sp3 = sp1;
        System.out.println(sp1.equals(sp2)); // true - because we implemented custom equals() method
        System.out.println(sp1.equals(sp3)); // true
    }

}
