package arrayPrograms;

public class MaxKConsecutiveSum {
    public static int bruteForce(int[] arr, int k) {
        int n = arr.length;

        if (n < k) {
            System.out.println("Invalid input. K must be less than or equal to n");
            return -1;
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n - k + 1; i++) {
            int windowSum = 0;
            for (int j = 0; j < k; j++) {
                windowSum += arr[i + j];
            }
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
    }

    public static int optimized(int[] arr, int k) {
        int n = arr.length;

        if (n < k) {
            System.out.println("Invalid input. K must be less than or equal to n");
            return -1;
        }

        int maxSum = Integer.MIN_VALUE;

        // Calculate first K elements sum
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        // Start from k
        int windowSum = maxSum;
        for (int j = k; j < n; j++) {
            windowSum += arr[j] - arr[j - 2];
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(bruteForce(new int[]{100, 200, 300, 400}, 1));
        System.out.println(bruteForce(new int[]{1, 4, 2, 10, 2, 3, 1, 0, 20}, 4));
    }
}
