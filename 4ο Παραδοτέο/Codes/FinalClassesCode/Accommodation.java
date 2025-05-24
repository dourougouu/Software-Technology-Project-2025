import java.time.LocalDate;
import java.time.LocalTime;

public class Accommodation {
    private String accommodationID;
    private String accommodationType;
    private String roomType;
    private LocalDate date;
    private LocalTime time;
    private String extraInfo;

    public Accommodation(String accommodationID, String accommodationType, String roomType,
                         LocalDate date, LocalTime time, String extraInfo) {
        this.accommodationID = accommodationID;
        this.accommodationType = accommodationType;
        this.roomType = roomType;
        this.date = date;
        this.time = time;
        this.extraInfo = extraInfo;
    }
}
