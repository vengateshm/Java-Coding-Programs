package designPatternPrograms.visitor;

public class Hospital {
    public static void main(String[] args) {
        Patient patient = new Patient("Andy", "Johnson");

        // Approach 1
        Physician physician = new Physician();
        patient.attend(physician);
        Dentist dentist = new Dentist();
        patient.attend(dentist);

        // Approach 2
        IPatientVisitor[] visitors = new IPatientVisitor[]{physician, dentist};
        for (IPatientVisitor visitor : visitors) {
            visitor.visit(patient);
        }
    }
}
