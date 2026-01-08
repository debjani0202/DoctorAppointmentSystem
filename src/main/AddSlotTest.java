package main;

import dao.SlotDAO;
import model.Slot;
import java.time.LocalDate;
import java.time.LocalTime;

public class AddSlotTest {
    public static void main(String[] args) {

        // IMPORTANT: use an existing doctor_id from DB
        Slot slot = new Slot(
            1,
            LocalDate.now().plusDays(1),
            LocalTime.of(10, 0)
        );

        SlotDAO dao = new SlotDAO();
        boolean result = dao.addSlot(slot);

        if (result) {
            System.out.println("Slot Added Successfully!");
        } else {
            System.out.println("Failed to Add Slot");
        }
    }
}
