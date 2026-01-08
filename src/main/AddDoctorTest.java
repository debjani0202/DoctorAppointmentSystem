package main;

import dao.DoctorDAO;
import model.Doctor;

public class AddDoctorTest {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Dr. Sharma", "Cardiologist");

        DoctorDAO dao = new DoctorDAO();
        boolean result = dao.addDoctor(doctor);

        if (result) {
            System.out.println("Doctor Added Successfully!");
        } else {
            System.out.println("Failed to Add Doctor");
        }
    }
}
