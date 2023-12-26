package Shopping_sub;
import Users.Customers;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Objects;

public class Orders{

    public static LinkedList<Orders> order_list = new LinkedList<>();
    private LocalDate orderDate;
    private Double totalCost;
    private Integer purchased_items;
    private Integer customerId;
    //customerId

    public Orders(double totalCost, Integer purchased_items, int customerId) {
        this.orderDate = LocalDate.now();
        this.totalCost = totalCost;
        this.purchased_items = purchased_items;
        this.customerId = customerId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getPurchased_items() {
        return purchased_items;
    }

    public void setPurchased_items(Integer purchased_items) {
        this.purchased_items = purchased_items;
    }

    public int getCustomerId() {
        for (Customers customer : Customers.customer_list) {
            if (Objects.equals(customer.getCustomerId(), customerId)) {
                return customerId;
            }
        }return -1;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void DisplayOrder(){
        System.out.println("\nOrder Date: " + getOrderDate());
        System.out.println("Total Cost: " + getTotalCost());
        System.out.println("Customer ID: " + getCustomerId());
        System.out.println("Purchased Items: " + getPurchased_items());
    }
}
