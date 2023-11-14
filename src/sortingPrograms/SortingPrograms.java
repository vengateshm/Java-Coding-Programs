package sortingPrograms;

import java.util.Arrays;

public class SortingPrograms {
    public static void main(String[] args) {
//        bubbleSort(new int[]{4, 3, 5, 1, 2});
        bubbleSortOptimized(new int[]{4, 3, 5, 1, 2});
    }

    public static void bubbleSort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr.length - 1 - i);
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSortOptimized(int[] arr) {
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr.length - 1 - i);
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(!swap){
                return;
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
