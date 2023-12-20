package Items_sub.Electronic_sub.Computer_sub;
import Items_sub.Electronic_sub.Computer;
import java.util.LinkedList;

public class Desktop extends Computer {
    public static LinkedList<Desktop> desktopLinkedList = new LinkedList<>();
    private static int nextStock = 1;
    private Integer stock;
    private String box_color;

    public Desktop(Double price, String manufacturer, String brand,
                   Double maximum_allowed_input_voltage, Double maximum_power_consumption,
                   String operating_system, String CPU_Type, Integer RAM_Capacity, Integer HDD_Capacity,
                   String box_color) {
        super(price, manufacturer, brand, maximum_allowed_input_voltage, maximum_power_consumption,
                operating_system, CPU_Type, RAM_Capacity, HDD_Capacity);
        this.stock = nextStock++;
        this.box_color = box_color;
    }

    public String getBox_color() {
        return box_color;
    }

    public void setBox_color(String box_color) {
        this.box_color = box_color;
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
        System.out.println("Box Color: " + getBox_color());
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
