public class BookingScreen {
    private Booking booking;

    public BookingScreen(Booking booking) {
        this.booking = booking;
    }

    public void showBookingDetails() {
        if (booking == null) {
            System.out.println("No booking details available.");
            return;
        }

        System.out.println("=== Booking Details ===");
        System.out.println("Booking ID: " + booking.getBookingId());
        System.out.println("User: " + booking.getUser().getUsername());
        System.out.println("Date: " + booking.getBookingDate());
        System.out.println("Details: " + booking.getDetails());
        // Μπορείς να προσθέσεις και άλλες πληροφορίες ανάλογα με το Booking class
    }
}
