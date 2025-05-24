import java.time.LocalDate;
import java.time.LocalTime;

public class Concert {
    private int ConcertID;
    private String ConcertType;
    private String Artist;
    private LocalDate Date;
    private LocalTime Time;
    private int Seat;

    public Concert(String concertID, String concertType, String artist, LocalDate date, LocalTime time, int seat) {
        this.concertID = concertID;
        this.concertType = concertType;
        this.artist = artist;
        this.date = Date;
        this.time = Time;
        this.seat = Seat;
    }
}
