package solid_principles.dip;

public class EcommerceApp {
    public static void main(String[] args) {
        // IOC - Inversion Of Control
        // Delegated to a framework
        // e.g. SpringBoot, Spring IOC container
        ProductRepository productRepository = new SQLRepository();
        ProductCatalog productCatalog = new ProductCatalog(productRepository);
    }
}
