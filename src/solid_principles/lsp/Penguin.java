package solid_principles.lsp;

public class Penguin extends Bird{
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}
