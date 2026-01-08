package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Slot {

    private int doctorId;
    private LocalDate date;
    private LocalTime time;

    public Slot(int doctorId, LocalDate date, LocalTime time) {
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }
}

