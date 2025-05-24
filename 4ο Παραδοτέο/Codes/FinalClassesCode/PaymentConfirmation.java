import java.time.LocalDateTime;

public class PaymentConfirmation {
    private User user;
    private String paymentMethod;
    private int reservationId;
    private LocalDateTime reservationDateTime;

    // Constructor
    public PaymentConfirmation(User user, String paymentMethod, String reservationId, LocalDateTime reservationDateTime) {
        this.user = user;
        this.paymentMethod = paymentMethod;
        this.reservationId = reservationId;
        this.reservationDateTime = reservationDateTime;
    }
}

