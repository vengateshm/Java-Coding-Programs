package numberPrograms;

public class StringToInt {
    public static int convert(String numString) {
        int length = numString.length();

        if (length == 1) {
            return numString.charAt(0) - (int) '0';
        }

        int cumSum = 0;

        for (int i = 0; i < length; i++) {
            cumSum = cumSum * 10 + (((int) numString.charAt(i)) - 48); // 48 ASCII value of 0, find the shift
        }

        return cumSum;
    }

    public static int convert1(String numString) {
        if (numString.length() == 1) {
            return numString.charAt(0) - (int) '0';
        }
        char[] chars = numString.toCharArray();
        int cumSum = 0;
        int zeroAscii = '0';

        for (char aChar : chars) {
            cumSum = cumSum * 10 + ((int) aChar - zeroAscii); // 48 ASCII value of 0, find the shift
        }

        return cumSum;
    }
}
