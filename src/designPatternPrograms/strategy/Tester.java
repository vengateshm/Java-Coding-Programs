package designPatternPrograms.strategy;

public class Tester {
    public static void main(String[] args) {
        PaymentStrategy gPayStrategy = new GPayStrategy();
        PaymentStrategy creditCardStrategy = new CreditCardStrategy();
        PaymentService service = new PaymentService();
        service.setPaymentStrategy(gPayStrategy);
        service.processOrder();
        service.setPaymentStrategy(creditCardStrategy);
        service.processOrder();
    }
}
