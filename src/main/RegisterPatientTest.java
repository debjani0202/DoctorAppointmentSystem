package main;

import dao.PatientDAO;
import model.Patient;

public class RegisterPatientTest {
    public static void main(String[] args) {
        Patient p = new Patient("Debjani", "debjani@test.com", "12345");

        PatientDAO dao = new PatientDAO();
        boolean result = dao.registerPatient(p);

        if (result) {
            System.out.println("Patient Registered Successfully!");
        } else {
            System.out.println("Registration Failed!");
        }
    }
}
