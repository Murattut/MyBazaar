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
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                if (Item_name.equals("HAIRCARE")) {
                    Hair_care new_haircare = new Hair_care(price, manufacturer, brand,
                            expiration_date, weight, organic, medicated_or_baby_sensitive);
                    Hair_care.hair_CareLinkedList.add(new_haircare);
                }if (Item_name.equals("SKINCARE")) {
                    Skin_care skinCare = new Skin_care(price, manufacturer, brand,
                            expiration_date, weight, organic,medicated_or_baby_sensitive);
                    Skin_care.skin_careLinkedList.add(skinCare);
                } else {
                    System.out.print("somethings go wrong");
                }
            }
        }
    }
    public static void Add_item(String tech_name,String Item_name, Double price,
                                String manufacturer, String brand,
                                String expiration_date, Double weight, Boolean organic,
                                Integer lasting_duration) {
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                if (Item_name.equals("PERFUME")) {
                    Perfume perfume = new Perfume(price, manufacturer, brand,
                            expiration_date, weight, organic,lasting_duration);
                    Perfume.perfumeLinkedList.add(perfume);
                } else {
                    System.out.print("somethings go wrong");
                }
            }
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                Double price, String manufacturer, String brand,
                                Double maximum_allowed_input_voltage, Double maximum_power_consumption,
                                String operating_system, String CPU_Type, Integer RAM_Capacity, Integer HDD_Capacity,
                                String box_color) {
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                if (Item_name.equals("DESKTOP")) {
                    Desktop desktop = new Desktop(price, manufacturer, brand,
                            maximum_allowed_input_voltage, maximum_power_consumption,
                            operating_system, CPU_Type, RAM_Capacity, HDD_Capacity,box_color);
                    Desktop.desktopLinkedList.add(desktop);
                } else {
                    System.out.print("somethings go wrong");
                }
            }
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                Double price, String manufacturer, String brand,
                                Double maximum_allowed_input_voltage, Double maximum_power_consumption,
                                String operating_system, String CPU_Type, Integer RAM_Capacity, Integer HDD_Capacity,
                                Boolean HDMI_support) {
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                if (Item_name.equals("LAPTOP")) {
                    Laptop laptop = new Laptop(price, manufacturer, brand, maximum_allowed_input_voltage, maximum_power_consumption,
                            operating_system, CPU_Type, RAM_Capacity, HDD_Capacity,HDMI_support);
                    Laptop.laptopLinkedList.add(laptop);
                } else {
                    System.out.print("somethings go wrong");
                }
            }
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                Double price, String manufacturer, String brand,
                                Double maximum_allowed_input_voltage, Double maximum_power_consumption,
                                String operating_system, String CPU_Type, Integer RAM_Capacity, Integer HDD_Capacity,
                                Integer Dimension) {
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                if (Item_name.equals("TABLET")) {
                    Tablet tablet = new Tablet(price, manufacturer, brand, maximum_allowed_input_voltage, maximum_power_consumption,
                            operating_system, CPU_Type, RAM_Capacity, HDD_Capacity, Dimension);
                    Tablet.tabletLinkedList.add(tablet);
                } else {
                    System.out.print("somethings go wrong");
                }
            }
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                Double price, String manufacturer, String brand,
                                Double maximum_allowed_input_voltage, Double maximum_power_consumption,
                                String screen_type) {
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                if (Item_name.equals("SMARTPHONE")) {
                    Smart_phone smartPhone = new Smart_phone(price, manufacturer, brand,
                            maximum_allowed_input_voltage, maximum_power_consumption,screen_type);
                    Smart_phone.smart_phoneLinkedList.add(smartPhone);
                } else {
                    System.out.print("somethings go wrong");
                }
            }
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                double price, String manufacturer, String brand,
                                double maximum_allowed_input_voltage, double maximum_power_consumption,
                                int screen_size) {
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                if (Item_name.equals("TV")) {
                    Tv tv = new Tv(price, manufacturer, brand,
                            maximum_allowed_input_voltage, maximum_power_consumption,screen_size);
                    Tv.TvLinkedList.add(tv);
                } else {
                    System.out.print("somethings go wrong");
                }
            }
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                double price, String release_date, String cover_title,
                                String publisher,String[] author, int pages) {
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                if (Item_name.equals("BOOK")) {
                    Book book = new Book(price, release_date,
                            cover_title,publisher,author,pages);
                    Book.bookLinkedList.add(book);
                } else {
                    System.out.print("somethings go wrong");
                }
            }
        }
    }
    public static void Add_item(String tech_name, String Item_name,
                                Double price, String cover_title, String release_date,
                                String composer,String[] song) {
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), tech_name)) {
                if (Item_name.equals("CDDVD")) {
                    Cd_Dvd cdDvd = new Cd_Dvd(price, release_date, cover_title,composer,song);
                    Cd_Dvd.cd_dvdLinkedList.add(cdDvd);
                } else {
                    System.out.print("somethings go wrong");
                }
            }
        }
    }
    public static void Show_order(String Tech_name){
        for(Technician tech : Technician.Technician_list){
            if(Objects.equals(tech.getName(), Tech_name)){
                if(tech.isIs_senior()){
                    for(Orders order : Orders.order_list){
                        System.out.println("Order Date: " + order.getOrderDate());
                        System.out.println("Total Cost: " + order.getTotalCost());
                        System.out.println("Purchased Items: " + order.getPurchased_items());
                    }
                }else{
                    System.out.printf(Tech_name + " is not authorized to display orders!");
                }

            }else{
                System.out.println("No technician person named " + Tech_name + " exists!");
            }
        }
    }
}
