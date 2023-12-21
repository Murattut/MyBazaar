import Users.Admin;
import Users.Customers;
import Users.Employee;
import Users.Technician;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        // Create a CEO for control everything
        //
        Admin System_admin = new Admin("System", "System@...",
                "01.01.1999", 100000.0, "test1234");
        Technician System_tech = new Technician("System", "System@...",
                "01.01.1999", 100000.0, true);
        Admin.Admin_list.add(System_admin);
        Technician.Technician_list.add(System_tech);

        // read users from file and add them to system
        String filename_users = "src/users.txt";
        readUsers(filename_users, System_admin);
        ///System.out.print("user readed 1 \n\n\n");

        // read items from file and add them to system
        String filename_items = "src/items.txt";
        readItems(filename_items, System_admin);
        ///System.out.print("item leaded \n\n\n");

        //read commands from file and process them
        String filename_Commands = "src/commands.txt";
        List<String> lines = readLinesFromFile(filename_Commands);
        for (String line : lines) {
            processCommand(line);
        }
    }

    private static void processCommand(String line) throws ParseException {
        String[] parts = line.split("[\t:]"); // Split by tabs or colons
        //String[] parts = line.split("\t"); // Split line by whitespace

        String functionName = parts[0];
        List<String> arguments = new ArrayList<>(Arrays.asList(parts).subList(1, parts.length));
        // Handle different functions with appropriate logic
        switch (functionName) {
            case "ADDCUSTOMER":
                String Admin_name = arguments.get(0);
                String customer_name = arguments.get(1);
                String customer_email = arguments.get(2);
                String customer_date_of_birth = arguments.get(3);
                Double customer_balance = Double.parseDouble(arguments.get(4));
                String customer_password = arguments.get(5);
                Admin.add_new_customar(Admin_name, customer_name, customer_email,
                        customer_date_of_birth, customer_balance, customer_password);
                break;
            case "SHOWCUSTOMER":
                String Admin_name1 = arguments.get(0);
                int CustomerId = Integer.parseInt(arguments.get(1));
                Admin.Show_Customer(Admin_name1, CustomerId);
                break;
            case "SHOWCUSTOMERS":
                String Admin_name2 = arguments.get(0);
                Admin.Show_Customers(Admin_name2);
                break;
            case "SHOWADMININFO":
                String Admin_name3 = arguments.get(0);
                Admin.Show_Admin_Info(Admin_name3);
                break;
            case "CREATECAMPAIGN":
                String Admin_name4 = arguments.get(0);
                String start_date = arguments.get(1);
                String end_date = arguments.get(2);
                String Item_type = arguments.get(3);
                Integer rate = Integer.parseInt(arguments.get(4));
                Admin.Create_campaign(Admin_name4, start_date, end_date, Item_type, rate);
                break;
            case "ADDADMIN":
                String Admin_name5 = arguments.get(0);
                String admin_name = arguments.get(1);
                String admin_email = arguments.get(2);
                String admin_date_of_birth = arguments.get(3);
                Double admin_salary = Double.parseDouble(arguments.get(4));
                String admin_password = arguments.get(5);
                Admin.Add_Admin(Admin_name5, admin_name, admin_email,
                        admin_date_of_birth, admin_salary, admin_password);
                break;
            case "ADDTECH":
                String Admin_name6 = arguments.get(0);
                String tech_name = arguments.get(1);
                String tech_email = arguments.get(2);
                String tech_date_of_birth = arguments.get(3);
                Double tech_salary = Double.parseDouble(arguments.get(4));
                Boolean tech_is_senior = Boolean.parseBoolean(arguments.get(5));
                Admin.Add_Tech(Admin_name6, tech_name, tech_email,
                        tech_date_of_birth, tech_salary, tech_is_senior);
                break;
            case "LISTITEM":
                String Admin_tech_name = arguments.get(0);
                Employee.Show_item(Admin_tech_name);
                break;
            case "SHOWITEMSLOWONSTOCK":
                String Admin_tech_name2 = arguments.get(0);
                if (arguments.size() == 2)
                    Employee.Show_item_low_on_stock(Admin_tech_name2, Integer.valueOf(arguments.get(1)));
                else
                    Employee.Show_item_low_on_stock(Admin_tech_name2);
                break;
            case "SHOWVIP":
                String Admin_tech_name3 = arguments.get(0);
                Employee.show_vip(Admin_tech_name3);
                break;
            case "DISPITEMSOF":
                String Admin_tech_name1 = arguments.get(0);
                System.out.printf("\nthis is: " + Admin_tech_name1 + "\n");
                String[] DISPITEMSOF_Array = new String[arguments.size() - 1];
                for (int i = 1; i < arguments.size(); i++) {
                    DISPITEMSOF_Array[i - 1] = arguments.get(i);
                }
                Employee.Disp_item_soft(Admin_tech_name1, DISPITEMSOF_Array);
                break;
            case "ADDITEM":
                String Tech_name1 = arguments.get(0);
                String item_name = arguments.get(1);
                double price;
                String manufacturer;
                String brand;
                String expiration_date;
                double weight;
                boolean organic;
                boolean medicated;
                int lasting_duration;
                boolean baby_sensitive;
                double maximum_allowed_input_voltage;
                double maximum_power_consumption;
                String operating_system;
                String CPU_Type;
                int RAM_Capacity;
                int HDD_Capacity;
                String box_color;
                boolean HDMI_support;
                int Dimension;
                String ScreanType;
                int ScreanSize;
                String realiseDate;
                String CoverTitle;
                String PuplisherName;
                String[] Authors_name = new String[100]; // I don't know how many authors will be
                // but ı think a book can't have more than 100 authors
                int page_number;
                String Composer_name;
                String[] Song = new String[1000]; // I don't know how many songs will be
                // but ı think a CD/DVD can't more than have 1000 songs
                switch (item_name) {
                    case ("HAIRCARE"):
                        price = Double.parseDouble(arguments.get(2));
                        manufacturer = arguments.get(3);
                        brand = arguments.get(4);
                        expiration_date = arguments.get(6);
                        weight = Double.parseDouble(arguments.get(7));
                        organic = Boolean.parseBoolean(arguments.get(5));
                        medicated = Boolean.parseBoolean(arguments.get(8));
                        Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                                expiration_date, weight, organic, medicated);
                        break;
                    case ("PERFUME"):
                        price = Double.parseDouble(arguments.get(2));
                        manufacturer = arguments.get(3);
                        brand = arguments.get(4);
                        expiration_date = arguments.get(6);
                        weight = Double.parseDouble(arguments.get(7));
                        organic = Boolean.parseBoolean(arguments.get(5));
                        lasting_duration = Integer.parseInt(arguments.get(8));
                        Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                                expiration_date, weight, organic, lasting_duration);
                        break;
                    case ("SKINCARE"):
                        price = Double.parseDouble(arguments.get(2));
                        manufacturer = arguments.get(3);
                        brand = arguments.get(4);
                        expiration_date = arguments.get(6);
                        weight = Double.parseDouble(arguments.get(7));
                        organic = Boolean.parseBoolean(arguments.get(5));
                        baby_sensitive = Boolean.parseBoolean(arguments.get(8));
                        Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                                expiration_date, weight, organic, baby_sensitive);
                        break;
                    case ("DESKTOP"):
                        price = Double.parseDouble(arguments.get(2));
                        manufacturer = arguments.get(3);
                        brand = arguments.get(4);
                        maximum_allowed_input_voltage = Double.parseDouble(arguments.get(5));
                        maximum_power_consumption = Double.parseDouble(arguments.get(6));
                        operating_system = arguments.get(7);
                        CPU_Type = arguments.get(8);
                        RAM_Capacity = Integer.parseInt(arguments.get(9));
                        HDD_Capacity = Integer.parseInt(arguments.get(10));
                        box_color = arguments.get(11);
                        Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                                maximum_allowed_input_voltage, maximum_power_consumption,
                                operating_system, CPU_Type, RAM_Capacity, HDD_Capacity, box_color);
                        break;
                    case ("LAPTOP"):
                        price = Double.parseDouble(arguments.get(2));
                        manufacturer = arguments.get(3);
                        brand = arguments.get(4);
                        maximum_allowed_input_voltage = Double.parseDouble(arguments.get(5));
                        maximum_power_consumption = Double.parseDouble(arguments.get(6));
                        operating_system = arguments.get(7);
                        CPU_Type = arguments.get(8);
                        RAM_Capacity = Integer.parseInt(arguments.get(9));
                        HDD_Capacity = Integer.parseInt(arguments.get(10));
                        HDMI_support = Boolean.parseBoolean(arguments.get(11));
                        Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                                maximum_allowed_input_voltage, maximum_power_consumption,
                                operating_system, CPU_Type, RAM_Capacity, HDD_Capacity, HDMI_support);
                        break;
                    case ("TABLET"):
                        price = Double.parseDouble(arguments.get(2));
                        manufacturer = arguments.get(3);
                        brand = arguments.get(4);
                        maximum_allowed_input_voltage = Double.parseDouble(arguments.get(5));
                        maximum_power_consumption = Double.parseDouble(arguments.get(6));
                        operating_system = arguments.get(7);
                        CPU_Type = arguments.get(8);
                        RAM_Capacity = Integer.parseInt(arguments.get(9));
                        HDD_Capacity = Integer.parseInt(arguments.get(10));
                        Dimension = Integer.parseInt((arguments.get(11)));
                        Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                                maximum_allowed_input_voltage, maximum_power_consumption,
                                operating_system, CPU_Type, RAM_Capacity, HDD_Capacity, Dimension);
                        break;
                    case ("SMARTPHONE"):
                        price = Double.parseDouble(arguments.get(2));
                        manufacturer = arguments.get(3);
                        brand = arguments.get(4);
                        maximum_allowed_input_voltage = Double.parseDouble(arguments.get(5));
                        maximum_power_consumption = Double.parseDouble(arguments.get(6));
                        ScreanType = arguments.get(7);
                        Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                                maximum_allowed_input_voltage, maximum_power_consumption, ScreanType);
                        break;
                    case ("TV"):
                        price = Double.parseDouble(arguments.get(2));
                        manufacturer = arguments.get(3);
                        brand = arguments.get(4);
                        maximum_allowed_input_voltage = Double.parseDouble(arguments.get(5));
                        maximum_power_consumption = Double.parseDouble(arguments.get(6));
                        ScreanSize = Integer.parseInt(arguments.get(7));
                        Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                                maximum_allowed_input_voltage, maximum_power_consumption, ScreanSize);
                        break;
                    case ("BOOK"):
                        price = Double.parseDouble(arguments.get(2));
                        realiseDate = (arguments.get(3));
                        CoverTitle = arguments.get(4);
                        PuplisherName = arguments.get(5);
                        for (int i = 6; i < arguments.size(); i++) {
                            Authors_name[i - 6] = arguments.get(i);
                        }
                        page_number = Integer.parseInt(arguments.get(6));
                        Technician.Add_item(Tech_name1, item_name, price, realiseDate, CoverTitle,
                                PuplisherName, Authors_name, page_number);
                        break;
                    case ("CDDVD"):
                        price = Double.parseDouble(arguments.get(2));
                        realiseDate = (arguments.get(3));
                        CoverTitle = arguments.get(4);
                        Composer_name = arguments.get(5);
                        for (int i = 6; i < arguments.size(); i++) {
                            Song[i - 6] = arguments.get(i);
                        }
                        Technician.Add_item(Tech_name1, item_name, price, realiseDate, CoverTitle,
                                Composer_name, Song);
                        break;
                }
                break;
            case "SHOWORDERS":
                String Tech_name = arguments.get(0);
                Technician.Show_order(Tech_name);
                break;
            case "CHPASS":
                Integer Customer_ID2 = Integer.valueOf(arguments.get(0));
                String old_password = arguments.get(1);
                String new_password = arguments.get(2);
                Customers.Ch_pass(Customer_ID2, old_password, new_password);
                break;
            case "DEPOSITMONEY":
                Integer Customer_ID1 = Integer.valueOf(arguments.get(0));
                Double amount = Double.valueOf(arguments.get(1));
                Customers.Deposit_money(Customer_ID1, amount);
                break;
            case "SHOWCAMPAIGNS":
                Integer Customer_ID = Integer.valueOf(arguments.get(0));
                Customers.Show_champaigns(Customer_ID);
                break;
            case "ADDTOCART":
                Integer customerId = Integer.parseInt(arguments.get(0));
                Integer itemId = Integer.parseInt(arguments.get(1));
                Customers.Add_to_cart(customerId, itemId);
                break;
            case "EMPTYCART":
                Integer Customer_ID3 = Integer.valueOf(arguments.get(0));
                Customers.Empty_cart(Customer_ID3);
                break;
            case "ORDER":
                Integer customerId1 = Integer.parseInt(arguments.get(0));
                String customer_password1 = arguments.get(1);
                Customers.Order(customerId1, customer_password1);
                break;
            default:
                System.out.println("Unknown function: " + functionName);
                break;
        }
    }

    private static List<String> readLinesFromFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    public static void readUsers(String filename, Admin ceo) throws FileNotFoundException {
        File userFile = new File(filename);
        Scanner scanner = new Scanner(userFile);


        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.trim().isEmpty()) {
                continue; // Skip empty lines
            }
            String[] userInfo = line.split("\t"); // Split line by tabs

            String userType = userInfo[0];
            String name;
            String email;
            String birthDate;
            double salary;
            String password;
            boolean isSenior;
            double balance;
            // System.out.printf("this is: "+ userType+"\n");
            switch (userType) {
                case "ADMIN":
                    name = userInfo[1];
                    email = userInfo[2];
                    birthDate = userInfo[3];
                    salary = Double.parseDouble(userInfo[4]);
                    password = userInfo[5];
                    ceo.Add_Admin(ceo.getName(), name, email, birthDate, salary, password);
                    break;
                case "TECH":
                    name = userInfo[1];
                    email = userInfo[2];
                    birthDate = userInfo[3];
                    salary = Double.parseDouble(userInfo[4]);
                    isSenior = Boolean.parseBoolean(userInfo[5]);
                    ceo.Add_Tech(ceo.getName(), name, email, birthDate, salary, isSenior);
                    break;
                case "CUSTOMER":
                    name = userInfo[1];
                    email = userInfo[2];
                    birthDate = userInfo[3];
                    balance = Double.parseDouble(userInfo[4]);
                    password = userInfo[5];
                    ceo.add_new_customar(ceo.getName(), name, email, birthDate, balance, password);
                    break;
                default:
                    System.out.println("Invalid user type: " + userType);
                    break;
            }
        }

        scanner.close();
    }

    public static void readItems(String filename, Admin ceo) throws FileNotFoundException {
        File userFile = new File(filename);
        Scanner scanner = new Scanner(userFile);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.trim().isEmpty()) {
                continue; // Skip empty lines
            }
            String[] arguments = new String[12];
            String[] temp = line.split("\t");
            System.arraycopy(temp, 0, arguments, 1, temp.length);
            arguments[0] = ceo.getName();
            String Tech_name1 = arguments[0];
            String item_name = arguments[1];
            double price;
            String manufacturer;
            String brand;
            String expiration_date;
            double weight;
            boolean organic;
            boolean medicated;
            int lasting_duration;
            boolean baby_sensitive;
            double maximum_allowed_input_voltage;
            double maximum_power_consumption;
            String operating_system;
            String CPU_Type;
            int RAM_Capacity;
            int HDD_Capacity;
            String box_color;
            boolean HDMI_support;
            int Dimension;
            String ScreanType;
            int ScreanSize;
            String realiseDate;
            String CoverTitle;
            String PuplisherName;
            String[] Authors_name = new String[100]; // I don't know how many authors will be
            // but ı think a book can't have more than 100 authors
            int page_number;
            String Composer_name;
            String[] Song = new String[1000]; // I don't know how many songs will be
            // but ı think a CD/DVD can't more than have 1000 songs
            switch (item_name) {
                case ("HAIRCARE"):
                    price = Double.parseDouble(arguments[2]);
                    manufacturer = arguments[3];
                    brand = arguments[4];
                    expiration_date = arguments[6];
                    weight = Double.parseDouble(arguments[7]);
                    organic = Boolean.parseBoolean(arguments[5]);
                    medicated = Boolean.parseBoolean(arguments[8]);
                    Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                            expiration_date, weight, organic, medicated);
                    break;
                case ("PERFUME"):
                    price = Double.parseDouble(arguments[2]);
                    manufacturer = arguments[3];
                    brand = arguments[4];
                    organic = Boolean.parseBoolean(arguments[5]);
                    expiration_date = arguments[6];
                    weight = Double.parseDouble(arguments[7]);
                    lasting_duration = Integer.parseInt(arguments[8]);
                    Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                            expiration_date, weight, organic, lasting_duration);
                    break;
                case ("SKINCARE"):
                    price = Double.parseDouble(arguments[2]);
                    manufacturer = arguments[3];
                    brand = arguments[4];
                    expiration_date = arguments[6];
                    weight = Double.parseDouble(arguments[7]);
                    organic = Boolean.parseBoolean(arguments[5]);
                    baby_sensitive = Boolean.parseBoolean(arguments[8]);
                    Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                            expiration_date, weight, organic, baby_sensitive);
                    break;
                case ("DESKTOP"):
                    price = Double.parseDouble(arguments[2]);
                    manufacturer = arguments[3];
                    brand = arguments[4];
                    maximum_allowed_input_voltage = Double.parseDouble(arguments[5]);
                    maximum_power_consumption = Double.parseDouble(arguments[6]);
                    operating_system = arguments[7];
                    CPU_Type = arguments[8];
                    RAM_Capacity = Integer.parseInt(arguments[9]);
                    HDD_Capacity = Integer.parseInt(arguments[10]);
                    box_color = arguments[11];
                    Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                            maximum_allowed_input_voltage, maximum_power_consumption,
                            operating_system, CPU_Type, RAM_Capacity, HDD_Capacity, box_color);
                    break;
                case ("LAPTOP"):
                    price = Double.parseDouble(arguments[2]);
                    manufacturer = arguments[3];
                    brand = arguments[4];
                    maximum_allowed_input_voltage = Double.parseDouble(arguments[5]);
                    maximum_power_consumption = Double.parseDouble(arguments[6]);
                    operating_system = arguments[7];
                    CPU_Type = arguments[8];
                    RAM_Capacity = Integer.parseInt(arguments[9]);
                    HDD_Capacity = Integer.parseInt(arguments[10]);
                    HDMI_support = Boolean.parseBoolean(arguments[11]);
                    Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                            maximum_allowed_input_voltage, maximum_power_consumption,
                            operating_system, CPU_Type, RAM_Capacity, HDD_Capacity, HDMI_support);
                    break;
                case ("TABLET"):
                    price = Double.parseDouble(arguments[2]);
                    manufacturer = arguments[3];
                    brand = arguments[4];
                    maximum_allowed_input_voltage = Double.parseDouble(arguments[5]);
                    maximum_power_consumption = Double.parseDouble(arguments[6]);
                    operating_system = arguments[7];
                    CPU_Type = arguments[8];
                    RAM_Capacity = Integer.parseInt(arguments[9]);
                    HDD_Capacity = Integer.parseInt(arguments[10]);
                    Dimension = Integer.parseInt(arguments[11]);
                    Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                            maximum_allowed_input_voltage, maximum_power_consumption,
                            operating_system, CPU_Type, RAM_Capacity, HDD_Capacity, Dimension);
                    break;
                case ("SMARTPHONE"):
                    price = Double.parseDouble(arguments[2]);
                    manufacturer = arguments[3];
                    brand = arguments[4];
                    maximum_allowed_input_voltage = Double.parseDouble(arguments[5]);
                    maximum_power_consumption = Double.parseDouble(arguments[6]);
                    ScreanType = arguments[7];
                    Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                            maximum_allowed_input_voltage, maximum_power_consumption, ScreanType);
                    break;
                case ("TV"):
                    price = Double.parseDouble(arguments[2]);
                    manufacturer = arguments[3];
                    brand = arguments[4];
                    maximum_allowed_input_voltage = Double.parseDouble(arguments[5]);
                    maximum_power_consumption = Double.parseDouble(arguments[6]);
                    ScreanSize = Integer.parseInt(arguments[7]);
                    Technician.Add_item(Tech_name1, item_name, price, manufacturer, brand,
                            maximum_allowed_input_voltage, maximum_power_consumption, ScreanSize);
                    break;
                case ("BOOK"):
                    price = Double.parseDouble(arguments[2]);
                    realiseDate = arguments[3];
                    CoverTitle = arguments[4];
                    PuplisherName = arguments[5];
                    Authors_name[0] = arguments[6];
                    page_number = Integer.parseInt(arguments[7]);
                    Technician.Add_item(Tech_name1, item_name, price, realiseDate, CoverTitle,
                            PuplisherName, Authors_name, page_number);
                    break;
                case ("CDDVD"):
                    price = Double.parseDouble(arguments[2]);
                    realiseDate = arguments[3];
                    CoverTitle = arguments[4];
                    PuplisherName = arguments[5];
                    Song[0] = arguments[6];
                    Technician.Add_item(Tech_name1, item_name, price, realiseDate, CoverTitle,
                            PuplisherName, Song);
                    break;
            }
        }
        scanner.close();
    }
}