public class ConfirmationScreen {
    private ConfirmationEmail confirmationEmail;

    public ConfirmationScreen(ConfirmationEmail confirmationEmail) {
        this.confirmationEmail = confirmationEmail;
    }

    // Έλεγχος εγκυρότητας αιτήματος (mock)
    public boolean checkRequest() {
        // Π.χ. έλεγχος αν booking και accounts δεν είναι null
        return confirmationEmail != null 
            && confirmationEmail.getBooking() != null
            && confirmationEmail.getSenderAccount() != null
            && confirmationEmail.getReceiverAccount() != null;
    }

    // Εμφανίζει την οθόνη επιβεβαίωσης
    public void display() {
        if (checkRequest()) {
            System.out.println("Displaying confirmation screen...");
            printConfMessage();
        } else {
            System.out.println("Invalid confirmation request.");
        }
    }

    // Τυπώνει μήνυμα επιβεβαίωσης
    public void printConfMessage() {
        System.out.println("Confirmation Email sent from " 
            + confirmationEmail.getSenderAccount().getEmail() 
            + " to " 
            + confirmationEmail.getReceiverAccount().getEmail());
        System.out.println("Regarding booking ID: " + confirmationEmail.getBooking().getBookingId());
    }
}

