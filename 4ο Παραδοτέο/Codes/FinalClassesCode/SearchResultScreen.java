import java.util.List;

public class SearchResultScreen {

    private DB db = new DB();

    private List<TransportationTicket> transportationResults;
    private List<ConcertTicket> concertResults;
    private List<Accommodation> accommodationResults;

    private TransportationTicket selectedTransportationTicket;
    private ConcertTicket selectedConcertTicket;
    private Accommodation selectedAccommodation;

    // Εμφανίζει αποτελέσματα μεταφορών
    public void showTranspResult() {
        transportationResults = db.getTransportationResults();
        System.out.println("Transportation Results:");
        for (TransportationTicket ticket : transportationResults) {
            System.out.println(ticket);
        }
    }

    // Επιλέγει εισιτήριο από αποτελέσματα (π.χ. βάση index)
    public void selectTicket(int index, String type) {
        switch (type.toLowerCase()) {
            case "transportation":
                if (index >= 0 && index < transportationResults.size()) {
                    selectedTransportationTicket = transportationResults.get(index);
                    System.out.println("Selected transportation ticket: " + selectedTransportationTicket);
                }
                break;
            case "concert":
                if (index >= 0 && index < concertResults.size()) {
                    selectedConcertTicket = concertResults.get(index);
                    System.out.println("Selected concert ticket: " + selectedConcertTicket);
                }
                break;
            case "accommodation":
                if (index >= 0 && index < accommodationResults.size()) {
                    selectedAccommodation = accommodationResults.get(index);
                    System.out.println("Selected accommodation: " + selectedAccommodation);
                }
                break;
            default:
                System.out.println("Unknown ticket type.");
        }
    }

    // Εμφανίζει καταλύματα
    public void showAcResult() {
        accommodationResults = db.getAccommodationResults();
        System.out.println("Accommodation Results:");
        for (Accommodation acc : accommodationResults) {
            System.out.println(acc);
        }
    }

    // Εμφανίζει συναυλίες
    public void showConResult() {
        concertResults = db.getConcertResults();
        System.out.println("Concert Results:");
        for (ConcertTicket concert : concertResults) {
            System.out.println(concert);
        }
    }

    // Εμφανίζει ενημερωμένα καταλύματα
    public void showUAcResult() {
        accommodationResults = db.getUpdatedAccommodations();
        System.out.println("Updated Accommodation Results:");
        for (Accommodation acc : accommodationResults) {
            System.out.println(acc);
        }
    }

    // Εμφανίζει ενημερωμένες συναυλίες
    public void showUConResult() {
        concertResults = db.getUpdatedConcerts();
        System.out.println("Updated Concert Results:");
        for (ConcertTicket concert : concertResults) {
            System.out.println(concert);
        }
    }

    // Εμφανίζει ενημερωμένες μεταφορές
    public void showUTranspResult() {
        transportationResults = db.getUpdatedTransportation();
        System.out.println("Updated Transportation Results:");
        for (TransportationTicket ticket : transportationResults) {
            System.out.println(ticket);
        }
    }
}

