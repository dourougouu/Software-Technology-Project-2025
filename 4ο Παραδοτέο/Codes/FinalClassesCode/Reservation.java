import java.time.LocalDateTime;

public class Reservation {
    private int ReservationID;
    private LocalDateTime ReservationDateTime;
    private String ReservationType;
    private Customer customer;
    private Admin admin;

    public Reservation(String reservationID, LocalDateTime reservationDateTime,
                       String reservationType, Customer customer, Admin admin) {
        this.ReservationID = reservationID;
        this.ReservationDateTime = reservationDateTime;
        this.ReservationType = reservationType;
        this.Customer = customer;
        this.Admin = admin;
    }
}
