import java.util.List;
import java.util.ArrayList;

// User Class
class User {
    private int userId;
    private String name;
    private String email;
    private String password;
    private List<Address> addresses;
    private List<PaymentMethod> paymentMethods;

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.addresses = new ArrayList<>();
        this.paymentMethods = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void addPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethods.add(paymentMethod);
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }
}
