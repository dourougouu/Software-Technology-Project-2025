import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

// Concert Class
class Concert {
    private int concertId;
    private String name;
    private String location;
    private LocalDateTime dateTime;
    private List<Artist> artists;

    public Concert(int concertId, String name, String location, LocalDateTime dateTime) {
        this.concertId = concertId;
        this.name = name;
        this.location = location;
        this.dateTime = dateTime;
        this.artists = new ArrayList<>();
    }

    public int getConcertId() {
        return concertId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void addArtist(Artist artist) {
        this.artists.add(artist);
    }

    public List<Artist> getArtists() {
        return artists;
    }
}
