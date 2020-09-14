public class book
{
    private int numberOfPages;
    private int price;
    private int weight;

    public book(int numberOfPages, int price, int weight) {
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.weight = weight;
    }

    public book(int numberOfPages, int price) {
        this.numberOfPages = numberOfPages;
        this.price = price;
    }
    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return "The book: price " + this.price + " pages: " + this.numberOfPages + " weight: " + this.weight ;
    }

}
