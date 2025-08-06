package comparator;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Trixie", 5));
        cats.add(new Cat("Garfield", 12));
        cats.add(new Cat("Garfield", 2));

        // Sort by multiple fields
        Comparator<Cat> comparator = Comparator
                .comparing(Cat::getName)
                .thenComparingInt(Cat::getAge);
        cats.sort(comparator);
        // or: Collections.sort(cats, comparator);
        System.out.println(cats);

        // Cat does not implement CompareTo(T t) which is needed for TreeSet so we have to specify a Comparator
        // to avoid a ClassCastException
        TreeSet<Cat> treeSet = new TreeSet<>(comparator) {};
        treeSet.addAll(cats);
        System.out.println(treeSet);
    }

}
