public class AltSearchResultScreen {
    private DB db = new DB();
    private String selectedPaymentMethod;

    // Εμφανίζει την εναλλακτική οθόνη αποτελεσμάτων
    public void display() {
        System.out.println("Displaying alternative search results...");
        // Π.χ. θα μπορούσε να φέρνει διαφορετικά αποτελέσματα με βάση νέα κριτήρια
    }

    // Επιλογή νέας μεθόδου πληρωμής
    public void choseNewPaymentMethod(String method) {
        this.selectedPaymentMethod = method;
        System.out.println("New payment method selected: " + method);
        // Π.χ. db.savePaymentMethod(customerId, method);
    }
}
