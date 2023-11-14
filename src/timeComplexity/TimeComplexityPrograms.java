package timeComplexity;

public class TimeComplexityPrograms {
    public static void main(String[] args) {
//        quadraticTimeComplexity();//O(N ^ 2)
//        cubicTimeComplexity(6);//O(N ^ 3)
//        linearTimeComplexity();//O(N)
//        constantTimeComplexity();//O(1)
        logarithmicTimeComplexity();//O(log N)
    }

    public static void cubicTimeComplexity(int n) {
        // 3x+9y+8z=79
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if ((3 * i + 9 * j + 8 * k) == 79) {
                        System.out.println(i + "," + j + "," + k);
                    }
                }
            }
        }
    }

    public static void quadraticTimeComplexity() {
        int m = 5;
        int n = 5;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + "," + j);
            }
        }
    }

    public static void linearTimeComplexity() {
        int[] arr = {1, 5, 6, 9};
        int toFind = 6;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                System.out.println("Found at position " + i);
                break;
            }
        }
    }

    public static void constantTimeComplexity() {
        int c = sum(5, 9);
        System.out.println(c);

        // Access array element via index
        int[] arr = {1, 5, 6, 9};
        System.out.println(arr[3]);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    // Binary search
    private static int logarithmicTimeComplexity() {
        // Array must be sorted
        int[] arr = {1, 2, 3, 4, 5};
        int low = 0;
        int high = arr.length - 1;
        int toFind = 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (toFind == arr[mid]) {
                System.out.println(mid);
                return mid;
            } else if (toFind > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(-1);
        return -1;
    }
}
