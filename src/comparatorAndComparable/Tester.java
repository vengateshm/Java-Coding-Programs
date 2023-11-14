package comparatorAndComparable;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        List<Star> starList = new ArrayList<>();

        starList.add(new Star(1, "Anya Ivy"));
        starList.add(new Star(3, "Ava Addams"));
        starList.add(new Star(2, "Eva Notty"));
        starList.add(new Star(2, "Emma Starr"));
        starList.add(new Star(2, "Aletta Ocean"));

        System.out.println(starList);
        Collections.sort(starList);
        System.out.println(starList);

        Collections.sort(starList, Comparator.comparingInt(Star::getId));
        System.out.println(starList);
        Collections.sort(starList, Comparator.comparing(Star::getName));
        System.out.println(starList);
        Collections.sort(starList, (o1, o2) -> {
            if (o1.getId() == o2.getId()) {
                return o1.getName().compareTo(o2.getName());
            } else if (o1.getId() > o2.getId()) {
                return 1;
            } else {
                return -1;
            }
        });
        System.out.println(starList);
    }
}
