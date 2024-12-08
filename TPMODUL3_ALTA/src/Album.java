public class Album {
    String albumName, artist;
    int available, total;

    public Album(String albumName, String artist, int available, int total) {
        this.albumName = albumName;
        this.artist = artist;
        this.available = available;
        this.total = total;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

    public int getAvailable() {
        return available;
    }

    public int getTotal() {
        return total;
    }
}
