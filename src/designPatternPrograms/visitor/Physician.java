package designPatternPrograms.visitor;

public class Physician implements IPatientVisitor {
    @Override
    public void visit(Patient patient) {
        System.out.println(patient.getFirstName() + " " + patient.getLastName() + " General checkup done.");
    }
}
