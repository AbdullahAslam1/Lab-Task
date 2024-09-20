public class Main {

    public static void main(String[] args) {

        Artist artist = new Artist("Ahmad");

        Artwork artwork1 = new Artwork("Starry Night", 2021, artist);

        Artwork artwork2 = new Artwork("Untitled", 2023);

        artwork1.setTitle("Mountain View");
        artwork1.setYear(2021);

        Artwork shallowCopy = artwork1.createShallowCopy();
        Artwork deepCopy = artwork1.createDeepCopy();

        System.out.println();
        System.out.println("Before modifying the artist's name:");
        artwork1.showDetails();
        shallowCopy.showDetails();
        deepCopy.showDetails();

        artist = new Artist("Umer");
        artwork1 = new Artwork("Stary Night", 2003, artist);

        System.out.println("-----------------------------------------------------------");
        System.out.println("After modifying the artist's name:");
        artwork1.showDetails();
        shallowCopy.showDetails();
        deepCopy.showDetails();
    }
}
