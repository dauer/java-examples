package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

    public static void main(String[] args) {
        // Immutable set
        Set<String> s = Set.of("Monkey", "Abe", "Horse", "Hest");
        System.out.println("Set: " + s);
        System.out.println("-----");

        Set<String> h = new HashSet<>();
        Set<String> l = new LinkedHashSet<>();
        Set<String> t = new TreeSet<>();

        // Order according to hash value
        h.add("Monkey");h.add("Abe");h.add("Horse");h.add("Hest");
        System.out.println("HashSet: " + h);
        System.out.println("-----");

        // Order according to insertion order
        l.add("Monkey");l.add("Abe");l.add("Horse");l.add("Hest");
        System.out.println("LinkedHashSet: " + l);
        System.out.println("-----");

        // Order sorted according to their naturel order (fx. alphabetic or numeric)
        t.add("Monkey");t.add("Abe");t.add("Horse");t.add("Hest");
        System.out.println("TreeSet: " + t);
    }

}
