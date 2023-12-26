package Items_sub;

public class Cosmetic extends Items{
    private String manufacturer;
    private String brand;
    private String expiration_date;
    private double weight;
    private boolean organic;
    private Double price;

    public Cosmetic(Double price, String manufacturer, String brand, String expiration_date,
                    double weight, boolean organic) {
        super(price);
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.expiration_date = expiration_date;
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

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
