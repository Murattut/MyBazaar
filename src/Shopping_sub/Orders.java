package Shopping_sub;
import Users.Customers;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class Orders{

    public static LinkedList<Orders> order_list = new LinkedList<>();
    private LocalDate orderDate;
    private Double totalCost;
    private LinkedList<Object> purchased_items;

    private int customerId;
    //customerId

    public Orders(double totalCost, LinkedList<Object> purchased_items, int customerId) {
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

    public LinkedList<Object> getPurchased_items() {
        return purchased_items;
    }

    public void setPurchased_items(LinkedList<Object> purchased_items) {
        this.purchased_items = purchased_items;
    }
    public int getCustomerId() {
        for (Customers customer : Customers.customer_list) {
            if (customer.getCustomerId() == customerId) {
                return customerId;
            }
        }return -1;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void DisplayOrder(){
        System.out.println("\nOrder Date: " + orderDate);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Purchased Items: ");
        System.out.println("Customer ID: " + getCustomerId());
    }
}
