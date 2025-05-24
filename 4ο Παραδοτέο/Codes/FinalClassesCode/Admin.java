public class Admin extends User {
    private String role;

    public Admin(String UserID, String UserType, String Username, String Password, String Email) {
        super(Username, Password, Email);
        this.role = role;
    }
}
