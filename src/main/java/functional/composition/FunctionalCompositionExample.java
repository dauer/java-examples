package functional.composition;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalCompositionExample {

    public static void main(String[] args) {
        /*
         * Function Composition on functions
         * https://codeaches.com/java/functional-composition
         */
        Function<Integer, Integer> sum = x -> x + x;
        Function<Integer, Integer> square = y -> y * y;

        Integer sumAndSquareResult = sum.compose(square).apply(3); // Returns 18 : (3 * 3) + (3 * 3)
        Integer squareAndSumResult = sum.andThen(square).apply(3); // Returns 36 : (3 + 3) * (3 + 3)

        System.out.println("sum.compose(square): " + sumAndSquareResult);
        System.out.println("sum.andThen(square): " + squareAndSumResult);

        /*
         * BiFunction examples - takes to parameters and one return value
         * https://functionalprogramming.medium.com/function-composition-in-java-beaf39426f52
         */
        BiFunction<Double, Double, Double> discountStrategy = (discount, price) -> price - discount * price;
        Function<Double, String> getPriceTag = price -> String.format("Discounted Price : %s", price);

        BiFunction<Double, Double, String>  getDiscountedPriceTag = discountStrategy.andThen(getPriceTag);
        System.out.println( "\n" + getDiscountedPriceTag.apply(0.2, 100.0) + "\n");

        /*
         * Function Composition - on class methods
         * https://stackoverflow.com/questions/19834611/how-to-do-function-composition
         */
        Function<Person, Address> personToAddress = Person::getAddress;
        Function<Address, String> addressToCountry = Address::getCountry;

        Function<Person, String> toCountry = personToAddress.andThen(addressToCountry);

        Address addr = new Address();
        addr.setCountry("Denmark");
        Person person = new Person();
        person.setAddress(addr);
        System.out.println(toCountry.apply(person));
        System.out.println(person.getAddress().getCountry());
    }

}
