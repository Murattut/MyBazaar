package Items_sub.Cosmetic_sub;

import Items_sub.Cosmetic;

import java.util.LinkedList;

public class Skin_care extends Cosmetic {
    public static LinkedList<Skin_care> skin_careLinkedList = new LinkedList<>();
    private static int nextStock = 1;
    private Integer stock;
    private boolean baby_sensitive;
    public Skin_care(double price, String manufacturer, String brand,
                     String expiration_date, double weight, boolean organic,
                     boolean baby_sensitive) {
        super(price, manufacturer, brand, expiration_date, weight, organic);
        this.stock = nextStock++;
        this.baby_sensitive = baby_sensitive;
    }

    public boolean isBaby_sensitive() {
        return baby_sensitive;
    }

    public void setBaby_sensitive(boolean baby_sensitive) {
        this.baby_sensitive = baby_sensitive;
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
        System.out.println("Baby sensitive: " + isBaby_sensitive());
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
