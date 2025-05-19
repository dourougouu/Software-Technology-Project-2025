import java.util.List;
import java.util.ArrayList;

// Customer Class
class Customer extends User {
    private int customerId;
    private List<Ticket> purchasedTickets;
    private List<Reservation> reservations;

    public Customer(int customerId, String name, String email, String password, int id) {
        super(customerId, name, email, password);
        this.customerId = id;
        this.purchasedTickets = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void addPurchasedTicket(Ticket ticket) {
        this.purchasedTickets.add(ticket);
    }

    public List<Ticket> getPurchasedTickets() {
        return purchasedTickets;
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}