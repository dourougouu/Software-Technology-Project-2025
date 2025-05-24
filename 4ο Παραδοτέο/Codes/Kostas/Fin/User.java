// User.java
public class User {
    protected String UserID;
    protected String UserType;
    protected String Username;
    protected String Password;
    protected String Email;

    public User(String UserID, String UserType, String Username, String Password, String Email) {
        this.UserID = UserID;
        this.UserType = UserType;
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
    }
}
