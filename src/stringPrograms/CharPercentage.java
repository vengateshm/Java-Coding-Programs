package stringPrograms;

import java.text.DecimalFormat;

public class CharPercentage {
    public static void printCharPercentage(String text) {
        if (text == null) return;
        int length = text.length();
        if (length == 0) return;

        int upperCaseCharCount = 0;
        int lowerCaseCharCount = 0;
        int digitsCount = 0;
        int specialCharactersCount = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCaseCharCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCharCount++;
            } else if (Character.isDigit(ch)) {
                digitsCount++;
            } else {
                specialCharactersCount++;
            }
        }
        double upperCaseCharsPercent = (upperCaseCharCount * 100.0) / length;
        double lowerCaseCharsPercent = (lowerCaseCharCount * 100.0) / length;
        double digitsPercent = (digitsCount * 100.0) / length;
        double specialCharsPercent = (specialCharactersCount * 100.0) / length;

        DecimalFormat format = new DecimalFormat("##.##");

        System.out.println("Upper case characters percentage : " + format.format(upperCaseCharsPercent));
        System.out.println("Lower case characters percentage : " + format.format(lowerCaseCharsPercent));
        System.out.println("Digits percentage : " + format.format(digitsPercent));
        System.out.println("Special characters percentage : " + format.format(specialCharsPercent));
        System.out.println("------------------------------------------------");
    }
}
