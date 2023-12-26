package Items_sub;

public class Electronic extends Items{
    private String manufacturer;
    private String brand;
    private double maximum_allowed_input_voltage;
    private double maximum_power_consumption;
    private Double price;

    public Electronic(double price,
                      String manufacturer, String brand,
                      double maximum_allowed_input_voltage,
                      double maximum_power_consumption) {
        super(price);
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.maximum_allowed_input_voltage = maximum_allowed_input_voltage;
        this.maximum_power_consumption = maximum_power_consumption;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMaximum_allowed_input_voltage() {
        return maximum_allowed_input_voltage;
    }

    public void setMaximum_allowed_input_voltage(double maximum_allowed_input_voltage) {
        this.maximum_allowed_input_voltage = maximum_allowed_input_voltage;
    }

    public double getMaximum_power_consumption() {
        return maximum_power_consumption;
    }

    public void setMaximum_power_consumption(double maximum_power_consumption) {
        this.maximum_power_consumption = maximum_power_consumption;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
