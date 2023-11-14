package streamPrograms;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPrograms {
    public static void main(String[] args) {
//        checkPredicate();
//        testEmployee();
//        stringCharacterCount("Java");
//        stringDuplicateElements("Java");
//        stringUniqueElements("Java");
//        longestLengthStringInArray(new String[]{"java", "springboot", "docker", "k8s"});
//        nThLargestElementInNumberArray(3, new int[]{4, 3, 5, 1, 2});
//        findNumberStartWithGivenDigit(2, new int[]{4, 321, 5, 1, 200});
//        firstNonRepeatingCharacterInString("iolvejavatechie");
//        findEvenLengthWordsInStringUsingStreams("Hi hello good");
//        fizzBuzz();
//        fetchSecondSmallestElement(new int[]{4, 3, 5, 1, 2});
//        fetchSecondSmallestElementHandlingDuplicates(new int[]{4, 3, 5, 1, 1});
//        fetchCommonElements(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 6, 7, 8});
//        fetchUnCommonElements(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 6, 7, 8});
//        fetchLengthOfLongestString(new String[]{"Airbus", "Boeing", "CaterPillar"});
//        removeDuplicatesPreservingOrder(new String[]{"Apple", "Banana", "Apple", "Grapes", "Banana"});
//        reverseArrayElementsInPlace(new int[]{1, 2, 3, 4, 5});
        productOfAllExceptCurrentElementInArray(new int[]{1, 2, 3});
    }

    private static void testEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("100", "Adam", "Gilchrist", "Web Developer", 20000));
        employees.add(new Employee("101", "Dave", "Martin", "Mobile Developer", 30000));
        employees.add(new Employee("102", "Luke", "Wright", "QA", 25000));
        employees.add(new Employee("103", "Tom", "Hanks", "Mobile  Developer", 40000));
        employees.add(new Employee("104", "Jon", "Lewis", "QA", 22000));

        System.out.println(groupByDesignation(employees));
        double averageSalary = averageEmployeesSalary(employees);
        System.out.println(averageSalary);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(integerList.stream().reduce((integer, integer2) -> {
            System.out.println(integer + " " + integer2);
            return integer + integer2;
        }).get());
        System.out.println(integerList.stream().reduce(1, (integer, integer2) -> {
            System.out.println(integer + " " + integer2);
            return integer * integer2;
        }).intValue());

        List<Integer> squareAvg = Arrays.asList(1, 10, 15, 30);
        System.out.println(squareAvg.stream().mapToInt(n -> n * n).filter(n -> n > 100).average().getAsDouble());

        List<Integer> average = Arrays.asList(10, 20, 30);
        System.out.println("Average " + average.stream().mapToInt(n -> n).average().getAsDouble());
        List<Integer> oddEven = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Even " + oddEven.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
        System.out.println("Odd " + oddEven.stream().filter(n -> n % 2 != 0).collect(Collectors.toList()));

        List<Integer> duplicateList = Arrays.asList(10, 20, 30, 60, 30, 10);
        System.out.println(duplicateList.stream().filter(num -> Collections.frequency(duplicateList, num) > 1).collect(Collectors.toList()));
        System.out.println(duplicateList.stream().filter(num -> Collections.frequency(duplicateList, num) > 1).collect(Collectors.toSet()));

        List<Integer> minMaxList = Arrays.asList(10, 20, 30, 60, 30, 10);
        System.out.println(minMaxList.stream().min(Integer::compareTo));
        System.out.println(minMaxList.stream().max(Integer::compareTo));

        List<Integer> sortList = Arrays.asList(10, 20, 30, 60, 30, 10);
        System.out.println(sortList.stream().sorted().collect(Collectors.toList()));
        System.out.println(sortList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));

        List<Integer> limitSkipList = Arrays.asList(1, 22, 3, 4, 5, 6, 7, 8, 100, 678);
        System.out.println(limitSkipList.stream().limit(3).collect(Collectors.toList()));
        System.out.println(limitSkipList.stream().skip(8).collect(Collectors.toList()));

        List<Integer> secHighLowList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(secHighLowList.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get());
        System.out.println(secHighLowList.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get());
        System.out.println(secHighLowList.stream().sorted().skip(1).findFirst().get());
    }

    private static void checkPredicate() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(18);
        integerList.add(29);
        integerList.stream().filter(canVote()).forEach(System.out::println);
    }

    public static Predicate<Integer> canVote() {
        return age -> age >= 18;
    }

    public static Map<String, List<Employee>> groupByDesignation(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getDesignation));
    }

    public static double averageEmployeesSalary(List<Employee> employees) {
        return employees.stream().mapToInt(Employee::getSalary)
                .average()
                .getAsDouble();
    }

    public static void stringCharacterCount(String input) {
        Map<String, Long> result = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }

    public static void stringDuplicateElements(String input) {
        List<String> result = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public static void stringUniqueElements(String input) {
        List<String> result = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public static void longestLengthStringInArray(String[] strings) {
        String s = Arrays.stream(strings)
                .reduce((w1, w2) -> {
                    System.out.print("w1 : " + w1);
                    System.out.print(" ");
                    System.out.print("w2 : " + w2);
                    System.out.println();
                    if (w1.length() > w2.length()) {
                        return w1;
                    } else {
                        return w2;
                    }
                })
                .get();
        System.out.println(s);
    }

    public static void nThLargestElementInNumberArray(int n, int[] array) {
        Integer result = Arrays.stream(array).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(n - 1)
                .findFirst()
                .get();
        System.out.println(result);
    }

    public static void findNumberStartWithGivenDigit(int n, int[] array) {
        String result = Arrays.stream(array).boxed()
                .map(num -> num + "")
                .filter(s -> s.startsWith(String.valueOf(n)))
                .findFirst()
                .get();
        System.out.println(result);
    }

    public static void firstNonRepeatingCharacterInString(String value) {
        String result = Arrays.stream(value.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
        System.out.println(result);
    }

    public static void findEvenLengthWordsInStringUsingStreams(String str) {
        Arrays.stream(str.split(" "))
                .filter(s -> s.length() % 2 == 0)
                .forEach(System.out::println);
    }

    public static void fizzBuzz() {
        IntStream.rangeClosed(1, 20)
                .mapToObj(i -> (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" : (i % 5 == 0 ? "Buzz" : (i % 3 == 0 ? "Fizz" : i + "")))
                .forEach(System.out::println);

        IntStream.rangeClosed(1, 20)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i + ""))
                .forEach(System.out::println);
    }

    public static void fetchSecondSmallestElement(int[] arr) {
        int result = Arrays.stream(arr).sorted().skip(1).findFirst().orElse(-1);
        System.out.println(result);
    }

    public static void fetchSecondSmallestElementHandlingDuplicates(int[] arr) {
        int result = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElse(-1);
        System.out.println(result);
    }

    private static void fetchCommonElements(int[] arr1, int[] arr2) {
        List<Integer> result = Arrays.stream(arr1).filter(arr1Num -> Arrays.stream(arr2).anyMatch(arr2Num -> arr1Num == arr2Num)).boxed().collect(Collectors.toList());
        System.out.println(result);
    }

    private static void fetchUnCommonElements(int[] arr1, int[] arr2) {
        List<Integer> result = Arrays.stream(arr1).filter(arr1Num -> Arrays.stream(arr2).noneMatch(arr2Num -> arr1Num == arr2Num)).boxed().collect(Collectors.toList());
        System.out.println(result);
    }

    private static void fetchLengthOfLongestString(String[] strings) {
        int result = Arrays.stream(strings).mapToInt(String::length).max().orElse(-1);
        System.out.println(result);
    }

    private static void removeDuplicatesPreservingOrder(String[] strings) {
        List<String> result = Arrays.stream(strings).distinct().collect(Collectors.toList());
        System.out.println(result);
    }

    private static void reverseArrayElementsInPlace(int[] arr) {
        // 1, 2, 3, 4, 5
        // 5, 4, 3, 2, 1
        //IntStream.range(0, arr.length/2).forEach(System.out::println);
        IntStream.range(0, arr.length / 2)
                .forEach(index -> {
                    int temp = arr[index];
                    arr[index] = arr[arr.length - index - 1];
                    arr[arr.length - index - 1] = temp;
                });
        System.out.println(Arrays.toString(arr));
    }

    private static void productOfAllExceptCurrentElementInArray(int[] arr) {
        Arrays.stream(arr).map(n -> {
                    //System.out.println(n);
                    int result = reduceIntArray(arr) / n;
                    System.out.println(result);
                    return result;
                })
                .boxed()
                .collect(Collectors.toList());
    }

    private static int reduceIntArray(int[] arr) {
        int result = Arrays.stream(arr).reduce(1, (left, right) -> left * right);
        System.out.println(result);
        return result;
    }
}
