import java.time.LocalDateTime;
// Transportation Class
class Transportation {
    private int transportationId;
    private String type;
    private String company;
    private double price;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public Transportation(int transportationId, String type, String company, double price, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.transportationId = transportationId;
        this.type = type;
        this.company = company;
        this.price = price;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public int getTransportationId() {
        return transportationId;
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }
}
