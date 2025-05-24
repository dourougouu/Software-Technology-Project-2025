public class MainMenu {
    private Customer customer;

    public void showMenu() {
        System.out.println("Welcome, " + customer.getUsername());
        System.out.println("1. View Concerts");
        System.out.println("2. Book Transportation");
        System.out.println("3. Contact Us");
        System.out.println("4. About Us");
    }

    public void makeChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Navigating to concerts...");
                break;
            case 2:
                System.out.println("Navigating to transportation...");
                break;
            case 3:
                System.out.println("Opening contact form...");
                break;
            case 4:
                clickAboutUs();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public void clickAboutUs() {
        System.out.println("About Us:");
        System.out.println("This application helps you book concerts, transportation, and accommodation easily.");
    }
}
