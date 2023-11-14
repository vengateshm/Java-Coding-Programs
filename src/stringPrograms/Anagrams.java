package stringPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        String s3 = s1.replaceAll("\\s", "").toLowerCase();
        String s4 = s2.replaceAll("\\s", "").toLowerCase();

        if (s3.length() == 1 && s4.length() == 1) {
            return s3.equals(s4);
        }

        if (s3.length() != s4.length()) {
            return false;
        }

        char[] c1 = s3.toCharArray();
        char[] c2 = s4.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    public static boolean isAnagram1(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        String s3 = s1.replaceAll("\\s", "").toLowerCase();
        String s4 = s2.replaceAll("\\s", "").toLowerCase();

        if (s3.length() == 1 && s4.length() == 1) {
            return s3.equals(s4);
        }

        if (s3.length() != s4.length()) {
            return false;
        }

        for (int i = 0; i < s3.length(); i++) {
            int index = s4.indexOf(s3.charAt(i));
            if (index == -1)
                return false;
        }

        return true;
    }

    public static boolean isAnagram2(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        String s3 = s1.replaceAll("\\s", "").toLowerCase();
        String s4 = s2.replaceAll("\\s", "").toLowerCase();

        if (s3.length() == 1 && s4.length() == 1) {
            return s3.equals(s4);
        }

        if (s3.length() != s4.length()) {
            return false;
        }

        char[] c1 = s3.toCharArray();
        char[] c2 = s4.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s3.length(); i++) {
            if (map1.get(c1[i]) == null) {
                map1.put(c1[i], 1);
            } else {
                map1.put(c1[i], map1.get(c1[i]) + 1);
            }

            if (map2.get(c2[i]) == null) {
                map2.put(c2[i], 1);
            } else {
                map2.put(c2[i], map2.get(c2[i]) + 1);
            }
        }

        return map1.equals(map2);
    }
}
