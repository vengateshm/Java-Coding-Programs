package solid_principles.ocp;

public class InsurancePremiumDiscountCalculator {
    public int calculatePremiumDiscountPercent(HealthInsuranceCustomerProfile profile) {
        if (profile.isLoyalCustomer()) {
            return 20;
        }
        return 10;
    }

    public int calculatePremiumDiscountPercent(VehicleInsuranceCustomerProfile profile) {
        if (profile.isLoyalCustomer()) {
            return 20;
        }
        return 10;
    }
}
