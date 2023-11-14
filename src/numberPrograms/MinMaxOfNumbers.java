package numberPrograms;

public class MinMaxOfNumbers {

    public static int findMaxOfThreePositiveNumbers(int a, int b, int c) {
        int max = 0;

        while (a > 0 || b > 0 || c > 0) {
            a--;
            b--;
            c--;
            max++;
        }
        return max;
    }

    public static int findMinOfThreePositiveNumbers(int a, int b, int c) {
        int min = 0;

        while (a > 0 && b > 0 && c > 0) {
            a--;
            b--;
            c--;
            min++;
        }
        return min;
    }
}
