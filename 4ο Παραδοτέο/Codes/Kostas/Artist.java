// Artist Class
public class Artist {
    private int artistId;
    private String name;
    private String bio;

    public Artist(int artistId, String name, String bio) {
        this.artistId = artistId;
        this.name = name;
        this.bio = bio;
    }

    public int getArtistId() {
        return artistId;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}
