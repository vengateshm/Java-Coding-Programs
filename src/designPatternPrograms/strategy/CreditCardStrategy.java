package designPatternPrograms.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paid by credit card.");
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
