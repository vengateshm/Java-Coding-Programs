package numberPrograms;

public class ArmstrongNumber {
    public static boolean isArmStrongNumber(int num) {
        int n = num;
        if (n < 0) return false;
        if (n <= 9) return true;

        int digitCount = getDigitCount(n);

        if (digitCount == 2) return false; // No two digit armstrong number exists

        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum = sum + getPowerOfNumber(lastDigit, digitCount);
            n = n / 10;
        }
        return num == sum;
    }

    private static int getDigitCount(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count += 1;
        }
        return count;
    }

    private static int getPowerOfNumber(int num, int powerIndex) {
        int powOfNum = 1;
        for (int i = 0; i < powerIndex; i++) {
            powOfNum = powOfNum * num;
        }
        return powOfNum;
    }
}
