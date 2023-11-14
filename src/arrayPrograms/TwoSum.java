package arrayPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public boolean doesSumExist(int[] arr, int sumValue) {
        // Array must be sorted
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] + arr[end] > sumValue) {
                end--;
            } else if (arr[start] + arr[end] < sumValue) {
                start++;
            } else {
                return true;
            }
        }

        return false;
    }

    public int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] byHashMap(int nums[], int target) {
        HashMap<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{complementIndex, i};
            } else {
                complements.put(target - nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
//        System.out.println(twoSum.doesSumExist(new int[]{1, 2, 9, 10}, 15));
        // Exactly one solution
        System.out.println(Arrays.toString(twoSum.bruteForce(new int[]{5, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum.byHashMap(new int[]{5, 2, 4}, 6)));
    }
}
