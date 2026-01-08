package dao;



import model.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatientDAO {

    public boolean registerPatient(Patient patient) {
        String sql = "INSERT INTO patients(name, email, password) VALUES(?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, patient.getName());
            ps.setString(2, patient.getEmail());
            ps.setString(3, patient.getPassword());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Patient loginPatient(String email, String password) {

    String sql = "SELECT * FROM patients WHERE email = ? AND password = ?";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, email);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return new Patient(
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("password")
            );
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return null; // login failed
}

}
