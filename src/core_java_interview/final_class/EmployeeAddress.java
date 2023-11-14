package core_java_interview.final_class;

// Mutable class
public class EmployeeAddress {
    private String city;
    private String zip;

    public EmployeeAddress() {
    }

    public EmployeeAddress(String city, String zip) {
        this.city = city;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
