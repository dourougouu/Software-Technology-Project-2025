// Ticket Class
class Ticket {
    private int ticketId;
    private Concert concert;
    private double price;
    private Seating seating;
    private Customer customer; // Added Customer

    public Ticket(int ticketId, Concert concert, double price) {
        this.ticketId = ticketId;
        this.concert = concert;
        this.price = price;
    }

    public int getTicketId() {
        return ticketId;
    }

    public Concert getConcert() {
        return concert;
    }

    public double getPrice() {
        return price;
    }

    public Seating getSeating() {
        return seating;
    }

    public void setSeating(Seating seating) {
        this.seating = seating;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
