import java.time.LocalDateTime;
//import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Create Users
        Customer customer1 = new Customer(1, "Alice Smith", "alice.smith@example.com", "password123", 101);
        Admin admin1 = new Admin(2, "Bob Johnson", "bob.johnson@example.com", "adminpass", 201);

        // 2. Create Addresses and Payment Methods for Users
        Address address1 = new Address(1, "123 Main St", "Anytown", "NY", "12345", customer1);
        Address address2 = new Address(2, "456 Oak Ave", "Somecity", "CA", "98765", customer1);
        PaymentMethod payment1 = new PaymentMethod(1, "Credit Card", "1111-2222-3333-4444", customer1);
        PaymentMethod payment2 = new PaymentMethod(2, "PayPal", "alice.smith@example.com", customer1);

        customer1.addAddress(address1);
        customer1.addAddress(address2);
        customer1.addPaymentMethod(payment1);
        customer1.addPaymentMethod(payment2);

        // 3. Create Concert and Artist
        LocalDateTime concert1Time = LocalDateTime.of(2024, 7, 15, 20, 0);
        Concert concert1 = new Concert(1, "Rock Concert", "Stadium Arena", concert1Time);
        Artist artist1 = new Artist(1, "RockStar1", "Famous Rock Singer");
        concert1.addArtist(artist1); // Add the artist to the concert

        // 4. Create Ticket and Seating
        Ticket ticket1 = new Ticket(1, concert1, 100.00);
        Seating seating1 = new Seating(1, "Section A", "Row 10", 15);
        ticket1.setSeating(seating1);

        // 5. Create Accommodation and Transportation
        Accommodation accommodation1 = new Accommodation(1, "Luxury Hotel", "100 Pine St", 200.00);
        LocalDateTime departureTime = LocalDateTime.of(2024, 7, 15, 17, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2024, 7, 15, 19, 0);
        Transportation transportation1 = new Transportation(1, "Bus", "CityBus", 50.00, departureTime, arrivalTime);

        // 6.  Customer books a ticket.
        customer1.addPurchasedTicket(ticket1);
        ticket1.setCustomer(customer1);

        // 7. Create Reservation
        Reservation reservation1 = new Reservation(1, customer1, ticket1, seating1, accommodation1, transportation1);

        // 8. Create Reviews
        Review review1 = new Review(1, "Great concert!", 5, "Ticket", ticket1.getTicketId());
        Review review2 = new Review(2, "Nice hotel", 4, "Accommodation", accommodation1.getAccommodationId());

        // 9. Display Information
        System.out.println("--- User Details ---");
        System.out.println("Customer Name: " + customer1.getName());
        System.out.println("Customer Email: " + customer1.getEmail());
        System.out.println("Admin Name: " + admin1.getName());
        System.out.println("Admin Email: " + admin1.getEmail());

        System.out.println("\n--- Address Details ---");
        for (Address address : customer1.getAddresses()) {
            System.out.println("Street: " + address.getStreet() + ", City: " + address.getCity());
        }

        System.out.println("\n--- Payment Details ---");
        for (PaymentMethod payment : customer1.getPaymentMethods()) {
            System.out.println("Type: " + payment.getType() + ", Details: " + payment.getDetails());
        }

        System.out.println("\n--- Concert Details ---");
        System.out.println("Concert Name: " + concert1.getName());
        System.out.println("Concert Location: " + concert1.getLocation());
        System.out.println("Concert Time: " + concert1.getDateTime());
        System.out.println("Artist: " + artist1.getName());

        System.out.println("\n--- Ticket Details ---");
        System.out.println("Ticket ID: " + ticket1.getTicketId());
        System.out.println("Ticket Price: " + ticket1.getPrice());
        System.out.println("Seating: " + ticket1.getSeating().getSection() + ", " + ticket1.getSeating().getRow() + ", Seat " + ticket1.getSeating().getNumber());
        if (ticket1.getCustomer() != null)
            System.out.println("Ticket purchased by: " + ticket1.getCustomer().getName());
        else
            System.out.println("Ticket not purchased yet.");

        System.out.println("\n--- Accommodation Details ---");
        System.out.println("Hotel Name: " + accommodation1.getHotelName());
        System.out.println("Hotel Address: " + accommodation1.getAddress());
        System.out.println("Price per Night: " + accommodation1.getPricePerNight());

        System.out.println("\n--- Transportation Details ---");
        System.out.println("Transportation Type: " + transportation1.getType());
        System.out.println("Transportation Company: " + transportation1.getCompany());
        System.out.println("Departure Time: " + transportation1.getDepartureTime());
        System.out.println("Arrival Time: " + transportation1.getArrivalTime());
        System.out.println("Transportation Price: " + transportation1.getPrice());

        System.out.println("\n--- Reservation Details ---");
        System.out.println("Reservation ID: " + reservation1.getReservationId());
        System.out.println("Reserved by: " + reservation1.getCustomer().getName());
        System.out.println("Reserved Ticket: " + reservation1.getTicket().getTicketId());
        System.out.println("Reserved Accommodation: " + reservation1.getAccommodation().getHotelName());
        System.out.println("Reserved Transportation: " + reservation1.getTransportation().getType());
        System.out.println("Reservation Date: " + reservation1.getReservationDate());
        System.out.println("Total Price: " + reservation1.getTotalPrice());

        System.out.println("\n--- Review Details ---");
        System.out.println("Review 1 Comment: " + review1.getComment());
        System.out.println("Review 1 Rating: " + review1.getRating());
        System.out.println("Review 1 Reviewee Type: " + review1.getRevieweeType());
        System.out.println("Review 1 Reviewee ID: " + review1.getRevieweeId());

        System.out.println("\nReview 2 Comment: " + review2.getComment());
        System.out.println("Review 2 Rating: " + review2.getRating());
        System.out.println("Review 2 Reviewee Type: " + review2.getRevieweeType());
        System.out.println("Review 2 Reviewee ID: " + review2.getRevieweeId());
    }
}

