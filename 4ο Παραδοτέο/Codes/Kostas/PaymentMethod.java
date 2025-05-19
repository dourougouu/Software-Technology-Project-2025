public class PaymentMethod {
    private int paymentMethodId;
    private String type; // e.g., "Credit Card", "PayPal"
    private String details; // e.g., credit card number, PayPal email
    private User user; // Added user

    public PaymentMethod(int paymentMethodId, String type, String details, User user) {
        this.paymentMethodId = paymentMethodId;
        this.type = type;
        this.details = details;
        this.user = user;
    }

    // Getters and Setters
    public int getPaymentMethodId() { return paymentMethodId; }
    public void setPaymentMethodId(int paymentMethodId) { this.paymentMethodId = paymentMethodId; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
