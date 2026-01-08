package model;

public class Patient {
    private int patientId;
    private String name;
    private String email;
    private String password;

    public Patient(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
}

