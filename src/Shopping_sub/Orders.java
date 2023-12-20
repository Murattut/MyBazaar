package Shopping_sub;
import Users.Customers;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class Orders extends Customers{

    public static LinkedList<Orders> order_list = new LinkedList<>();
    private LocalDate orderDate;
    private Double totalCost;
    private String[] purchased_items;
    //customerId

    public Orders(String name, String email, String date_of_birth, String password, Double balance,Double totalCost,
                  String[] purchased_items) {
        super(name, email, date_of_birth, password, balance);
        this.orderDate = LocalDate.parse(date_of_birth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.totalCost = totalCost;
        this.purchased_items = purchased_items;
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

    public String[] getPurchased_items() {
        return purchased_items;
    }

    public void setPurchased_items(String[] purchased_items) {
        this.purchased_items = purchased_items;
    }
}
