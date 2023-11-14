package arrayPrograms;

public class SmallestSubArray {
    public static int minSubArrayLength(int[] nums, int k) {
        int minLength = Integer.MAX_VALUE;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum >= k) {
                    minLength = Math.min(minLength, (j - i) + 1);
                    break;
                }
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
