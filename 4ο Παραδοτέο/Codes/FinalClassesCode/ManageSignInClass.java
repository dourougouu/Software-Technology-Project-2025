public class ManageSignInClass {
    private ManageSign manageSign;

    public ManageSignInClass(ManageSign manageSign) {
        this.manageSign = manageSign;
    }

    // Ελέγχει τα στοιχεία σύνδεσης (mock υλοποίηση)
    public boolean validate(String username, String password) {
        // Απλός έλεγχος αν δεν είναι κενά
        return username != null && !username.isEmpty()
            && password != null && !password.isEmpty();
    }

    // Εμφανίζει μήνυμα λάθους
    public void Error(String message) {
        System.out.println("Sign-in Error: " + message);
    }

    // Εμφανίζει την οθόνη σύνδεσης
    public void display() {
        System.out.println("=== Sign In Screen ===");
        // Εδώ θα μπορούσε να εμφανίζει φόρμες ή επιλογές
    }

    // Προσπαθεί να συνδεθεί ο χρήστης
    public void signIn(String username, String password) {
        if (!validate(username, password)) {
            error("Invalid username or password.");
            return;
        }
        // Καλεί τη μέθοδο signIn της manageSign (υποθέτοντας ότι υπάρχει)
        boolean success = manageSign.signIn(username, password);
        if (success) {
            System.out.println("Sign-in successful. Welcome, " + username + "!");
        } else {
            error("Sign-in failed. Please try again.");
        }
    }
}
