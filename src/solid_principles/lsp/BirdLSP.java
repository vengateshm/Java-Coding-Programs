package solid_principles.lsp;

public class BirdLSP extends Animal implements Flyable {
    @Override
    public void fly() {

    }

    @Override
    void move() {
        System.out.println("Birds move");
    }
}
