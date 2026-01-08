package dao;

import model.Slot;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SlotDAO {

    public boolean addSlot(Slot slot) {

        String sql = "INSERT INTO slots(doctor_id, slot_date, slot_time) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, slot.getDoctorId());
            ps.setDate(2, java.sql.Date.valueOf(slot.getDate()));
            ps.setTime(3, java.sql.Time.valueOf(slot.getTime()));

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
