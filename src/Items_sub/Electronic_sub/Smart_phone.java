package Items_sub.Electronic_sub;

import Items_sub.Electronic;

import java.util.LinkedList;

public class Smart_phone extends Electronic {
    public static LinkedList<Smart_phone> smart_phoneLinkedList = new LinkedList<>();
    private static int nextStock = 1;
    private Integer stock;
    private String screen_type;

    public Smart_phone(double price, String manufacturer, String brand,
                       double maximum_allowed_input_voltage, double maximum_power_consumption,
                       String screen_type) {
        super(price, manufacturer, brand, maximum_allowed_input_voltage, maximum_power_consumption);
        this.stock = nextStock++;
        this.screen_type = screen_type;
    }

    public String getScreen_type() {
        return screen_type;
    }

    public void setScreen_type(String screen_type) {
        this.screen_type = screen_type;
    }
    public void displayData() {
        System.out.println("ID: " + getId());
        System.out.println("Price: " + getPrice());
        System.out.println("Stock: " + getStock());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Brand: " + getBrand());
        System.out.println("Maximum Allowed Input Voltage: " + getMaximum_allowed_input_voltage());
        System.out.println("Maximum Power Consumption: " + getMaximum_power_consumption());
        System.out.println("Screen type: "+ getScreen_type());
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
