public class Inpatient extends Patient {
    private int roomNumber;

    public Inpatient(int id, String name, int age, int roomNumber) {
        super(id, name, age);
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayInfo() {
        //implementation
        super.displayInfo();
        System.out.println("Room Number: " + roomNumber);
    }
}
