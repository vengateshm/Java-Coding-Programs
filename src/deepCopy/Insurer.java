package deepCopy;

import java.util.List;

public class Insurer {
    private String name;
    private List<Nominee> nominees;

    public Insurer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Nominee> getNominees() {
        return nominees;
    }

    public void setNominees(List<Nominee> nominees) {
        this.nominees = nominees;
    }
}
