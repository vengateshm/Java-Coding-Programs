package stringPrograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args) {
//        checkCharPercentage();
//        checkAnagrams();
//        removeSpaces();

        // String or int array to string
        String arr[] = new String[]{"A", "B", "C"};
        System.out.println(String.join(";", arr));
        System.out.println(Arrays.asList("c", "d", "e").stream().collect(Collectors.joining("|")));
        System.out.println(Arrays.asList(1, 2, 3).stream().map(s -> s.toString()).collect(Collectors.joining(":")));

        StringBuilder sb = new StringBuilder();
        int len=0;
        for (String s : arr) {
            sb.append(s);
            len = sb.length();
            sb.append("#");
        }
        System.out.println(sb.substring(0, len));
    }

    private static void removeSpaces() {
        var op = RemoveSpaces.removeSpaces("thr ough");
        System.out.println(op);
    }

    private static void checkAnagrams() {
//        System.out.println(Anagrams.isAnagram(null, null));
//        System.out.println(Anagrams.isAnagram(null, ""));
//        System.out.println(Anagrams.isAnagram("s", null));
//        System.out.println(Anagrams.isAnagram("LIVE", "EVIL"));
//        System.out.println(Anagrams.isAnagram("BAT   ", "tab"));
//        System.out.println(Anagrams.isAnagram("  car ", "a     r    c"));
//        System.out.println(Anagrams.isAnagram("POT", "TOP"));
//        System.out.println(Anagrams.isAnagram("A", "   a   "));
//        System.out.println(Anagrams.isAnagram("d    ", "    b"));
//        System.out.println(Anagrams.isAnagram("joy", "en  j  oy"));
//        System.out.println(Anagrams.isAnagram("a ct", "ca   t  "));
//        System.out.println(Anagrams.isAnagram("", ""));

//        System.out.println(Anagrams.isAnagram1(null, null));
//        System.out.println(Anagrams.isAnagram1(null, ""));
//        System.out.println(Anagrams.isAnagram1("s", null));
//        System.out.println(Anagrams.isAnagram1("LIVE", "EVIL"));
//        System.out.println(Anagrams.isAnagram1("BAT   ", "tab"));
//        System.out.println(Anagrams.isAnagram1("  car ", "a     r    c"));
//        System.out.println(Anagrams.isAnagram1("POT", "TOP"));
//        System.out.println(Anagrams.isAnagram1("A", "   a   "));
//        System.out.println(Anagrams.isAnagram1("d    ", "    b"));
//        System.out.println(Anagrams.isAnagram1("joy", "en  j  oy"));
//        System.out.println(Anagrams.isAnagram1("a ct", "ca   t  "));
//        System.out.println(Anagrams.isAnagram1("", ""));

        System.out.println(Anagrams.isAnagram2("boon", "noob"));
        System.out.println(Anagrams.isAnagram2(null, null));
        System.out.println(Anagrams.isAnagram2(null, ""));
        System.out.println(Anagrams.isAnagram2("s", null));
        System.out.println(Anagrams.isAnagram2("LIVE", "EVIL"));
        System.out.println(Anagrams.isAnagram2("BAT   ", "tab"));
        System.out.println(Anagrams.isAnagram2("  car ", "a     r    c"));
        System.out.println(Anagrams.isAnagram2("POT", "TOP"));
        System.out.println(Anagrams.isAnagram2("A", "   a   "));
        System.out.println(Anagrams.isAnagram2("d    ", "    b"));
        System.out.println(Anagrams.isAnagram2("joy", "en  j  oy"));
        System.out.println(Anagrams.isAnagram2("a ct", "ca   t  "));
        System.out.println(Anagrams.isAnagram2("", ""));
    }

    private static void checkCharPercentage() {
        CharPercentage.printCharPercentage(null);
        CharPercentage.printCharPercentage("");
        CharPercentage.printCharPercentage("12AAbb$#");
        CharPercentage.printCharPercentage("Vengatesh");
        CharPercentage.printCharPercentage("1$");
    }
}
