package designPatternPrograms.visitor;

public class Patient {
    private String firstName;
    private String lastName;

    public void attend(IPatientVisitor visitor) {
        visitor.visit(this);
    }

    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
