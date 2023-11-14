package recursion;

public class RecursiveFunctions {
    public static int findSum(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return n + findSum(n - 1);
    }

    public static int findSumTailRec(int n, int a) {
        if (n == 0) return a;
        return findSumTailRec(n - 1, n + a);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int factorialTailRec(int n, int a) {
        if (n == 0) return a;
        return factorialTailRec(n - 1, n * a);
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciTailRec(int n, int a, int b) {
        if (n == 0)
            return a;
        if (n == 1)
            return b;
        return fibonacciTailRec(n - 1, b, a + b);
    }
}
