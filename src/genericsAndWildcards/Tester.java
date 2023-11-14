package genericsAndWildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        String[] str = new String[10];
        doStuff(str);
        List<String> list = new ArrayList<>();
        //doStuff(list); // List<String> is not subtype of List<Object>

        List<Integer> integers = Arrays.asList(1, 2, 3);
        add(integers);

        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        append(numbers);
    }

    public static void doStuff(Object[] objects) {

    }

    public static void doStuff(List<Object> objects) {

    }

    public static void add(Collection<? extends Number> numbers) {
        //numbers.add(10);
        numbers.add(null); // Can add null since it is reference type
        // Producer
        // <? extends T>
        // For retrieval of elements
        // Not for altering elements (add etc.,.)
    }

    public static void append(Collection<? super Integer> integers) {
        // Consumer
        // <? super T>
        // Not For retrieval of elements since List<Object> can also be passed "Like", 1 - all are objects
        // For altering elements (add etc.,.)
    }

    // Invariance - shifts runtime to compile time exception
    // Arrays - covariant by default
    // PECS - Producer Extends Consumer Super
    // Produce, Consume - <T> No sub or super type
    // Produce - Extends - <? extends T>
    // Consume - Super - <? super T>
    // Neither produce nor consume - <?> unbounded
}
