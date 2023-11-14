package numberPrograms;

public class Fibonacci {
    public static void printFibonacciSeries(int n) {
        // Pos = 1 2 3 4 5 6 7 8
        // Num = 0 1 1 2 3 5 8 13

        int i1 = 0;
        int i2 = 1;

        System.out.print(i1);
        System.out.print(i2);

        for (int i = 3; i <= n; i++) {
            int result = i1 + i2;
            System.out.print(result);
            i1 = i2;
            i2 = result;
        }
    }
}
