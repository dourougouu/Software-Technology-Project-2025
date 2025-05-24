public class Booking {
    private Reservation reservation;

    public Booking(Reservation reservation, String bookingStatus) {
        this.reservation = reservation;
        this.bookingStatus = bookingStatus;
    }

}
