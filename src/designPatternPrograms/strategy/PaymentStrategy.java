package designPatternPrograms.strategy;

public interface PaymentStrategy {
    void pay();
    boolean collectPaymentDetails();
    boolean validatePaymentDetails();
}
