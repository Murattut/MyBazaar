package Items_sub.Electronic_sub.Computer_sub;
import Items_sub.Electronic_sub.Computer;
import java.util.LinkedList;

public class Tablet extends Computer {
    public static LinkedList<Tablet> tabletLinkedList = new LinkedList<>();
    private static int nextStock = 1;
    private Integer stock;
    private Integer Dimensions;

    public Tablet(double price, String manufacturer, String brand,
                   double maximum_allowed_input_voltage, double maximum_power_consumption,
                   String operating_system, String CPU_Type, int RAM_Capacity, int HDD_Capacity,
                  Integer Dimensions) {
        super(price, manufacturer, brand, maximum_allowed_input_voltage, maximum_power_consumption,
                operating_system, CPU_Type, RAM_Capacity, HDD_Capacity);

        this.stock = nextStock++;
        this.Dimensions = Dimensions;

    }
    public void displayData() {
        System.out.println("\nID: " + getId());
        System.out.println("Price: " + getPrice());
        System.out.println("Stock: " + getStock());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Brand: " + getBrand());
        System.out.println("Maximum Allowed Input Voltage: " + getMaximum_allowed_input_voltage());
        System.out.println("Maximum Power Consumption: " + getMaximum_power_consumption());
        System.out.println("Operating_system: " + getOperating_system());
        System.out.println("CPU_Type: "+ getCPU_Type());
        System.out.println("RAM_Capacity: "+ getRAM_Capacity());
        System.out.println("HDD_Capacity: " + getHDD_Capacity());
        System.out.println("Dimensions: " + getDimensions());
    }


    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getDimensions() {
        return Dimensions;
    }

    public void setDimensions(Integer dimensions) {
        Dimensions = dimensions;
    }
}
