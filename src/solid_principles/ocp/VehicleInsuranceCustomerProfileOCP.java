package solid_principles.ocp;

import java.util.Random;

public class VehicleInsuranceCustomerProfileOCP implements CustomerProfile {
    @Override
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
