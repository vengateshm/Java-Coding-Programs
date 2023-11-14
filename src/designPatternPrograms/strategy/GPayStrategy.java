package designPatternPrograms.strategy;

public class GPayStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paid via GPay.");
    }

    @Override
    public boolean collectPaymentDetails() {
        return false;
    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }
}
