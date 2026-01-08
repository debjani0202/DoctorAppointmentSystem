package dao;

import model.Doctor;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DoctorDAO {

    public boolean addDoctor(Doctor doctor) {

        String sql = "INSERT INTO doctors(name, specialization) VALUES (?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, doctor.getName());
            ps.setString(2, doctor.getSpecialization());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
