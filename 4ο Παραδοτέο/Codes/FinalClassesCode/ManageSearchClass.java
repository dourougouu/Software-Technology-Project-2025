import java.util.ArrayList;
import java.util.List;

public class ManageSearchClass {
    private DB db = new DB();

    private List<ConcertTicket> concertResults = new ArrayList<>();
    private List<TransportationTicket> transportationResults = new ArrayList<>();
    private List<Accommodation> accommodationResults = new ArrayList<>();

    // Κανονική αναζήτηση για συναυλίες
    public void searchConcert() {
        concertResults = db.getConcertResults();
        System.out.println("Concert search completed. Found " + concertResults.size() + " results.");
    }

    // Κανονική αναζήτηση για μεταφορές
    public void searchTransportation() {
        transportationResults = db.getTransportationResults();
        System.out.println("Transportation search completed. Found " + transportationResults.size() + " results.");
    }

    // Κανονική αναζήτηση για καταλύματα
    public void searchAccommodation() {
        accommodationResults = db.getAccommodationResults();
        System.out.println("Accommodation search completed. Found " + accommodationResults.size() + " results.");
    }

    // Συντομευμένη ή εναλλακτική αναζήτηση για μεταφορές
    public void searchTrans() {
        transportationResults = db.getUpdatedTransportation();
        System.out.println("Alternative transportation search completed.");
    }

    // Συντομευμένη ή εναλλακτική αναζήτηση για συναυλίες
    public void searchCon() {
        concertResults = db.getUpdatedConcerts();
        System.out.println("Alternative concert search completed.");
    }

    // Συντομευμένη ή εναλλακτική αναζήτηση για καταλύματα
    public void searchAc() {
        accommodationResults = db.getUpdatedAccommodations();
        System.out.println("Alternative accommodation search completed.");
    }
}
