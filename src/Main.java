import Users.Admin;
import Users.Customers;
import Users.Employee;
import Users.Technician;

public class Main {
    public static void main(String[] args) {
        String[]test_array ={"test array 1"};
        Admin test_admin = new Admin("murat", "dkdkdk@gmail.com",
                "07-03-2002",10.000,"test1234.");
        Admin.Admin_list.add(test_admin);

        test_admin.Add_Tech("murat","Ekin", "ekin@gmail.com",
                "05-04-2004",5.000,true);

        Customers test_customer = new Customers("Kerem", "kerem@yahoo.com",
                "21-02-1993", "kerem1111",10000.0);
        Customers.customer_list.add(test_customer);
        test_admin.Show_Customer("murat",1);
        System.out.print("\n\n");
        Technician.Add_item("Ekin","DESKTOP",1000.0,
                "test_manf","test_brand",
                100.0,1000.0,
                "windows,","intel",16,128,"black");
        System.out.print("\n\n");
        Technician.Add_item("Ekin","BOOK",2,"2016","EverythingWeKeep",
                "LakeUnio", "Kerry Lonsdale",306);
        Employee.Show_item("murat");
        System.out.print("\n\n");
        Customers.Add_to_cart(1,1);
        Employee.Show_item("murat");
        Customers.Order(1,"kerem1111");
        //Customers.Empty_cart(1);
        //Employee.Show_item("murat");
        System.out.print("\n\n");
        test_admin.Show_Customer("murat",1);

        /*
        test_admin.add_new_customar("murat","Barış", "barış@yahoo.com",
                "10-10-2003", 100.0,"barış1234");
        //creat sample customer

        String[] test_array2 = {"DESKTOP","BOOK"};
        Employee.Disp_item_soft("murat", test_array2);*/

        //fonksiyon testi
        /*

        test_admin.Show_Customers("murat");

        test_admin.Show_Admin_Info("murat");

        test_admin.Creat_campaign("murat","19-12-2023",
                "31-12-2023","computer",35);

        test_admin.Add_Admin("murat","Elif", "elif@gmail.com",
                "07-10-2004",5.000,"elif1234.");


        test_admin.Show_Admin_Info("Elif");*/
        //Employee.Show_item("murat");
        //Employee.show_vip("murat");
    }
}