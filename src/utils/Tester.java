package utils;

import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        ContractEmployee e = new ContractEmployee();
        e.setFirstName("Vengatesh");
        e.setLastName("M");
        e.setAge(29);
        e.setContractPeriodInMonths(11);

        Map<String,String> map = ReflectionUtils.objectToFieldsMap(e);
        map.size();
        String objStr = ReflectionUtils.getObjectString(e);
        objStr.length();
    }
}
