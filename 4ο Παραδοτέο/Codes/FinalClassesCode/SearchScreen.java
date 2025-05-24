public class SearchScreen {
    private Transportation transportation;
    private Concert concert;
    private Accommodation accommodation;

    // Εμφανίζει τη γενική οθόνη αναζήτησης
    public void display() {
        System.out.println("=== Welcome to the Search Screen ===");
        showSearch();
    }

    // Εμφανίζει τις επιλογές αναζήτησης
    public void showSearch() {
        System.out.println("1. Search Transportation");
        System.out.println("2. Search Concerts");
        System.out.println("3. Search Accommodation");
    }

    // Εμφανίζει τη φόρμα αναζήτησης για μεταφορές
    public void showTransportationForm() {
        System.out.println("--- Transportation Search Form ---");
        // Εδώ θα μπορούσαν να υπάρχουν πεδία όπως: από, προς, ημερομηνία, τύπος κλπ.
    }

    // Εμφανίζει τη φόρμα αναζήτησης για συναυλίες
    public void showConcertForm() {
        System.out.println("--- Concert Search Form ---");
        // Πεδία: καλλιτέχνης, ημερομηνία, τοποθεσία κλπ.
    }

    // Εμφανίζει τη φόρμα αναζήτησης για καταλύματα
    public void showAccommodationForm() {
        System.out.println("--- Accommodation Search Form ---");
        // Πεδία: πόλη, check-in/check-out ημερομηνίες, αριθμός ατόμων
    }
}
