public class SiteManagement {
    private DB DB = new DB();

    // Εμφάνιση της αρχικής οθόνης διαχείρισης
    public void display() {
        System.out.println("=== Site Management Panel ===");
        System.out.println("1. Start Transportation Search");
        System.out.println("2. Start Concert Search");
        System.out.println("3. Start Accommodation Search");
    }

    // Ξεκινά αναζήτηση για καταλύματα
    public void startSearchAc() {
        System.out.println("Starting accommodation search...");
        db.getAccommodationResults().forEach(System.out::println);
    }

    // Ξεκινά αναζήτηση για συναυλίες
    public void startSearchCon() {
        System.out.println("Starting concert search...");
        db.getConcertResults().forEach(System.out::println);
    }

    // Ξεκινά αναζήτηση για μεταφορές
    public void startSearchTransp() {
        System.out.println("Starting transportation search...");
        db.getTransportationResults().forEach(System.out::println);
    }
}
