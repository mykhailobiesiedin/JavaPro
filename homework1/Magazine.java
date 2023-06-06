package homework1;

public class Magazine extends PrintedEdition{
    private int yearOfPublishing;
    private int magazinesNumber;


    public Magazine(String catalogueNumber, String name, int price, int locationOnShelf, int yearOfPublishing, int magazinesNumber) {
        super(catalogueNumber, name, price, locationOnShelf);
        this.yearOfPublishing = yearOfPublishing;
        this.magazinesNumber = magazinesNumber;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getMagazinesNumber() {
        return magazinesNumber;
    }
}
