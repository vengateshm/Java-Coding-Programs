package solid_principles.ocp;

public class HouseInsuranceCustomerProfileOCP implements CustomerProfile{
    @Override
    public boolean isLoyalCustomer() {
        return false;
    }
}
