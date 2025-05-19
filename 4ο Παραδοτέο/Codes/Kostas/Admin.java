// Admin Class
class Admin extends User {
    private int adminId;

    public Admin(int adminId, String name, String email, String password, int id) {
        super(adminId, name, email, password);
        this.adminId = id;
    }

    public int getAdminId() {
        return adminId;
    }
}
