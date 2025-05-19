// Accommodation Class
class Accommodation {
    private int accommodationId;
    private String hotelName;
    private String address;
    private double pricePerNight;

    public Accommodation(int accommodationId, String hotelName, String address, double pricePerNight) {
        this.accommodationId = accommodationId;
        this.hotelName = hotelName;
        this.address = address;
        this.pricePerNight = pricePerNight;
    }

    public int getAccommodationId() {
        return accommodationId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getAddress() {
        return address;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
}
