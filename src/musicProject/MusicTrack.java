package musicProject;

//Need to implement unknown interface (for the purpose of
//trackNumber and indexing MusicTracks).
public class MusicTrack implements Comparable {

    private String artist;
    private String title;
    private int trackNumber;

    public MusicTrack(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public int compareTo(Object o) {
        int trackNumber = ((MusicTrack) o).getTrackNumber();
        return this.trackNumber - trackNumber;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.trackNumber).append(". ");
        builder.append(this.title).append(" -- ");
        builder.append(this.artist);
        return builder.toString();
    }
}