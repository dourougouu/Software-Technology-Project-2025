public class AltPaymentMethod {
    private Payment payment;
    private String providerName;

    public AltPaymentMethod(Payment payment, String providerName) {
        this.payment = payment;
        this.providerName = providerName;
    }
}
