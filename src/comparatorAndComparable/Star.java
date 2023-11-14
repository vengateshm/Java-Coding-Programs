package comparatorAndComparable;

public class Star implements Comparable<Star> {
    private int id;
    private String name;

    public Star(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Star star) {
        return Integer.compare(id, star.getId());
    }

    @Override
    public String toString() {
        return "Star{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
