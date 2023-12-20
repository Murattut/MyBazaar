package Items_sub;
public class Office_supplies extends Items{
    private String release_date;
    private String cover_title;
    private Double price;

    public Office_supplies(double price, String release_date, String cover_title) {
        super(price);
        this.release_date = release_date;
        this.cover_title = cover_title;
        this.price = price;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getCover_title() {
        return cover_title;
    }

    public void setCover_title(String cover_title) {
        this.cover_title = cover_title;
    }
    /*
    public void displayData() {
        System.out.println("Price: " + getPrice());
        System.out.println("Release Date: " + getRelease_date());
        System.out.println("Cover Title: " + getCover_title());
    }*/

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
