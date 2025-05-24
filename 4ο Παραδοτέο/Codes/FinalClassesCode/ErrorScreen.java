public class ErrorScreen {
    private DB db = new DB();
    private String errorMessage;

    // Κατασκευαστής
    public ErrorScreen(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    // Μέθοδος εμφάνισης του σφάλματος
    public void display() {
        System.out.println("ERROR:");
        System.out.println(errorMessage);
    }
}
