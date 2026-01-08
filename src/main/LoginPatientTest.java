package main;

import dao.PatientDAO;
import model.Patient;

public class LoginPatientTest {
    public static void main(String[] args) {

        PatientDAO dao = new PatientDAO();

        Patient patient = dao.loginPatient(
            "debjani@test.com",
            "12345"
        );

        if (patient != null) {
            System.out.println("Login Successful!");
            System.out.println("Welcome, " + patient.getName());
        } else {
            System.out.println("Invalid Email or Password");
        }
    }
}
