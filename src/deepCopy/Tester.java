package deepCopy;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Insurer> insurerList = new ArrayList<>();
        Insurer insurer1 = new Insurer("Insurer1");
        Nominee nominee1 = new Nominee("Nominee1");
        Nominee nominee2 = new Nominee("Nominee2");
        List<Nominee> nominees1 = new ArrayList<>();
        nominees1.add(nominee1);
        nominees1.add(nominee2);
        insurer1.setNominees(nominees1);

        Insurer insurer2 = new Insurer("Insurer2");
        Nominee nominee3 = new Nominee("Nominee3");
        Nominee nominee4 = new Nominee("Nominee4");
        List<Nominee> nominees2 = new ArrayList<>();
        nominees2.add(nominee3);
        nominees2.add(nominee4);
        insurer2.setNominees(nominees2);

        insurerList.add(insurer1);
        insurerList.add(insurer2);

        List<Insurer> insurerListCopy = new ArrayList<>(insurerList);
        insurerListCopy.size();
    }
}
