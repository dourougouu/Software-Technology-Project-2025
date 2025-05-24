public class SignInScreen {
    private Account account;

    public SignInScreen(Account account) {
        this.account = account;
    }

    // Εμφανίζει την οθόνη σύνδεσης
    public void display() {
        System.out.println("=== Sign In Screen ===");
        System.out.println("Please enter your username and password.");
        // Εδώ μπορεί να προστεθεί φόρμα ή input από χρήστη
    }

    // Ξεκινά τη διαδικασία σύνδεσης
    public void startSignIn(String username, String password) {
        if (account == null) {
            System.out.println("No account information available.");
            return;
        }

        if (username.equals(account.getUsername()) && password.equals(account.getPassword())) {
            System.out.println("Sign-in successful. Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
