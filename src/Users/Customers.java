package Users;
import Items_sub.Cosmetic_sub.Hair_care;
import Items_sub.Cosmetic_sub.Perfume;
import Items_sub.Cosmetic_sub.Skin_care;
import Items_sub.Electronic_sub.Computer_sub.Desktop;
import Items_sub.Electronic_sub.Computer_sub.Laptop;
import Items_sub.Electronic_sub.Computer_sub.Tablet;
import Items_sub.Electronic_sub.Smart_phone;
import Items_sub.Electronic_sub.Tv;
import Items_sub.Items;
import Items_sub.Office_supplies_sub.Book;
import Items_sub.Office_supplies_sub.Cd_Dvd;
import Shopping_sub.Campaigns;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Stack;

public class Customers extends Person{
    public static LinkedList<Customers> customer_list = new LinkedList<>();
    //private static LinkedList<Items> shopping_cart= new LinkedList<>();
    public static Stack<Object> Temp_stack = new Stack<>();
    private static Integer nextCustomerId = 1;
    private Integer customerId;
    private String password;
    private Double balance;
    private String status = "CLASSIC";
    private Integer[] shopping_cart;
    private String[] order_history;


    public Customers(String name, String email, String date_of_birth, String password,
                     Double balance) {
        super(name, email, date_of_birth);
        this.customerId =nextCustomerId++;
        this.password = password;
        this.balance = balance;
        this.status= null;
        this.shopping_cart = null;
        this.order_history =null;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    /*public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }*/

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getOrder_history() {
        return order_history;
    }

    public void setOrder_history(String[] order_history) {
        this.order_history = order_history;
    }
    public Integer[] getShopping_cart() {
        return shopping_cart;
    }

    public void setShopping_cart(Integer[] shopping_cart) {
        this.shopping_cart = shopping_cart;
    }
    public void displayPersonalData() {
        System.out.println("\nName: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Date of Birth: " + getDate_of_birth());
        System.out.println("CustomerId: " + getCustomerId());
        System.out.println("Password: " + getPassword());
        System.out.println("Balance: " + getBalance());
        System.out.println("Status: " + getStatus());
        System.out.println("Shoping_cart: " + getShopping_cart());
        System.out.println("Order_history: " + Arrays.toString(getOrder_history()));

    }
    public static void Ch_pass(Integer Id,String old_password,String new_password){
        for (Customers customer : customer_list) {
            if (customer.getCustomerId().equals(Id)) {
                if(customer.getPassword().equals(old_password)){
                    customer.setPassword(new_password);
                    System.out.println("Password changed successfully\n");
                }else {
                    System.out.println("The given password does not match the current password. Please try again.\n");
                }
            }else{
                System.out.println("No customer with ID number "+ Id +" exists!\n");
            }
        }
    }
    public static void Deposit_money(Integer Id,Double amount){
        for (Customers customer : customer_list) {
            if (customer.getCustomerId().equals(Id)) {
                customer.setBalance(customer.getBalance()+amount);
                System.out.println("Deposit completed successfully\n");
            }else{
                System.out.println("No customer with ID number "+ Id +" exists!\n");
            }
        }
    }
    public static void Show_champaigns(Integer Id){
        for (Customers customer : customer_list) {
            if (customer.getCustomerId().equals(Id)) {
                for(Campaigns campaign: Campaigns.campaign_list){
                    System.out.printf(campaign.getDiscount_rate()+" sales of " +
                            campaign.getItemType()+ " until " + campaign.getEndDate());
                }

            }else{
                System.out.println("No customer with ID number "+ Id +" exists!\n");
            }
        }
    }
    public static void Add_to_cart(Integer CustomerId,Integer Item_ID){
        for (Customers customer : customer_list) {
            if (customer.getCustomerId().equals(CustomerId)) {
                Add_to_cart_sub_function(Item_ID);
                System.out.println("Item added to cart successfully");
            }else{
                System.out.println("No customer with ID number "+ CustomerId +" exists!");
            }
        }
    }
    public static void Add_to_cart_sub_function(Integer Item_Id){
        for (Hair_care Temp : Hair_care.hair_CareLinkedList) {
            if (Objects.equals(Temp.getId(), Item_Id)) {
                Temp_stack.push(Temp);
                Hair_care.hair_CareLinkedList.remove(Temp);
            }

        }
        for (Perfume Temp : Perfume.perfumeLinkedList) {
            if (Objects.equals(Temp.getId(), Item_Id)) {
                Temp_stack.push(Temp);
                Perfume.perfumeLinkedList.remove(Temp);
            }

        }
        for (Skin_care Temp : Skin_care.skin_careLinkedList) {
            if (Objects.equals(Temp.getId(), Item_Id)) {
                Temp_stack.push(Temp);
                Skin_care.skin_careLinkedList.remove(Temp);
            }

        }
        for (Desktop Temp : Desktop.desktopLinkedList) {
            if (Objects.equals(Temp.getId(), Item_Id)) {
                Temp_stack.push(Temp);
                Desktop.desktopLinkedList.remove(Temp);
            }

        }
        for (Laptop Temp : Laptop.laptopLinkedList) {
            if (Objects.equals(Temp.getId(), Item_Id)) {
                Temp_stack.push(Temp);
                Laptop.laptopLinkedList.remove(Temp);
            }

        }
        for (Tablet Temp : Tablet.tabletLinkedList) {
            if (Objects.equals(Temp.getId(), Item_Id)) {
                Temp_stack.push(Temp);
                Tablet.tabletLinkedList.remove(Temp);
            }

        }
        for (Smart_phone Temp : Smart_phone.smart_phoneLinkedList) {
            if (Objects.equals(Temp.getId(), Item_Id)) {
                Temp_stack.push(Temp);
                Smart_phone.smart_phoneLinkedList.remove(Temp);
            }

        }
        for (Tv Temp : Tv.TvLinkedList) {
            if (Objects.equals(Temp.getId(), Item_Id)) {
                Temp_stack.push(Temp);
                Tv.TvLinkedList.remove(Temp);
            }

        }
        for (Book Temp : Book.bookLinkedList) {
            if (Objects.equals(Temp.getId(), Item_Id)) {
                Temp_stack.push(Temp);
                Book.bookLinkedList.remove(Temp);
            }

        }
        for (Cd_Dvd Temp : Cd_Dvd.cd_dvdLinkedList) {
            if (Objects.equals(Temp.getId(), Item_Id)) {
                Temp_stack.push(Temp);
                Cd_Dvd.cd_dvdLinkedList.remove(Temp);
            }
        }
    }
    public static void Empty_cart(Integer CustomerId){
        for (Customers customer : customer_list) {
            if (customer.getCustomerId().equals(CustomerId)) {
                Temp_stack.empty();
                System.out.println("The cart has been emptied.\n");
            }else{
                System.out.println("No customer with ID number "+ CustomerId +" exists!\n");
            }
        }
    }
    public static void Order(Integer CustomerId, String Customer_Password){
        for (Customers customer : customer_list) {
            if (customer.getCustomerId().equals(CustomerId)) {
                if(customer.getPassword().equals(Customer_Password)){
                   if(!Temp_stack.isEmpty()) {
                       double total_price = 0;
                       for (int i = 0; i < Temp_stack.size(); i++){
                           total_price = total_price + ((Items) Temp_stack.get(i)).getPrice();
                           System.out.print(total_price);
                           if(customer.getBalance() >= total_price) {
                               customer.setBalance(customer.getBalance() - total_price);
                               System.out.println("\nOrder placed successfully\n");
                           }else {
                               System.out.println("\nOrder could not be placed. Insufficient funds.\n");
                           }
                       }
                   }else{
                       System.out.println("\nYou should add some items to your cart before order request!\n");}
                }
                else{
                    System.out.println("\nOrder could not be placed. Invalid password.\n");}
            }
            else{
                System.out.println("\nNo customer with ID number "+ CustomerId +" exists!\n");}
        }
    }
}
