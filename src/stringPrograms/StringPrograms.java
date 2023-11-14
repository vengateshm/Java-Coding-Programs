package stringPrograms;

import com.google.common.base.Splitter;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringPrograms {
    public static void main(String[] args) {
//        checkStringsAreEqual("jon", "jon");
//        sortStringConvertingToCharArray("Terraform");
//        splitStringInDifferentWays();
//        findEvenLengthWordsInString("Hi hello good");
//        checkAnagram("race", "care");
//        subSetOfString("FUN");
//        printWordAndTheirCount("Hello Java");
//        recursiveStringReverse("Sandy");
        findFirstNonRepeatingCharacterInString("iolvejavatechie");
    }

    public static void checkStringsAreEqual(String s1, String s2) {
        boolean isEqual = true;
        if (s1.length() != s2.length()) {
            isEqual = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }
        System.out.println("Are Equal ? " + isEqual);
    }

    public static void sortStringConvertingToCharArray(String value) {
        char[] chars = value.toLowerCase().toCharArray();
        Arrays.sort(chars);
        String result = new String(chars);
        System.out.println(result);
    }

    public static void splitStringInDifferentWays() {
        String str = "91-9715215525";
        //Split method
        System.out.println(Arrays.toString(str.split("-")));
        //Pattern compile
        List<String> collect = Pattern.compile("-").splitAsStream(str)
                .collect(Collectors.toList());
        System.out.println(collect);
        //StringTokenizer
        StringTokenizer tokenizer = new StringTokenizer(str, "-");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        //StringUtils - Apache commons
        String[] split = StringUtils.split(str, "-");
        System.out.println(Arrays.toString(split));
        //Splitter - Guava
        Iterable<String> split1 = Splitter.on("-").split(str);
        split1.forEach(System.out::println);
    }

    public static void findEvenLengthWordsInString(String str) {
        for (String s : str.split(" ")) {
            if (s.length() % 2 == 0) {
                System.out.println(s);
            }
        }
    }

    // Anagram - convert string to char array
    public static void checkAnagram(String str1, String str2) {
        boolean isAnagram = true;
        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            isAnagram = Arrays.equals(c1, c2);
        }
        System.out.println("Is Anagram ? " + isAnagram);
    }

    public static void subSetOfString(String value) {
        //FUN
        //F
        //FU
        //FUN
        //U
        //UN
        //N
        // substring - end index exclusive
        for (int i = 0; i < value.length(); i++) { // Fix each character position
            for (int j = i; j < value.length(); j++) {
                //System.out.println(i + ", " + (j + 1));
                System.out.println(value.substring(i, j + 1));
            }
        }
    }

    // Print individual word and their count
    public static void printWordAndTheirCount(String str) {
        // Hello World
        char[] chars = str.toCharArray();
        // Now this contains spaces also
        for (int i = 0; i < chars.length; i++) {
            StringBuilder sb = new StringBuilder();
            while (i < chars.length && chars[i] != ' ') {
                sb.append(chars[i]);
                i++;
            }
            if (sb.length() > 0)
                System.out.println(sb + "-" + sb.length());
        }
    }

    // Reverse string using recursion
    public static String recursiveStringReverse(String s) {
        System.out.println(s);
        if (s == null || s.length() <= 1) {
            return s;
        }
        String res = recursiveStringReverse(s.substring(1)) + s.charAt(0);
        System.out.println(res);
        return res;
    }

    public static void findFirstNonRepeatingCharacterInString(String str) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            charMap.put(c, charMap.containsKey(c) ? charMap.get(c) + 1 : 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
