package Items_sub.Office_supplies_sub;
import Items_sub.Office_supplies;
import java.util.LinkedList;

public class Cd_Dvd extends Office_supplies {
    public static LinkedList<Cd_Dvd> cd_dvdLinkedList = new LinkedList<>();
    private static int nextStock = 1;
    private Integer stock;
    private String composer;
    private String[] song;

    public Cd_Dvd(double price, String release_date, String cover_title,
                  String composer,String[] song) {
        super(price, release_date, cover_title);
        this.stock = nextStock++;
        this.composer = composer;
        this.song = song;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String[] getSong() {
        return song;
    }

    public void setSong(String[] song) {
        this.song = song;
    }
    public void displayData() {
        System.out.println("\n ID: " + getId());
        System.out.println("Price: " + getPrice());
        System.out.println("Stock: " + getStock());
        System.out.println("Release Date: " + getRelease_date());
        System.out.println("Cover Title: " + getCover_title());
        System.out.println("Composer: " + getComposer());
        System.out.println("Song: " + getSong());
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
