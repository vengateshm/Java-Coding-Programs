package utils;

public class ContractEmployee extends Employee{
    private int contractPeriodInMonths;

    public int getContractPeriodInMonths() {
        return contractPeriodInMonths;
    }

    public void setContractPeriodInMonths(int contractPeriodInMonths) {
        this.contractPeriodInMonths = contractPeriodInMonths;
    }
}
