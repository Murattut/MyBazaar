package Items_sub;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cosmetic extends Items{
    private String manufacturer;
    private String brand;
    private LocalDate expiration_date;
    private double weight;
    private boolean organic;
    private Double price;

    public Cosmetic(Double price, String manufacturer, String brand, String expiration_date,
                    double weight, boolean organic) {
        super(price);
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.expiration_date = LocalDate.parse(expiration_date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.weight = weight;
        this.organic = organic;
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

    public LocalDate getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(LocalDate expiration_date) {
        this.expiration_date = expiration_date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }
    /*
    public void displayData() {
        System.out.println("Price: " + getPrice());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Brand: " + getBrand());
        System.out.println("Expiration Date: " + getExpiration_date());
        System.out.println("Weight: " + getWeight());
        System.out.println("Organic: " + isOrganic());
    }*/

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
