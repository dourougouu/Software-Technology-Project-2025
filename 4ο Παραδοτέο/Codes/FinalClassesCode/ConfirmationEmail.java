public class ConfirmationEmail {
    private Booking booking;
    private Account senderAccount;
    private Account receiverAccount;

    // Constructor
    public ConfirmationEmail(Booking booking, Account senderAccount, Account receiverAccount) {
        this.booking = booking;
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
    }
}
