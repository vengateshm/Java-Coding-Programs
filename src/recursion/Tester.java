package recursion;

public class Tester {
    public static void main(String[] args) {
        int result = RecursiveFunctions.findSum(10);
        int resultTailRec = RecursiveFunctions.findSumTailRec(10, 0);
        System.out.println(result);
        System.out.println(resultTailRec);

        int factorialResult = RecursiveFunctions.factorial(5);
        int factorialResultTailRec = RecursiveFunctions.factorialTailRec(5, 1);
        System.out.println(factorialResult);
        System.out.println(factorialResultTailRec);

        int fibonacciResult = RecursiveFunctions.fibonacci(8);
        int fibonacciResultTailRec = RecursiveFunctions.fibonacciTailRec(8,0, 1);
        System.out.println(fibonacciResult);
        System.out.println(fibonacciResultTailRec);
    }
}
