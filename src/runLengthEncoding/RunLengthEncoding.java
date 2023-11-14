package runLengthEncoding;

import java.util.regex.Pattern;

public class RunLengthEncoding {
    public static String compress(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int charCount = 1;
            while (i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1)) {
                charCount++;
                i++;
            }
            sb.append(text.charAt(i)).append(charCount);
        }
        return sb.toString();
    }

    public static String decompress(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                int characterCount = Character.getNumericValue(text.charAt(i));
                while (characterCount-- > 0) sb.append(text.charAt(i - 1));
            }
        }
        return sb.toString();
    }

    public static String compress1(String text) {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("(([a-zA-z])\\2*)");
        pattern.matcher(text).results().forEach(matchResult -> {
            int repetitions = matchResult.group(1).length();
            sb.append(matchResult.group(2)).append(repetitions);
        });
        return sb.toString();
    }

    public static String decompress1(String text) {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("([a-zA-Z])([0-9]*)");
        pattern.matcher(text).results().forEach(matchResult -> {
            int repetitions = Integer.parseInt(matchResult.group(2));
            while (repetitions-- > 0) sb.append(matchResult.group(1));
        });
        return sb.toString();
    }
}
