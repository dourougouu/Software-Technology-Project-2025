public class ManageBookingClass {
    private DB db = new DB();

    public void updateBooking(Booking booking) {
        db.updateDB(booking);
    }

    public void deleteBooking(Booking booking) {
        db.deleteFromDB(booking);
    }

    public void viewBooking() {
        db.selectFromDB("SELECT * FROM bookings");
    }
}
