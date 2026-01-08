package main;

import dao.AppointmentDAO;

public class BookAppointmentTest {
    public static void main(String[] args) {

        AppointmentDAO dao = new AppointmentDAO();

        boolean result = dao.bookAppointment(1, 1); // patient_id = 1, slot_id = 1

        if (result) {
            System.out.println("Appointment Booked Successfully!");
        } else {
            System.out.println("Booking Failed!");
        }
    }
}
