package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AppointmentDAO {

    public boolean bookAppointment(int patientId, int slotId) {

        String insertAppointment =
                "INSERT INTO appointments(patient_id, slot_id, status) VALUES (?, ?, 'BOOKED')";

        String updateSlot =
                "UPDATE slots SET is_available = false WHERE slot_id = ?";

        try (Connection con = DBConnection.getConnection()) {

            con.setAutoCommit(false); // start transaction

            try (PreparedStatement ps1 = con.prepareStatement(insertAppointment);
                 PreparedStatement ps2 = con.prepareStatement(updateSlot)) {

                ps1.setInt(1, patientId);
                ps1.setInt(2, slotId);
                ps1.executeUpdate();

                ps2.setInt(1, slotId);
                ps2.executeUpdate();

                con.commit(); // commit transaction
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
