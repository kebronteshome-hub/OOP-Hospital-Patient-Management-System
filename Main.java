public class Main {
      static void  main(String[] args) {

        Hospital hospital = new Hospital();

        Inpatient p1 = new Inpatient(1, "John", 30, 101);
        Outpatient p2 = new Outpatient(2, "Sara", 25, "2026-05-01");

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.showPatients();
    }
}