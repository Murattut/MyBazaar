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
    public LinkedList<Object> shopping_cart = new LinkedList<>();
    private static Integer nextCustomerId = 1;
    private Integer customerId;
    private String password;
    private Double balance;
    private String status;
    private LinkedList<Orders> order_history;
    public Customers(String name, String email, String date_of_birth, String password,
                     Double balance) {
        super(name, email, date_of_birth);
        this.customerId =nextCustomerId++;
        this.password = password;
        this.balance = balance;
        this.status = "CLASSIC";
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
    public LinkedList<Object> getShopping_cart() {
        return shopping_cart;
    }
    public void setShopping_cart(LinkedList<Object> shopping_cart) {
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
    public static void Show_campaigns(Integer Id){
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
                if(!customer.shopping_cart.isEmpty()) {
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
                        customer.shopping_cart.add(Temp);
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
                        customer.shopping_cart.add(Temp);
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
                        customer.shopping_cart.add(Temp);
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
                        customer.shopping_cart.add(Temp);
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
                        customer.shopping_cart.add(Temp);
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
                        customer.shopping_cart.add(Temp);
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
                        customer.shopping_cart.add(Temp);
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
                        customer.shopping_cart.add(Temp);
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
                        customer.shopping_cart.add(Temp);
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
                        customer.shopping_cart.add(Temp);
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
                List<Object> itemsToRemove = new ArrayList<>();
                is_customer_true = false;
                while (!customer.shopping_cart.isEmpty()) {
                    for(Object item : customer.shopping_cart){
                        if(item instanceof Hair_care){
                            Hair_care.hair_CareLinkedList.add((Hair_care) item);
                            itemsToRemove.add(item);
                            customer.shopping_cart.remove(item);
                        }if (item instanceof Perfume){
                            Perfume.perfumeLinkedList.add((Perfume) item);
                            itemsToRemove.add(item);
                        }if (item instanceof Skin_care){
                            Skin_care.skin_careLinkedList.add((Skin_care) item);
                            itemsToRemove.add(item);
                        }if (item instanceof Desktop){
                            Desktop.desktopLinkedList.add((Desktop) item);
                            itemsToRemove.add(item);
                        }if (item instanceof Laptop){
                            Laptop.laptopLinkedList.add((Laptop) item);
                            itemsToRemove.add(item);
                        }if (item instanceof Tablet){
                            Tablet.tabletLinkedList.add((Tablet) item);
                            itemsToRemove.add(item);
                        }if (item instanceof Smart_phone){
                            Smart_phone.smart_phoneLinkedList.add((Smart_phone) item);
                            itemsToRemove.add(item);
                        }if (item instanceof Tv){
                            Tv.TvLinkedList.add((Tv) item);
                            itemsToRemove.add(item);
                        }if (item instanceof Book){
                            Book.bookLinkedList.add((Book) item);
                            itemsToRemove.add(item);
                        }if (item instanceof Cd_Dvd){
                            Cd_Dvd.cd_dvdLinkedList.add((Cd_Dvd) item);
                            itemsToRemove.add(item);
                        }
                    }customer.shopping_cart.removeAll(itemsToRemove);
                }
                if(customer.shopping_cart.isEmpty()){
                    System.out.println("The cart has been emptied.\n");
                    break;
                }else {
                    System.out.println("The cart could not be emptied.\n");
                }
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
                   if(!customer.shopping_cart.isEmpty()) {
                          is_cart_empty = false;
                       double total_price = 0;
                       switch (customer.getStatus()) {
                           case "CLASSIC" -> {
                               for (int i = 0; i < customer.shopping_cart.size(); i++) {
                                   total_price = total_price + ((Items) customer.shopping_cart.get(i)).getPrice();
                               }if(total_price >= 1000 && total_price < 5000 && customer.getBalance() >= total_price){
                                   customer.setStatus("SILVER");
                               }if (total_price >= 5000 && customer.getBalance() >= total_price){
                                   customer.setStatus("GOLDEN");
                               }if (customer.getBalance() >= total_price) {
                                   is_balance_enough = false;
                                   customer.setBalance(customer.getBalance() - total_price);
                                   Orders.order_list.add(new Orders(total_price, customer.shopping_cart.size(), CustomerId));
                                   customer.shopping_cart.removeAll(customer.shopping_cart);
                                   System.out.println("\nOrder placed successfully\n");
                               }
                           }
                           case "SILVER" -> {
                               for (int i = 0; i < customer.shopping_cart.size(); i++){
                                   total_price = total_price + ((Items) customer.shopping_cart.get(i)).getPrice();
                               }if (total_price >= 5000 && customer.getBalance() >= total_price){
                                   customer.setStatus("GOLDEN");
                               }if(customer.getBalance() >= total_price*10/100) {
                                   is_balance_enough = false;
                                   customer.setBalance(customer.getBalance() - total_price);
                                   Orders.order_list.add(new Orders(total_price, customer.shopping_cart.size(), CustomerId));
                                   customer.shopping_cart.removeAll(customer.shopping_cart);
                                   System.out.println("\nOrder placed successfully\n");
                               }
                           }
                           case "GOLDEN" -> {
                               for (int i = 0; i < customer.shopping_cart.size(); i++){
                                   total_price = total_price + ((Items) customer.shopping_cart.get(i)).getPrice();
                               }if(customer.getBalance() >= total_price*15/100) {
                                   is_balance_enough = false;
                                   customer.setBalance(customer.getBalance() - total_price);
                                   Orders.order_list.add(new Orders(total_price, customer.shopping_cart.size(), CustomerId));
                                   customer.shopping_cart.removeAll(customer.shopping_cart);
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
