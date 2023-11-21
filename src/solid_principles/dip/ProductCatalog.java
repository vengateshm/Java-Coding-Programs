package solid_principles.dip;

public class ProductCatalog {
    // Depends directly on low level module instead abstraction
    // Tight coupling
    private SQLRepository sqlRepository = new SQLRepository();

    // Depends on abstraction
    private ProductRepository productRepository;

    // Dependency injected via constructor - avoids tight coupling
    public ProductCatalog(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
