public class Account {
    private Customer customer;
    private String accountType;

    public Account(Customer customer, String accountType) {
        this.customer = customer;
        this.accountType = accountType;
    }
}
