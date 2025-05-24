public class Customer extends User {
    private String name;
    private String phone;
    private ShoppingCart cart;

    public Customer(String Username, String Password, String Email, String name, String phone) {
        super(Username, Password, Email);
        this.name = name;
        this.phone = phone;
        this.cart = new ShoppingCart(this);
    }

    public ShoppingCart getCart() {
        return cart;
    }
}
