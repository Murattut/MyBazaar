package Users;
import Items_sub.Cosmetic_sub.Hair_care;
import Items_sub.Cosmetic_sub.Perfume;
import Items_sub.Cosmetic_sub.Skin_care;
import Items_sub.Electronic_sub.Computer_sub.Desktop;
import Items_sub.Electronic_sub.Computer_sub.Laptop;
import Items_sub.Electronic_sub.Computer_sub.Tablet;
import Items_sub.Electronic_sub.Smart_phone;
import Items_sub.Electronic_sub.Tv;
import Items_sub.Office_supplies_sub.Book;
import Items_sub.Office_supplies_sub.Cd_Dvd;
import Shopping_sub.Orders;
import java.util.LinkedList;
import java.util.Objects;
public class Technician extends Employee{
    public static LinkedList<Technician> Technician_list = new LinkedList<>();
    private Boolean Is_senior;
    public Technician(String name, String email, String date_of_birth, Double salary, Boolean Is_senior) {
        super(name, email, date_of_birth, salary);
        this.Is_senior = Is_senior;
    }
    public Boolean isIs_senior() {
        return Is_senior;
    }
    public void setIs_senior(Boolean is_senior) {
        Is_senior = is_senior;
    }
    public void displayPersonalData() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Date of Birth: " + getDate_of_birth());
        System.out.println("Salary: " + getSalary());
        System.out.println("Is_senior: " + isIs_senior());
    }
    public static void Add_item(String tech_name, String Item_name,
                                Double price,
                                String manufacturer, String brand,
                                String expiration_date, Double weight, Boolean organic,
                                Boolean medicated_or_baby_sensitive) {
        boolean is_tech_true = true;
        boolean is_item_true = true;
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                is_tech_true = false;
                if (Item_name.equals("HAIRCARE")) {
                    is_item_true = false;
                    Hair_care new_haircare = new Hair_care(price, manufacturer, brand,
                            expiration_date, weight, organic, medicated_or_baby_sensitive);
                    Hair_care.hair_CareLinkedList.add(new_haircare);
                    break;
                }if (Item_name.equals("SKINCARE")) {
                    is_item_true = false;
                    Skin_care skinCare = new Skin_care(price, manufacturer, brand,
                            expiration_date, weight, organic,medicated_or_baby_sensitive);
                    Skin_care.skin_careLinkedList.add(skinCare);
                    break;
                }
            }
        }if (is_tech_true){
            System.out.printf("No technician person named "+ tech_name +" exists!\n");
        }if (is_item_true){
            System.out.printf("No item type "+ Item_name +" found\n");
        }
    }
    public static void Add_item(String tech_name,String Item_name, Double price,
                                String manufacturer, String brand,
                                String expiration_date, Double weight, Boolean organic,
                                Integer lasting_duration) {
        boolean is_tech_true = true;
        boolean is_item_true = true;
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                is_tech_true = false;
                if (Item_name.equals("PERFUME")) {
                    is_item_true = false;
                    Perfume perfume = new Perfume(price, manufacturer, brand,
                            expiration_date, weight, organic,lasting_duration);
                    Perfume.perfumeLinkedList.add(perfume);
                    break;
                }
            }
        }if (is_tech_true){
            System.out.printf("No technician person named "+ tech_name +" exists!\n");
        }if (is_item_true){
            System.out.printf("No item type "+ Item_name +" found\n");
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                Double price, String manufacturer, String brand,
                                Double maximum_allowed_input_voltage, Double maximum_power_consumption,
                                String operating_system, String CPU_Type, Integer RAM_Capacity, Integer HDD_Capacity,
                                String box_color) {
        boolean is_tech_true = true;
        boolean is_item_true = true;
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                is_tech_true = false;
                if (Item_name.equals("DESKTOP")) {
                    is_item_true = false;
                    Desktop desktop = new Desktop(price, manufacturer, brand,
                            maximum_allowed_input_voltage, maximum_power_consumption,
                            operating_system, CPU_Type, RAM_Capacity, HDD_Capacity,box_color);
                    Desktop.desktopLinkedList.add(desktop);
                    break;
                }
            }
        }if (is_tech_true){
            System.out.printf("No technician person named "+ tech_name +" exists!\n");
        }if (is_item_true){
            System.out.printf("No item type "+ Item_name +" found\n");
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                Double price, String manufacturer, String brand,
                                Double maximum_allowed_input_voltage, Double maximum_power_consumption,
                                String operating_system, String CPU_Type, Integer RAM_Capacity, Integer HDD_Capacity,
                                Boolean HDMI_support) {
        boolean is_tech_true = true;
        boolean is_item_true = true;
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                is_tech_true = false;
                if (Item_name.equals("LAPTOP")) {
                    is_item_true = false;
                    Laptop laptop = new Laptop(price, manufacturer, brand, maximum_allowed_input_voltage, maximum_power_consumption,
                            operating_system, CPU_Type, RAM_Capacity, HDD_Capacity,HDMI_support);
                    Laptop.laptopLinkedList.add(laptop);
                    break;
                }
            }
        }if (is_tech_true){
            System.out.printf("No technician person named "+ tech_name +" exists!\n");
        }if (is_item_true){
            System.out.printf("No item type "+ Item_name +" found\n");
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                Double price, String manufacturer, String brand,
                                Double maximum_allowed_input_voltage, Double maximum_power_consumption,
                                String operating_system, String CPU_Type, Integer RAM_Capacity, Integer HDD_Capacity,
                                Integer Dimension) {
        boolean is_tech_true = true;
        boolean is_item_true = true;
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                is_tech_true = false;
                if (Item_name.equals("TABLET")) {
                    is_item_true = false;
                    Tablet tablet = new Tablet(price, manufacturer, brand, maximum_allowed_input_voltage, maximum_power_consumption,
                            operating_system, CPU_Type, RAM_Capacity, HDD_Capacity, Dimension);
                    Tablet.tabletLinkedList.add(tablet);
                    break;
                }
            }
        }if (is_tech_true){
            System.out.printf("No technician person named "+ tech_name +" exists!\n");
        }if (is_item_true){
            System.out.printf("No item type "+ Item_name +" found\n");
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                Double price, String manufacturer, String brand,
                                Double maximum_allowed_input_voltage, Double maximum_power_consumption,
                                String screen_type) {
        boolean is_tech_true = true;
        boolean is_item_true = true;
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                is_tech_true = false;
                if (Item_name.equals("SMARTPHONE")) {
                    is_item_true = false;
                    Smart_phone smartPhone = new Smart_phone(price, manufacturer, brand,
                            maximum_allowed_input_voltage, maximum_power_consumption,screen_type);
                    Smart_phone.smart_phoneLinkedList.add(smartPhone);
                    break;
                }
            }
        }if (is_tech_true){
            System.out.printf("No technician person named "+ tech_name +" exists!\n");
        }if (is_item_true){
            System.out.printf("No item type "+ Item_name +" found\n");
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                double price, String manufacturer, String brand,
                                double maximum_allowed_input_voltage, double maximum_power_consumption,
                                int screen_size) {
        boolean is_tech_true = true;
        boolean is_item_true = true;
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                is_tech_true = false;
                if (Item_name.equals("TV")) {
                    is_item_true = false;
                    Tv tv = new Tv(price, manufacturer, brand,
                            maximum_allowed_input_voltage, maximum_power_consumption,screen_size);
                    Tv.TvLinkedList.add(tv);
                    break;
                }
            }
        }if (is_tech_true){
            System.out.printf("No technician person named "+ tech_name +" exists!\n");
        }if (is_item_true){
            System.out.printf("No item type "+ Item_name +" found\n");
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                double price, String release_date, String cover_title,
                                String publisher,String[] author, int pages) {
        boolean is_tech_true = true;
        boolean is_item_true = true;
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                is_tech_true = false;
                if (Item_name.equals("BOOK")) {
                    is_item_true = false;
                    Book book = new Book(price, release_date,
                            cover_title,publisher,author,pages);
                    Book.bookLinkedList.add(book);
                    break;
                }
            }
        }if (is_tech_true){
            System.out.printf("No technician person named "+ tech_name +" exists!\n");
        }if (is_item_true){
            System.out.printf("No item type "+ Item_name +" found\n");
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                Double price, String cover_title, String release_date,
                                String composer,String[] song) {
        boolean is_tech_true = true;
        boolean is_item_true = true;
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                is_tech_true = false;
                if (Item_name.equals("CDDVD")) {
                    is_item_true = false;
                    Cd_Dvd cdDvd = new Cd_Dvd(price, release_date, cover_title,composer,song);
                    Cd_Dvd.cd_dvdLinkedList.add(cdDvd);
                    break;
                }
            }
        }if (is_tech_true){
            System.out.printf("No technician person named "+ tech_name +" exists!\n");
        }if (is_item_true){
            System.out.printf("No item type "+ Item_name +" found\n");
        }
    }
    public static void Show_order(String Tech_name){
        boolean is_tech_true = true;
        boolean is_senior_true = true;
        for(Technician tech : Technician.Technician_list){
            if(Objects.equals(tech.getName(), Tech_name)){
                is_tech_true = false;
                if(tech.isIs_senior()){
                    is_senior_true = false;
                    for(Orders order : Orders.order_list){
                        System.out.println("Order Date: " + order.getOrderDate());
                        System.out.println("Total Cost: " + order.getTotalCost());
                        System.out.println("Purchased Items: " + order.getPurchased_items());
                    }
                }
            }
        }if (is_tech_true) {
            System.out.printf("No technician person named " + Tech_name + " exists!\n");
        }
        if (is_senior_true) {
            System.out.printf("is not authorized to display orders!\n");
        }
    }
}
