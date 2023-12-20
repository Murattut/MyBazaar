package Items_sub.Cosmetic_sub;

import Items_sub.Cosmetic;

import java.util.LinkedList;

public class Hair_care extends Cosmetic {
    public static LinkedList<Hair_care> hair_CareLinkedList = new LinkedList<>();
    private static int nextStock = 1;
    private Integer stock;
    private boolean medicated;

    public Hair_care(double price, String manufacturer, String brand,
                     String expiration_date, double weight, boolean organic,
                     boolean medicated) {
        super(price, manufacturer, brand, expiration_date, weight, organic );
        this.stock = nextStock++;
        this.medicated = medicated;
    }

    public boolean isMedicated() {
        return medicated;
    }

    public void setMedicated(boolean medicated) {
        this.medicated = medicated;
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
        System.out.println("Medicated: " + isMedicated());
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
