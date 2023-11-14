package numberPrograms;

import static numberPrograms.Fibonacci.printFibonacciSeries;

public class Tester {
    public static void main(String[] args) {
//        checkFibonacci();
//        checkArmstrongNumber();
//        checkStringToInt();
//        checkLeapYear();
        findNumbersMax();
    }

    private static void findNumbersMax() {
        System.out.println(MinMaxOfNumbers.findMaxOfThreePositiveNumbers(10, 20, 30));
        System.out.println(MinMaxOfNumbers.findMaxOfThreePositiveNumbers(10, 20, 20));
        System.out.println(MinMaxOfNumbers.findMaxOfThreePositiveNumbers(20, 20, 20));

        System.out.println(MinMaxOfNumbers.findMinOfThreePositiveNumbers(10, 20, 30));
        System.out.println(MinMaxOfNumbers.findMinOfThreePositiveNumbers(10, 10, 30));
        System.out.println(MinMaxOfNumbers.findMinOfThreePositiveNumbers(10, 10, 10));
    }

    private static void checkLeapYear() {
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(1960));
        System.out.println(LeapYear.isLeapYear1(2000));
        System.out.println(LeapYear.isLeapYear1(1960));
    }

    private static void checkFibonacci() {
        printFibonacciSeries(8);
    }

    private static void checkStringToInt() {
        System.out.println(StringToInt.convert("123"));
        System.out.println(StringToInt.convert("123") + 100);
        System.out.println(StringToInt.convert("1998"));
        System.out.println(StringToInt.convert("1") + 4);

        System.out.println(StringToInt.convert1("123"));
        System.out.println(StringToInt.convert1("123") + 100);
        System.out.println(StringToInt.convert1("1998"));
        System.out.println(StringToInt.convert1("2") + 6);
    }

    private static void checkArmstrongNumber() {
        System.out.println(ArmstrongNumber.isArmStrongNumber(-1));
        System.out.println(ArmstrongNumber.isArmStrongNumber(0));
        System.out.println(ArmstrongNumber.isArmStrongNumber(5));
        System.out.println(ArmstrongNumber.isArmStrongNumber(12));
        System.out.println(ArmstrongNumber.isArmStrongNumber(153));
        System.out.println(ArmstrongNumber.isArmStrongNumber(9474));
        System.out.println(ArmstrongNumber.isArmStrongNumber(1674));
        System.out.println(ArmstrongNumber.isArmStrongNumber(54748));
        System.out.println(ArmstrongNumber.isArmStrongNumber(100));
    }
}
