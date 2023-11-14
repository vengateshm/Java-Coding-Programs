package java_8.optional;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class Tester {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[0] = "Hello";

        Optional<String> valueAt0 = Optional.of(str[0]);
        if (valueAt0.isPresent()) {
            System.out.println(valueAt0.get());
        }
        valueAt0.ifPresent(System.out::println);

        Optional<String> valueAt5 = Optional.ofNullable(str[5]);
        if (valueAt5.isEmpty()) {
            System.out.println("Value not present");
        }

        System.out.println(valueAt5.orElse("Value not found"));

        System.out.println(valueAt5.orElseGet(Tester::getRandomName));
    }

    private static String getRandomName() {
        Random random = new Random();
        int value = random.nextInt(5);
        return "Value " + value;
    }
}
