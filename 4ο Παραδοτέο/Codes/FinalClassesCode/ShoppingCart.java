import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Customer customer;
    private List<Item> cartItems = new ArrayList<>();
    private String paymentMethod;
    private boolean infoConfirmed = false;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
    }

    public void addItem(Item item) {
        cartItems.add(item);
    }

    public void removeItem(Item item) {
        cartItems.remove(item);
    }

    public void addTransportationTicket(String origin, String destination) {
        TransportationTicket ticket = new TransportationTicket(origin, destination);
        addItem(ticket);
        System.out.println("Transportation ticket added: " + origin + " -> " + destination);
    }

    public void addConcertTicket(String artist, String venue) {
        ConcertTicket ticket = new ConcertTicket(artist, venue);
        addItem(ticket);
        System.out.println("Concert ticket added: " + artist + " at " + venue);
    }

    public void addAccommodation(String hotelName, int nights) {
        Accommodation accommodation = new Accommodation(hotelName, nights);
        addItem(accommodation);
        System.out.println("Accommodation added: " + hotelName + " for " + nights + " nights");
    }

    public void selectPaymentMethod(String method) {
        this.paymentMethod = method;
        System.out.println("Payment method selected: " + method);
    }

    public void confirmInfo() {
        this.infoConfirmed = true;
        System.out.println("Information confirmed.");
    }

    public void checkout() {
        if (!infoConfirmed) {
            System.out.println("Please confirm your information before checkout.");
            return;
        }
        if (paymentMethod == null || paymentMethod.isEmpty()) {
            System.out.println("Please select a payment method before checkout.");
            return;
        }
        System.out.println("Proceeding to checkout for " + customer.getUsername());
        System.out.println("Items in cart: " + cartItems.size());
        System.out.println("Payment method: " + paymentMethod);
        // Εδώ θα μπορούσε να ακολουθήσει η διαδικασία πληρωμής, κτλ.
    }
}
