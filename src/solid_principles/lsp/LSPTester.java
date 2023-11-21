package solid_principles.lsp;

import java.util.ArrayList;
import java.util.List;

public class LSPTester {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        Bird b2 = new Penguin();
        b1.fly();
        //b2.fly();

        Animal birdLSP = new BirdLSP();
        Animal penguinLSP = new PenguinLSP();
        birdLSP.move();
        penguinLSP.move();

        List<Product> products = new ArrayList<>();
        products.add(new Product());
        products.add(new InHouseProduct());

        double totalDiscount = 0.0;
        for (Product product : products) {
            // Avoid downcasting
            /*if (product instanceof InHouseProduct) {
                ((InHouseProduct) product).applyExtraDiscount();
            }*/
            totalDiscount = totalDiscount + product.getDiscount();
        }
        System.out.println("Total discount " + totalDiscount);
    }
}
