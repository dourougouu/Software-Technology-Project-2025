import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customers = new ArrayList<>();
    private static List<Admin> admins = new ArrayList<>();
    private static Customer loggedInCustomer = null;
    private static Admin loggedInAdmin = null;

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n=== Welcome to Concert Booking App ===");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Exit");
            System.out.print("Select option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    signUp();
                    break;
                case "2":
                    signIn();
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

            if (loggedInCustomer != null) {
                customerMenu();
            } else if (loggedInAdmin != null) {
                adminMenu();
            }
        }
    }

    private static void signUp() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        int userId = customers.size() + 1;
        int customerId = userId;
        Customer customer = new Customer(userId, name, email, password, customerId);
        customers.add(customer);

        System.out.println("Signup successful. You can now sign in.");
    }

    private static void signIn() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (Customer c : customers) {
            if (c.getEmail().equals(email) && c.getPassword().equals(password)) {
                loggedInCustomer = c;
                System.out.println("Welcome, " + c.getName());
                return;
            }
        }

        for (Admin a : admins) {
            if (a.getEmail().equals(email) && a.getPassword().equals(password)) {
                loggedInAdmin = a;
                System.out.println("Welcome, Admin " + a.getName());
                return;
            }
        }

        System.out.println("Invalid credentials. Try again.");
    }

    private static void customerMenu() {
        boolean running = true;
        while (running) {
            System.out.println("\n=== Customer Menu ===");
            System.out.println("1. Search Concerts");
            System.out.println("2. Search Accommodation");
            System.out.println("3. Search Transportation");
            System.out.println("4. View Cart");
            System.out.println("5. Modify Cart");
            System.out.println("6. Proceed to Payment");
            System.out.println("7. Log Out");
            System.out.print("Select option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Concert search is not implemented yet.");
                    break;
                case "2":
                    System.out.println("Accommodation search is not implemented yet.");
                    break;
                case "3":
                    System.out.println("Transportation search is not implemented yet.");
                    break;
                case "4":
                    System.out.println("Viewing cart is not implemented yet.");
                    break;
                case "5":
                    System.out.println("Modifying cart is not implemented yet.");
                    break;
                case "6":
                    System.out.println("Payment is not implemented yet.");
                    break;
                case "7":
                    loggedInCustomer = null;
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void adminMenu() {
        boolean running = true;
        while (running) {
            System.out.println("\n=== Admin Menu ===");
            System.out.println("1. Manage Concerts");
            System.out.println("2. Manage Accommodations");
            System.out.println("3. Manage Transportations");
            System.out.println("4. Log Out");
            System.out.print("Select option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Concert management is not implemented yet.");
                    break;
                case "2":
                    System.out.println("Accommodation management is not implemented yet.");
                    break;
                case "3":
                    System.out.println("Transportation management is not implemented yet.");
                    break;
                case "4":
                    loggedInAdmin = null;
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
