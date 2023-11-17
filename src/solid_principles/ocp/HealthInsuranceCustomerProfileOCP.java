package solid_principles.ocp;

public class HealthInsuranceCustomerProfileOCP implements CustomerProfile{
    @Override
    public boolean isLoyalCustomer() {
        return false;
    }
}
