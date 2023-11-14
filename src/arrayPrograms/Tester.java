package arrayPrograms;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
//        checkStringArraySorting();
//        checkArrayIntersection();
//        checkLeadersInArray();
//        checkGetOddNumberArray();
//        checkSmallestSubArrayLength();
        //System.out.println(remove_duplicate(new int[]{2, 5, 5, 6}, 4));
        System.out.println(Arrays.toString(ArrayPrograms.removeArrayElement(new int[]{3,4,5,8},5)));
    }

    private static void checkSmallestSubArrayLength() {
        int length = SmallestSubArray.minSubArrayLength(new int[]{7, 2, 1, 1, 6, 5}, 11);
        System.out.println(length);
    }

    private static void checkGetOddNumberArray() {
        int[] result = ArrayPrograms.getOddNumbers(new int[]{2, 4, 6, 8, 10, 3, 5, 7});
        System.out.println(Arrays.toString(result));
    }

    private static void checkStringArraySorting() {
        String[] ascRes = ArrayPrograms.sortArrayAscending(new String[]{"GRAPES", "banana", "aPPle"});
        System.out.println(Arrays.toString(ascRes));
        String[] descRes = ArrayPrograms.sortArrayDescending(new String[]{"Banana", "Avocado", "Peach"});
        System.out.println(Arrays.toString(descRes));
    }

    private static void checkArrayIntersection() {
        ArrayPrograms.findIntersection(new int[]{1, 2, 3, 4, 8}, new int[]{1, 2, 3, 4, 8});
        ArrayPrograms.findIntersection(new int[]{1, 2, 3, 4, 8}, new int[]{4, 8});
    }

    private static void checkLeadersInArray() {
        ArrayPrograms.findLeaders(new int[]{1, 2, 3, 4});
        System.out.println();
        ArrayPrograms.findLeaders(new int[]{4, 3, 2, 1});
        System.out.println();
        ArrayPrograms.findLeaders(new int[]{4, 3, 2, 1, 8, 8});
        System.out.println();
        ArrayPrograms.findLeaders(new int[]{900});
        System.out.println();
        ArrayPrograms.findLeaders(new int[]{9, 9, 9, 9, 9});
    }

    // Remove duplicates from sorted array, no set or hashmap
    public static int remove_duplicate(int[] arr, int n) { // Returns modified size
        // T:O(N), S:O(1)
        // {2,2,2,11}

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        // For last element
        arr[j++] = arr[n - 1];

        return j;
    }
}
