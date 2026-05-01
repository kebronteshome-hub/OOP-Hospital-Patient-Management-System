public class Outpatient extends Patient {
    private String appointmentDate;

    public Outpatient(int id, String name, int age, String appointmentDate) {
        super(id, name, age);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Appointment Date: " + appointmentDate);
    }
}
