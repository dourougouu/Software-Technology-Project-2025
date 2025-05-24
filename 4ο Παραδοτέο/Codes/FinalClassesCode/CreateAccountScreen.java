public class CreateAccountScreen {
    private Account account;

    public CreateAccountScreen(Account account) {
        this.account = account;
    }

    // Εμφανίζει τη φόρμα δημιουργίας λογαριασμού
    public void display() {
        System.out.println("=== Create Account Screen ===");
        System.out.println("Please enter your account details.");
        // Μπορεί να προσθέσεις κώδικα για φόρμες ή input εδώ
    }

    // Ξεκινά τη διαδικασία υποβολής λογαριασμού
    public void startSubmit() {
        if (account == null) {
            System.out.println("Account information is missing.");
            return;
        }
        // Εδώ μπορεί να γίνει έλεγχος εγκυρότητας και αποθήκευση
        System.out.println("Submitting account for user: " + account.getUsername());
        // Πχ αποθήκευση στη βάση, επιβεβαίωση κτλ.
    }
}
