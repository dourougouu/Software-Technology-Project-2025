public class ManageUpdatedClass {
    private DB db = new DB();

    // Προαιρετικά attributes, π.χ. για tracking ή logging
    private String lastUpdatedEntity;
    private Object lastUpdatedObject;

    // Update TransportationTicket
    public boolean updateTransportation(TransportationTicket ticket) {
        boolean success = db.updateTransportation(ticket);
        if(success) {
            lastUpdatedEntity = "TransportationTicket";
            lastUpdatedObject = ticket;
            System.out.println("TransportationTicket updated successfully.");
        } else {
            System.out.println("Failed to update TransportationTicket.");
        }
        return success;
    }

    // Update Accommodation
    public boolean updateAccommodation(Accommodation accommodation) {
        boolean success = db.updateAccommodation(accommodation);
        if(success) {
            lastUpdatedEntity = "Accommodation";
            lastUpdatedObject = accommodation;
            System.out.println("Accommodation updated successfully.");
        } else {
            System.out.println("Failed to update Accommodation.");
        }
        return success;
    }

    // Update ConcertTicket
    public boolean updateConcert(ConcertTicket concertTicket) {
        boolean success = db.updateConcert(concertTicket);
        if(success) {
            lastUpdatedEntity = "ConcertTicket";
            lastUpdatedObject = concertTicket;
            System.out.println("ConcertTicket updated successfully.");
        } else {
            System.out.println("Failed to update ConcertTicket.");
        }
        return success;
    }

    // Share data with a recipient (πχ. username, email, ή άλλη μορφή)
    public void shareData(String recipient, Object data) {
        // Καλούμε τη db.share() ή άλλη λειτουργία για να μοιράσουμε τα δεδομένα
        boolean shared = db.share(recipient, data);
        if(shared) {
            System.out.println("Data shared successfully with " + recipient);
        } else {
            System.out.println("Failed to share data with " + recipient);
        }
    }
}

