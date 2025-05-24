public class TransportationMenu {
    private Customer customer;

    public TransportationMenu(Customer customer) {
        this.customer = customer;
    }

    // Φορτώνει τις διαθέσιμες επιλογές μεταφοράς για τον πελάτη
    public void loadOptions() {
        System.out.println("Loading transportation options for customer: " + customer.getUsername());
        // Εδώ μπορείς να προσθέσεις κώδικα για να φέρεις επιλογές από βάση ή λίστα
    }

    // Διαχειρίζεται την επιλογή του χρήστη
    public void makeChoice(int option) {
        System.out.println("Customer " + customer.getUsername() + " selected option: " + option);
        // Εδώ πρόσθεσε λογική για την επιλογή του πελάτη (π.χ. κράτηση, προβολή κτλ)
    }
}
