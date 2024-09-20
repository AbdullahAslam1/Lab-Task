public class Artwork {

    private String title;
    private int year;
    private Artist artist;

    Artwork(String title, int year, Artist artist) {
        this.setTitle(title);
        this.setYear(year);
        this.setArtist(artist);
    }

    Artwork(String title, int year) {
        this.setTitle(title);
        this.setYear(year);
        this.setArtist(new Artist("Unknown"));
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void showDetails() {
        System.out.println("Title: " + title + ", Year: " + year + ", Artist: " + artist.getName());
    }

    public Artwork createShallowCopy() {
        return new Artwork(this.title, this.year, this.artist);
    }

    public Artwork createDeepCopy() {
        return new Artwork(this.title, this.year, new Artist(this.artist.getName()));
    }
}
