package solid_principles.lsp;

public class InHouseProduct extends Product {
    public void applyExtraDiscount() {
        discount = discount * 1.5;
    }

    @Override
    public double getDiscount() {
        applyExtraDiscount();
        return discount;
    }
}
