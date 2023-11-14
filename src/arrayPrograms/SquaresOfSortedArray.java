package arrayPrograms;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(approach1(new int[]{-4, -1, 0, 3, 10})));
//        System.out.println(Arrays.toString(approach2(new int[]{-4, -1, 0, 3, 10})));
//        System.out.println(Arrays.toString(approach2(new int[]{-11, -4, -1, 0, 3, 10})));
//        System.out.println(Arrays.toString(approach2(new int[]{-4, -1, 0, 3, 10, 20})));
//        System.out.println(Arrays.toString(approach2(new int[]{-37, -4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(approach3(new int[]{-4, -1, 0, 3, 10})));
    }

    // O(n log n)
    public static int[] approach1(int[] arr) {
        // O(n)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        // O(log n)
        Arrays.sort(arr);

        return arr;
    }

    // T : O(n)
    // S : O(n)
    public static int[] approach2(int[] arr) {
        // {-4, -1, 0, 3, 10}
        // Analyze the input
        // Negative numbers are in decreasing order
        // Positive numbers are in increasing order

        int n = arr.length;
        // Find first non-negative index
        int firstPositiveIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                firstPositiveIndex = i;
                break;
            }
        }

        int negativeIndex = firstPositiveIndex - 1;
        int positiveIndex = firstPositiveIndex;

        int resultIndex = 0;
        int[] result = new int[n];

        while (negativeIndex >= 0 && positiveIndex < n) {
            int sqrAtNegIndex = arr[negativeIndex] * arr[negativeIndex];
            int sqrAtPosIndex = arr[positiveIndex] * arr[positiveIndex];

            if (sqrAtNegIndex < sqrAtPosIndex) {
                result[resultIndex++] = sqrAtNegIndex;
                negativeIndex--;
            } else {
                result[resultIndex++] = sqrAtPosIndex;
                positiveIndex++;
            }
        }

        System.out.println(Arrays.toString(result));

        // For remaining neg nos
        while (negativeIndex >= 0) {
            result[resultIndex++] = arr[negativeIndex] * arr[negativeIndex];
            negativeIndex--;
        }

        System.out.println(Arrays.toString(result));

        // For remaining pos nos
        while (positiveIndex < n) {
            result[resultIndex++] = arr[positiveIndex] * arr[positiveIndex];
            positiveIndex++;
        }

        return result;
    }

    // Two pointer approach
    // Traverse from both the ends
    // O(n) + O(n)
    public static int[] approach3(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        int[] result = new int[arr.length];
        int resultIndex = result.length - 1;

        // {-4, -1, 0, 3, 10}

        while (start <= end) {
            int lVal = arr[start] * arr[start];
            int rVal = arr[end] * arr[end];

            if (lVal > rVal) {
                result[resultIndex--] = lVal;
                start++;
            } else {
                result[resultIndex--] = rVal;
                end--;
            }
        }

        return result;
    }
}
