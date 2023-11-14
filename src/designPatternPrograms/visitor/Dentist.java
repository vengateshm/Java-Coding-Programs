package designPatternPrograms.visitor;

public class Dentist implements IPatientVisitor{
    @Override
    public void visit(Patient patient) {
        System.out.println(patient.getFirstName() + " " + patient.getLastName() + " Oral checkup done.");
    }
}
