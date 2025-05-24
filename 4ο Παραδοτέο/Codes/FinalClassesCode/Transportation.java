import java.time.LocalDate;
import java.time.LocalTime;

public class Transportation {
    private int ΤransportationID;
    private String ΤransportationType;
    private LocalDate Date;
    private LocalTime Time;
    private int Seat;

    public Transportation(String transportationID, String transportationType, LocalDate date, LocalTime time, int seat) {
        this.transportationID = transportationID;
        this.transportationType = transportationType;
        this.date = Date;
        this.time = Time;
        this.seat = Seat;
    }
}
