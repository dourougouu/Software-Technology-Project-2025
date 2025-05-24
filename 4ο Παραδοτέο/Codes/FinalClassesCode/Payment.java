public class Payment {
    private int paymentID;      // Unique ID for the payment
    private Customer customer;     // Customer who made the payment
    private String PaymentMethod;  // Payment method (e.g. credit card, cash)
    private double amount;         // Amount paid

    public Payment(String paymentID, Customer customer, String PaymentMethod, double amount) {
        this.paymentID = paymentID;
        this.customer = customer;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

}
