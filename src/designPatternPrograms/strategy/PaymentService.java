package designPatternPrograms.strategy;

public class PaymentService {
    private double cost;
    public boolean includeDelivery;

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder() {
        paymentStrategy.collectPaymentDetails();
        if (paymentStrategy.validatePaymentDetails()) {
            paymentStrategy.pay();
        }
    }

    public double getTotal() {
        return includeDelivery ? 10.0 + cost : cost;
    }
}
