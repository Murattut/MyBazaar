package Users;
import Shopping_sub.Campaigns;
import java.util.LinkedList;
import java.util.Objects;
public class Admin extends Employee{
    public static LinkedList<Admin> Admin_list = new LinkedList<>();
    private String password;
    public Admin(String name, String email, String date_of_birth, Double salary, String password) {
        super(name, email, date_of_birth, salary);
        this.password =password;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void displayPersonalData() {
        System.out.println("\nAdmin Name: " + getName());
        System.out.println("Admin Email: " + getEmail());
        System.out.println("Admin Date of Birth: " + getDate_of_birth());
    }
    public static void add_new_customar(String admin_name, String customer_name, String customer_email,
                                 String date_of_birth, Double customer_balance,String customer_password){
        boolean is_admin_true = true;
        for(Admin admin : Admin_list){
            if(Objects.equals(admin.getName(), admin_name)){
                Customers new_customer = new Customers(customer_name,customer_email,date_of_birth,customer_password,
                        customer_balance);
                Customers.customer_list.add(new_customer);
                is_admin_true = false;
                break;
            }
        }if(is_admin_true){
            System.out.printf("No admin person named "+ admin_name +" exists!\n");
        }
    }
    public static void Show_Customer(String admin_name, int CustomerId){
        boolean is_admin_true = true;
        for(Admin admin : Admin_list){
            if(Objects.equals(admin.getName(), admin_name)){
                for (Customers customer : Customers.customer_list){
                    if(customer.getCustomerId() == CustomerId){
                        customer.displayPersonalData();
                    }
                }is_admin_true = false;
            }
        }if(is_admin_true){
            System.out.printf("No admin person named "+ admin_name +" exists!\n");
        }
    }
    public static void Show_Customers(String admin_name){
        boolean is_admin_true = true;
        for(Admin admin : Admin_list){
            if(Objects.equals(admin.getName(), admin_name)){
                //System.out.print("admin accessed");
                for (Customers customer : Customers.customer_list){
                    customer.displayPersonalData();
                }is_admin_true = false;
            }
        }if(is_admin_true){
            System.out.printf("No admin person named "+ admin_name +" exists!\n");
        }
    }
    public static void Show_Admin_Info(String admin_name){
        boolean is_admin_true = true;
        for(Admin admin : Admin_list){
            if(Objects.equals(admin.getName(), admin_name)){
                admin.displayPersonalData();
                is_admin_true = false;
            }
        }if(is_admin_true){
            System.out.printf("No admin person named "+ admin_name +" exists!\n");
        }
    }
    public static void Create_campaign(String admin_name,String start_date, String end_date, String Item_type, Integer rate){
        boolean is_admin_true = true;
        for(Admin admin : Admin_list){
            if(Objects.equals(admin.getName(), admin_name)){
                if(rate <=50){
                    Campaigns campaign = new Campaigns(start_date,end_date,Item_type,rate);
                    Campaigns.campaign_list.add(campaign);
                }else{
                    System.out.print("Campaign was not created. Discount rate exceeds maximum rate of 50%.\n");
                }
            }is_admin_true = false;
        }if(is_admin_true){
            System.out.printf("No admin person named "+ admin_name +" exists!\n");
        }
    }
    public static void Add_Admin(String admin_name, String new_admin_name, String new_admin_email,
                          String new_admin_date_of_birth, Double new_admin_salary, String new_admin_password){
        boolean is_admin_true = true;
        for(Admin admin : Admin_list){
            if(Objects.equals(admin.getName(), admin_name)){
                Admin new_admin = new Admin(new_admin_name,new_admin_email,
                            new_admin_date_of_birth,new_admin_salary,new_admin_password);
                Admin_list.addLast(new_admin);
                is_admin_true = false;
                break;
            }
        }if(is_admin_true){
            System.out.printf("No admin person named "+ admin_name +" exists!\n");
        }
    }
    public static void Add_Tech(String admin_name, String new_Tech_name, String new_Tech_email,
                          String new_Tech_date_of_birth, Double new_Tech_salary, Boolean new_Tech_IsSenior){
        boolean is_admin_true = true;
        for(Admin admin : Admin_list){
            if(Objects.equals(admin.getName(), admin_name)){
                Technician new_tech = new Technician(new_Tech_name, new_Tech_email,
                        new_Tech_date_of_birth, new_Tech_salary,new_Tech_IsSenior);
                Technician.Technician_list.add(new_tech);
                is_admin_true = false;
                break;
            }
        }if(is_admin_true){
            System.out.printf("No admin person named "+ admin_name +" exists!\n");
        }
    }
}
