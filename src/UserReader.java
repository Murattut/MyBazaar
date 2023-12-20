/*import Users.Admin;
import Users.Customers;
import Users.Technician;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserReader {

    public static void readUsers(String filename, ArrayList<Admin> admins, ArrayList<Technician> techs, ArrayList<Customers> customers) throws FileNotFoundException {
        File userFile = new File(filename);
        Scanner scanner = new Scanner(userFile);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] userInfo = line.split("\t"); // Split line by tabs

            String userType = userInfo[0];
            String name = userInfo[1];
            String email = userInfo[2];
            String birthDate = userInfo[3];
            double salary = Double.parseDouble(userInfo[4]);

            switch (userType) {
                case "ADMIN":
                    String password = userInfo[5];
                    admins.add(new Admin(name, email, birthDate, salary, password));
                    break;
                case "TECH":
                    boolean isSenior = Boolean.parseBoolean(userInfo[5]);
                    techs.add(new Technician(name, email, birthDate, salary, isSenior));
                    break;
                case "CUSTOMER":
                    double balance = Double.parseDouble(userInfo[5]);
                    password = userInfo[6];
                    customers.add(new Customers(name, email, birthDate, balance, password));
                    break;
                default:
                    System.out.println("Invalid user type: " + userType);
                    break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Replace with your actual file path
        String filename = "users.txt";

        ArrayList<Admin> admins = new ArrayList<>();
        ArrayList<Technician> techs = new ArrayList<>();
        ArrayList<Customers> customers = new ArrayList<>();

        readUsers(filename, admins, techs, customers);

        // Access your populated user lists here
        System.out.println("Admins:");
        for (Admin admin : admins) {
            System.out.println(admin);
        }

        System.out.println("Techs:");
        for (Technician tech : techs) {
            System.out.println(tech);
        }

        System.out.println("Customers:");
        for (Customers customer : customers) {
            System.out.println(customer);
        }
    }
}*/
