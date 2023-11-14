package whatWillBeTheOutput;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Tester {
    public static void main(String[] args) {
        /*List<Number> numbers = new ArrayList<>();
        append(numbers);
        numbers.add(3.14);
        System.out.println(numbers);

        List<? extends Number> list = Arrays.asList(1, 2, 3.0);
        add(list);*/

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        add1(list);
        System.out.println(list);

        try {
            System.out.println("Good" + " " + 100 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Morning");
        }

//        int arr[] = {1, 4, 4, 5, 5, 5, 6, 6, 11};
        int arr[] = {5, 5, 5};
        int n = arr.length;
        int sum = 10;

        System.out.println(pairs_count(arr, n, sum));

        threeSortedArrayAbsMin();

        buyTwoChocolate(new int[]{1, 2, 2}, 3);
        buyTwoChocolate(new int[]{3, 2, 3}, 3);

        Stream.of("Geekific", "Like", "Hello World!")
                .map(s -> s.transform(value -> new StringBuilder(value).delete(4, 10).toString()))
                .forEach(System.out::print);
        /**
         *
         * Teeing is a technique in Java that allows you to collect the results of
         * two or more stream operations into a single result.
         * This can be useful when you need to perform two or more different
         * operations on the same stream of data.
         * */
        Integer sumOfMinMax = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(
                        Collectors.minBy(Integer::compareTo),
                        Collectors.maxBy(Integer::compareTo),
                        (min, max) -> min.get() + max.get()
                ));
        System.out.println();
        System.out.println(sumOfMinMax);
    }

    public static void append(Collection<? super Integer> numbers) {
        IntStream.rangeClosed(1, 3).forEach(numbers::add);
    }

    public static void add(Collection<? extends Number> numbers) {
        numbers.add(null);
        //numbers.add(10f); error
    }

    public static void add1(Collection<? super Integer> numbers) {
        numbers.add(4);
        numbers.add(null);
        numbers.add(5);
    }

    static int pairs_count(int[] arr, int n, int sum) {
        // To store the count of pairs
        int ans = 0;

        // Sort the given array
        Arrays.sort(arr);

        // Take two pointers
        int i = 0, j = n - 1;

        while (i < j) {

            // If sum is greater
            if (arr[i] + arr[j] < sum)
                i++;

                // If sum is lesser
            else if (arr[i] + arr[j] > sum)
                j--;

                // If sum is equal
            else {

                // Find the frequency of arr[i]
                int c1 = 0;
                int x = arr[i], xx = i;
                while ((i < j) && (arr[i] == x)) {
                    i++;
                    c1++;
                }

                // Find the frequency of arr[j]
                int c2 = 0;
                int y = arr[j], yy = j;
                while ((j >= i) && (arr[j] == y)) {
                    j--;
                    c2++;
                }

                // If arr[i] and arr[j] are same
                // then remove the extra number counted
                if (x == y) {
                    /*int temp = i - xx + yy - j - 1;
                    ans += (temp * (temp + 1)) / 2;*/
                    ans += c1 + c2;
                } else {
//                    ans += (i - xx) * (yy - j);
                    ans += c1 * c2;
                }
            }
        }

        // Return the required answer
        return ans;
    }

    static void threeSortedArrayAbsMin() {
        int[] a = {1, 4, 5, 8, 10};
        int[] b = {6, 9, 15};
        int[] c = {2, 3, 6, 6};
        // a, b, c has to be very near
        // 5,6,6 => 6 - 5 = 1
        // Brute force
        int min = Integer.MAX_VALUE;
        for (int i : a) {
            for (int j : b) {
                for (int k : c) {
                    int a1 = i;
                    int b1 = j;
                    int c1 = k;
                    int abs = Math.abs(Math.max(a1, Math.max(b1, c1)) - Math.min(a1, Math.min(b1, c1)));
                    min = Math.min(abs, min);
                }
            }
        }
    }

    public static void buyTwoChocolate(int[] price, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < price.length; i++) {
            if (price[i] < min1) {
                min2 = min1;
                min1 = price[i];
            } else if (price[i] < min2) {
                min2 = price[i];
            }
        }
        int total = min1 + min2;
        int balance = money - total;
        if (balance < 0) {
            System.out.println(money);
        } else {
            System.out.println(balance);
        }
    }
}
