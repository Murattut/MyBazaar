package Items_sub.Electronic_sub;
import Items_sub.Electronic;
import java.util.LinkedList;
public class Tv extends Electronic {
    public static LinkedList<Tv> TvLinkedList = new LinkedList<>();
    private static int nextStock = 1;
    private Integer stock;
    private int screen_size;
    public Tv(double price, String manufacturer, String brand,
              double maximum_allowed_input_voltage, double maximum_power_consumption,
              int screen_size) {
        super(price, manufacturer, brand, maximum_allowed_input_voltage, maximum_power_consumption);
        this.stock = nextStock++;
        this.screen_size = screen_size;
    }
    public int getScreen_size() {
        return screen_size;
    }

    public void setScreen_size(int screen_size) {
        this.screen_size = screen_size;
    }
    public void displayData() {
        System.out.println("\nID: " + getId());
        System.out.println("Price: " + getPrice());
        System.out.println("Stock: " + getStock());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Brand: " + getBrand());
        System.out.println("Maximum Allowed Input Voltage: " + getMaximum_allowed_input_voltage());
        System.out.println("Maximum Power Consumption: " + getMaximum_power_consumption());
        System.out.println("Screen Size: " + getScreen_size());
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
