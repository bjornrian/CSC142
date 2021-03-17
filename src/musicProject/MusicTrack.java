package musicProject;

//Need to implement unknown interface (for the purpose of
//trackNumber and indexing MusicTracks).
public class MusicTrack {

    private String artist;
    private String title;
    private int trackNumber;

    public MusicTrack(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTrackNumber() {
        return this.trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    //public void ???() {} [interface method needed here!]

    public String toString() {
        return  "Artist: "         + this.artist +
                "\nTitle: "        + this.title  +
                "\nTrack Number: " + this.trackNumber;
    }
}