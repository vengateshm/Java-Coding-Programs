package core_java_interview.final_class;

import java.util.Collections;
import java.util.Date;
import java.util.List;

// Mark class as final
final public class EmployeeFinal {
    // Declare all instance variables as private final
    private final String name;
    private final Date dob;
    private final List<String> mobile;
    private final EmployeeAddress address;

    public EmployeeFinal(String name, Date dob, List<String> mobile, EmployeeAddress address) {
        this.name = name;
        this.dob = dob;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        //return dob;
        // Instead return cloned version
        return (Date) dob.clone();
    }

    public List<String> getMobile() {
        //return mobile;
        // Instead return unmodifiable list
        return Collections.unmodifiableList(mobile);
    }

    public EmployeeAddress getAddress() {
        return new EmployeeAddress(address.getCity(), address.getZip());
    }

    @Override
    public String toString() {
        return "EmployeeFinal{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", mobile=" + mobile +
                '}';
    }
}
