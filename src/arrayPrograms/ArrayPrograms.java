package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class ArrayPrograms {
    // Find leaders in an array
    public static void findLeaders(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int length = arr.length;

        if (length == 1) {
            System.out.print(arr[0]);
            return;
        }

        int max = arr[length - 1];
        System.out.print(max + " ");

        for (int i = length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }
    }

    // Find intersection of two arrays
    public static void findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int e : arr1) {
            set1.add(e);
        }
        for (int e : arr2) {
            set2.add(e);
        }

        set1.retainAll(set2);

        System.out.println(set1);
    }

    // Find intersection of two arrays
    public static void findIntersection1(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int e : arr1) {
            set1.add(e);
        }

        // Using contains
        for (int e : arr2) {
            if (set1.contains(e)) {
                System.out.print(e + " ");
            }
        }

        // Using add
        /*for (int e : arr2) {
            if (!set1.add(e)) {
                System.out.print(e + " ");
            }
        }*/
    }

    public static String[] sortArrayAscending(String[] arr) {
        int length = arr.length;

        String temp;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static String[] sortArrayDescending(String[] arr) {
        int length = arr.length;

        String temp;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) < 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] getOddNumbers(int[] arr) {
        int oddNoCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNoCount++;
            }
        }

        int[] result = new int[oddNoCount];
        int resultIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[resultIndex] = arr[i];
                resultIndex += 1;
            }
        }

        return result;
    }

    public static int[] removeArrayElement(int[] arr, int element) {
        int length = arr.length;
        int[] newArr = new int[length - 1];

        int newArrIndex = 0;
        for (int j : arr) {
            if (j != element) {
                newArr[newArrIndex++] = j;
            }
        }

        return newArr;
    }
}
