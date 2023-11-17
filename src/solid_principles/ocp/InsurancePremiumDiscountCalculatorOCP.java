package solid_principles.ocp;

public class InsurancePremiumDiscountCalculatorOCP {
    public int calculatePremiumDiscountPercent(CustomerProfile profile) {
        if (profile.isLoyalCustomer()) {
            return 20;
        }
        return 10;
    }
}
