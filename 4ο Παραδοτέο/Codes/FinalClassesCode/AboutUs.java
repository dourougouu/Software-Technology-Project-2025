import java.time.LocalDate;
import java.time.LocalTime;

public class AboutUs {
    private int messageID;
    private LocalDate Date;
    private LocalTime Time;

    // Κατασκευαστής
    public AboutUs(int messageID, LocalDate date, LocalTime time) {
        this.messageID = messageID;
        this.date = date;
        this.time = time;
    }
}
