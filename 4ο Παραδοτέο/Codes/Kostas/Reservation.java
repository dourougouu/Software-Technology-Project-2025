import java.time.LocalDate;

// Reservation Class
class Reservation {
    private int reservationId;
    private Customer customer;
    private Ticket ticket;
    private Seating seating;
    private Accommodation accommodation;
    private Transportation transportation;
    private LocalDate reservationDate;
    private double totalPrice;

    public Reservation(int reservationId, Customer customer, Ticket ticket, Seating seating, Accommodation accommodation, Transportation transportation) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.ticket = ticket;
        this.seating = seating;
        this.accommodation = accommodation;
        this.transportation = transportation;
        this.reservationDate = LocalDate.now();
        this.totalPrice = calculateTotalPrice();
        this.customer.addReservation(this);
    }

    public int getReservationId() {
        return reservationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Seating getSeating() {
        return seating;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public Transportation getTransportation() {
        return transportation;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private double calculateTotalPrice() {
        double total = 0;
        if (ticket != null) {
            total += ticket.getPrice();
        }
        if (accommodation != null) {
            total += accommodation.getPricePerNight();
        }
        if (transportation != null) {
            total += transportation.getPrice();
        }
        return total;
    }
}
