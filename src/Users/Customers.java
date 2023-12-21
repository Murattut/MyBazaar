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
import Shopping_sub.Orders;

import java.util.*;

public class Customers extends Person{
    public static LinkedList<Customers> customer_list = new LinkedList<>();
    //private static LinkedList<Items> shopping_cart= new LinkedList<>();
    public Stack<Object> Temp_stack = new Stack<>();
    private static Integer nextCustomerId = 1;
    private Integer customerId;
    private String password;
    private Double balance;
    private String status;
    private Integer[] shopping_cart;
    private LinkedList<Orders> order_history;
    public Customers(String name, String email, String date_of_birth, String password,
                     Double balance) {
        super(name, email, date_of_birth);
        this.customerId =nextCustomerId++;
        this.password = password;
        this.balance = balance;
        this.status = "CLASSIC";
        this.shopping_cart = null;
        this.order_history = Orders.order_list;
    }
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
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
    public LinkedList<Orders> getOrder_history() {
        return order_history;
    }
    public void setOrder_history(LinkedList<Orders> order_history) {
        this.order_history = order_history;
    }
    public Integer[] getShopping_cart() {
        return shopping_cart;
    }
    public void setShopping_cart(Integer[] shopping_cart) {
        this.shopping_cart = shopping_cart;
    }
    public void displayPersonalData() {
        System.out.println("\nCustomer Name: " + getName());
        System.out.println("Id: " + getCustomerId());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Date of Birth: " + getDate_of_birth());
        //System.out.println("Password: " + getPassword());
        //System.out.println("Balance: " + getBalance());
        System.out.println("Status: " + getStatus());
        //System.out.println("Shopping_cart: " + getShopping_cart());
        //System.out.println("Order_history: " + Arrays.toString(getOrder_history()));

    }
    public static void Ch_pass(Integer Id,String old_password,String new_password){
        boolean is_customer_true = true;
        for (Customers customer : customer_list) {
            if (customer.getCustomerId().equals(Id)) {
                if(customer.getPassword().equals(old_password)){
                    customer.setPassword(new_password);
                    System.out.println("Password changed successfully\n");
                    is_customer_true = false;
                    break;
                }else {
                    System.out.println("The given password does not match the current password. Please try again.\n");
                }
            }
        }if(is_customer_true){
            System.out.printf("No customer with ID number "+ Id +" exists!\n");
        }
    }
    public static void Deposit_money(Integer Id,Double amount){
        boolean is_customer_true = true;
        for (Customers customer : customer_list) {
            if (customer.getCustomerId().equals(Id)) {
                is_customer_true = false;
                customer.setBalance(customer.getBalance()+amount);
                System.out.println("Deposit completed successfully\n");
                break;
            }
        }if (is_customer_true){
            System.out.printf("No customer with ID number "+ Id +" exists!\n");
        }
    }
    public static void Show_champaigns(Integer Id){
        boolean is_customer_true = true;
        boolean is_campaign_true = true;
        for (Customers customer : customer_list) {
            if (customer.getCustomerId().equals(Id)) {
                is_customer_true = false;
                for(Campaigns campaign: Campaigns.campaign_list){
                    is_campaign_true = false;
                    System.out.printf(campaign.getDiscount_rate()+" sales of " +
                            campaign.getItemType()+ " until " + campaign.getEndDate()+"\n");

                }
            }
        }if (is_customer_true) {
            System.out.print("No customer with ID number " + Id + " exists!\n");
        }if (is_campaign_true){
            System.out.print("No campaign has been created so far!\n");
        }
    }
    public static void Add_to_cart(Integer CustomerId,Integer Item_ID){
        boolean is_customer_true = true;
        for (Customers customer : customer_list) {
            if (customer.getCustomerId().equals(CustomerId)) {
                is_customer_true = false;
                Add_to_cart_sub_function(Item_ID, CustomerId);
                if(!customer.Temp_stack.isEmpty()) {
                    System.out.println("Item added to cart successfully");
                    break;
                }
            }
        }if(is_customer_true){
            System.out.printf("No customer with ID number "+ CustomerId +" exists!\n");
        }
    }
    public static void Add_to_cart_sub_function(Integer Item_Id,Integer CustomerId){
        List<Book> tempBookList = new ArrayList<>(Book.bookLinkedList);
        List<Cd_Dvd> tempCd_DvdList = new ArrayList<>(Cd_Dvd.cd_dvdLinkedList);
        List<Hair_care> tempHair_careList = new ArrayList<>(Hair_care.hair_CareLinkedList);
        List<Perfume> tempPerfumeList = new ArrayList<>(Perfume.perfumeLinkedList);
        List<Skin_care> tempSkin_careList = new ArrayList<>(Skin_care.skin_careLinkedList);
        List<Desktop> tempDesktopList = new ArrayList<>(Desktop.desktopLinkedList);
        List<Laptop> tempLaptopList = new ArrayList<>(Laptop.laptopLinkedList);
        List<Tablet> tempTabletList = new ArrayList<>(Tablet.tabletLinkedList);
        List<Smart_phone> tempSmart_phoneList = new ArrayList<>(Smart_phone.smart_phoneLinkedList);
        List<Tv> tempTvList = new ArrayList<>(Tv.TvLinkedList);

        for (Hair_care Temp : tempHair_careList) {
            for(Customers customer : customer_list) {
                if (customer.getCustomerId().equals(CustomerId)) {
                    if (Objects.equals(Temp.getId(), Item_Id)) {
                        customer.Temp_stack.push(Temp);
                        Hair_care.hair_CareLinkedList.remove(Temp);
                        break;
                    }
                }
            }
        }
        for (Perfume Temp : tempPerfumeList) {
            for (Customers customer : customer_list) {
                if (customer.getCustomerId().equals(CustomerId)) {
                    if (Objects.equals(Temp.getId(), Item_Id)) {
                        customer.Temp_stack.push(Temp);
                        Perfume.perfumeLinkedList.remove(Temp);
                        break;
                    }
                }
            }
        }
        for (Skin_care Temp : tempSkin_careList) {
            for (Customers customer : customer_list) {
                if (customer.getCustomerId().equals(CustomerId)) {
                    if (Objects.equals(Temp.getId(), Item_Id)) {
                        customer.Temp_stack.push(Temp);
                        Skin_care.skin_careLinkedList.remove(Temp);
                        break;
                    }
                }
            }
        }
        for (Desktop Temp : tempDesktopList) {
            for (Customers customer : customer_list) {
                if (customer.getCustomerId().equals(CustomerId)) {
                    if (Objects.equals(Temp.getId(), Item_Id)) {
                        customer.Temp_stack.push(Temp);
                        Desktop.desktopLinkedList.remove(Temp);
                        break;
                    }
                }
            }
        }
        for (Laptop Temp : tempLaptopList) {
            for (Customers customer : customer_list) {
                if (customer.getCustomerId().equals(CustomerId)) {
                    if (Objects.equals(Temp.getId(), Item_Id)) {
                        customer.Temp_stack.push(Temp);
                        Laptop.laptopLinkedList.remove(Temp);
                        break;
                    }
                }
            }
        }
        for (Tablet Temp : tempTabletList) {
            for (Customers customer : customer_list) {
                if (customer.getCustomerId().equals(CustomerId)) {
                    if (Objects.equals(Temp.getId(), Item_Id)) {
                        customer.Temp_stack.push(Temp);
                        Tablet.tabletLinkedList.remove(Temp);
                        break;
                    }
                }
            }
        }
        for (Smart_phone Temp : tempSmart_phoneList) {
            for (Customers customer : customer_list) {
                if (customer.getCustomerId().equals(CustomerId)) {
                    if (Objects.equals(Temp.getId(), Item_Id)) {
                        customer.Temp_stack.push(Temp);
                        Smart_phone.smart_phoneLinkedList.remove(Temp);
                        break;
                    }
                }
            }
        }
        for (Tv Temp : tempTvList) {
            for (Customers customer : customer_list) {
                if (customer.getCustomerId().equals(CustomerId)) {
                    if (Objects.equals(Temp.getId(), Item_Id)) {
                        customer.Temp_stack.push(Temp);
                        Tv.TvLinkedList.remove(Temp);
                        break;
                    }
                }
            }
        }
        for (Book Temp : tempBookList) {
            for (Customers customer : customer_list) {
                if (customer.getCustomerId().equals(CustomerId)) {
                    if (Objects.equals(Temp.getId(), Item_Id)) {
                        customer.Temp_stack.push(Temp);
                        Book.bookLinkedList.remove(Temp);
                        break;
                    }
                }
            }
        }
        for (Cd_Dvd Temp : tempCd_DvdList) {
            for (Customers customer : customer_list) {
                if (customer.getCustomerId().equals(CustomerId)) {
                    if (Objects.equals(Temp.getId(), Item_Id)) {
                        customer.Temp_stack.push(Temp);
                        Cd_Dvd.cd_dvdLinkedList.remove(Temp);
                        break;
                    }
                }
            }
        }
    }
    public static void Empty_cart(Integer CustomerId){
        boolean is_customer_true = true;
        for (Customers customer : customer_list) {
            if (customer.getCustomerId().equals(CustomerId)) {
                is_customer_true = false;
                customer.Temp_stack.removeAllElements();
                System.out.println("The cart has been emptied.\n");
                break;
            }
        }if (is_customer_true){
            System.out.printf("No customer with ID number "+ CustomerId +" exists!\n");
        }
    }
    public static void Order(Integer CustomerId, String Customer_Password){
        boolean is_customer_true = true;
        boolean is_password_true = true;
        boolean is_cart_empty = true;
        boolean is_balance_enough = true;
        for (Customers customer : customer_list) {
            if (customer.getCustomerId().equals(CustomerId)) {
                is_customer_true = false;
                if(customer.getPassword().equals(Customer_Password)){
                    is_password_true = false;
                   if(!customer.Temp_stack.isEmpty()) {
                          is_cart_empty = false;
                       double total_price = 0;
                       switch (customer.getStatus()) {
                           case "CLASSIC" -> {
                               for (int i = 0; i < customer.Temp_stack.size(); i++) {
                                   total_price = total_price + ((Items) customer.Temp_stack.get(i)).getPrice();
                               }if(total_price >= 1000 && total_price < 5000 && customer.getBalance() >= total_price){
                                   customer.setStatus("SILVER");
                               }if (total_price >= 5000 && customer.getBalance() >= total_price){
                                   customer.setStatus("GOLDEN");
                               }if (customer.getBalance() >= total_price) {
                                   is_balance_enough = false;
                                   customer.setBalance(customer.getBalance() - total_price);
                                   System.out.println("\nOrder placed successfully\n");
                               }
                           }
                           case "SILVER" -> {
                               for (int i = 0; i < customer.Temp_stack.size(); i++){
                                   total_price = total_price + ((Items) customer.Temp_stack.get(i)).getPrice();
                               }if (total_price >= 5000 && customer.getBalance() >= total_price){
                                   customer.setStatus("GOLDEN");
                               }if(customer.getBalance() >= total_price*10/100) {
                                   is_balance_enough = false;
                                   customer.setBalance(customer.getBalance() - total_price);
                                   System.out.println("\nOrder placed successfully\n");
                               }
                           }
                           case "GOLDEN" -> {
                               for (int i = 0; i < customer.Temp_stack.size(); i++){
                                   total_price = total_price + ((Items) customer.Temp_stack.get(i)).getPrice();
                               }if(customer.getBalance() >= total_price*15/100) {
                                   is_balance_enough = false;
                                   customer.setBalance(customer.getBalance() - total_price);
                                   System.out.println("\nOrder placed successfully\n");
                               }
                           }
                       }
                   }
                }
            }
        }if (is_customer_true) {
            System.out.print("No customer with ID number " + CustomerId + " exists!\n");
            is_password_true = false;
            is_cart_empty = false;
            is_balance_enough = false;
        }if (is_password_true) {
            System.out.print("Order could not be placed. Invalid password.\n");
            is_cart_empty = false;
            is_balance_enough = false;
        }if (is_cart_empty) {
            System.out.print("You should add some items to your cart before order request!\n");
            is_balance_enough = false;
        }if (is_balance_enough) {
            System.out.print("Order could not be placed. Insufficient funds.\n");
        }
    }
}
