package Items_sub.Cosmetic_sub;
import Items_sub.Cosmetic;
import java.util.LinkedList;

public class Perfume extends Cosmetic {
    public static LinkedList<Perfume> perfumeLinkedList = new LinkedList<>();
    private static int nextStock = 1;
    private Integer stock;

    private int lasting_duration;
    public Perfume(double price, String manufacturer, String brand,
                     String expiration_date, double weight, boolean organic,
                   int lasting_duration) {
        super(price, manufacturer, brand, expiration_date, weight, organic);
        this.stock = nextStock++;
        this.lasting_duration = lasting_duration;
    }

    public int getLasting_duration() {
        return lasting_duration;
    }

    public void setLasting_duration(int lasting_duration) {
        this.lasting_duration = lasting_duration;
    }
    public void displayData() {
        System.out.println("\nID: " + getId());
        System.out.println("Price: " + getPrice());
        System.out.println("Stock: " + getStock());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Brand: " + getBrand());
        System.out.println("Expiration Date: " + getExpiration_date());
        System.out.println("Weight: " + getWeight());
        System.out.println("Organic: " + isOrganic());
        System.out.println("Lasting_duration: " + getLasting_duration());
    }

    public Integer getStock() {
        return stock;
    }
}
