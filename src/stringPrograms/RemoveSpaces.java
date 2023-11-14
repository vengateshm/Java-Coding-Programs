package stringPrograms;

public class RemoveSpaces {
    public static String removeSpaces(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c != ' ') {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
