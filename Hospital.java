import java.util.ArrayList;

class Hospital {
    private final ArrayList<Patient> patients = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void showPatients() {
        for (Patient p : patients) {
            System.out.println("------------");
            p.displayInfo();
        }
    }
}