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
import java.util.Objects;

public class Employee extends Person {
    private Double salary;

    public Employee(String name, String email, String date_of_birth, Double salary) {
        super(name, email, date_of_birth);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void Show_item(String admin_Tech_name) {
        boolean is_admin_tech_true = true;
        for (Admin admin : Admin.Admin_list) {
            if (Objects.equals(admin.getName(), admin_Tech_name)) {
                for (Hair_care hair_care : Hair_care.hair_CareLinkedList)
                    hair_care.displayData();
                for (Perfume perfume : Perfume.perfumeLinkedList)
                    perfume.displayData();
                for (Skin_care skinCare : Skin_care.skin_careLinkedList)
                    skinCare.displayData();
                for (Desktop desktop : Desktop.desktopLinkedList)
                    desktop.displayData();
                for (Laptop laptop : Laptop.laptopLinkedList)
                    laptop.displayData();
                for (Tablet tablet : Tablet.tabletLinkedList)
                    tablet.displayData();
                for (Smart_phone smartPhone : Smart_phone.smart_phoneLinkedList)
                    smartPhone.displayData();
                for (Tv tv : Tv.TvLinkedList)
                    tv.displayData();
                for (Book book : Book.bookLinkedList)
                    book.displayData();
                for (Cd_Dvd cdDv : Cd_Dvd.cd_dvdLinkedList)
                    cdDv.displayData();
                is_admin_tech_true = false;
                break;
            }
            for (Technician tech : Technician.Technician_list) {
                if (Objects.equals(tech.getName(), admin_Tech_name)) {
                    for (Hair_care hair_care : Hair_care.hair_CareLinkedList)
                        hair_care.displayData();
                    for (Perfume perfume : Perfume.perfumeLinkedList)
                        perfume.displayData();
                    for (Skin_care skinCare : Skin_care.skin_careLinkedList)
                        skinCare.displayData();
                    for (Desktop desktop : Desktop.desktopLinkedList)
                        desktop.displayData();
                    for (Laptop laptop : Laptop.laptopLinkedList)
                        laptop.displayData();
                    for (Tablet tablet : Tablet.tabletLinkedList)
                        tablet.displayData();
                    for (Smart_phone smartPhone : Smart_phone.smart_phoneLinkedList)
                        smartPhone.displayData();
                    for (Tv tv : Tv.TvLinkedList)
                        tv.displayData();
                    for (Book book : Book.bookLinkedList)
                        book.displayData();
                    for (Cd_Dvd cdDv : Cd_Dvd.cd_dvdLinkedList)
                        cdDv.displayData();
                    is_admin_tech_true = false;
                    break;
                }
            }
        }
        if (is_admin_tech_true) {
            System.out.printf("No tech person named " + admin_Tech_name + " exists!\n");
        }
    }

    public static void Disp_item_soft(String admin_Tech_name, String[] Array_name) {
        boolean is_admin_tech_true = true;
        //String[] stringsWithoutColon = removeColon(Array_name);
        String[][] splitItems = splitAndRemoveColon(Array_name);
        for (Admin admin : Admin.Admin_list) {
            if (Objects.equals(admin.getName(), admin_Tech_name)) {
                for (String[] itemParts : splitItems) {
                    for (String part : itemParts) {
                        switch (part) {
                            case "HAIRCARE":
                                for (Hair_care hair_care : Hair_care.hair_CareLinkedList)
                                    hair_care.displayData();
                                break;
                            case "PERFUME":
                                for (Perfume perfume : Perfume.perfumeLinkedList)
                                    perfume.displayData();
                                break;
                            case "SKINCARE":
                                for (Skin_care skinCare : Skin_care.skin_careLinkedList)
                                    skinCare.displayData();
                                break;
                            case "DESKTOP":
                                for (Desktop desktop : Desktop.desktopLinkedList)
                                    desktop.displayData();
                                break;
                            case "LAPTOP":
                                for (Laptop laptop : Laptop.laptopLinkedList)
                                    laptop.displayData();
                                break;
                            case "TABLET":
                                for (Tablet tablet : Tablet.tabletLinkedList)
                                    tablet.displayData();
                                break;
                            case "SMARTPHONE":
                                for (Smart_phone smartPhone : Smart_phone.smart_phoneLinkedList)
                                    smartPhone.displayData();
                                break;
                            case "TV":
                                for (Tv tv : Tv.TvLinkedList)
                                    tv.displayData();
                                break;
                            case "BOOK":
                                for (Book book : Book.bookLinkedList)
                                    book.displayData();
                                break;
                            case "CDDVD":
                                for (Cd_Dvd cdDv : Cd_Dvd.cd_dvdLinkedList)
                                    cdDv.displayData();
                                break;
                            default:
                                System.out.print("\nsomething go wrong admin employ line 142\n");
                                break;
                        }
                    }
                }
            }
            is_admin_tech_true = false;
        }
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), admin_Tech_name)) {
                for (String[] itemParts : splitItems) {
                    for (String part : itemParts) {
                        switch (part) {
                            case "HAIRCARE":
                                for (Hair_care hair_care : Hair_care.hair_CareLinkedList)
                                    hair_care.displayData();
                                break;
                            case "PERFUME":
                                for (Perfume perfume : Perfume.perfumeLinkedList)
                                    perfume.displayData();
                                break;
                            case "SKINCARE":
                                for (Skin_care skinCare : Skin_care.skin_careLinkedList)
                                    skinCare.displayData();
                                break;
                            case "DESKTOP":
                                for (Desktop desktop : Desktop.desktopLinkedList)
                                    desktop.displayData();
                                break;
                            case "LAPTOP":
                                for (Laptop laptop : Laptop.laptopLinkedList)
                                    laptop.displayData();
                                break;
                            case "TABLET":
                                for (Tablet tablet : Tablet.tabletLinkedList)
                                    tablet.displayData();
                                break;
                            case "SMARTPHONE":
                                for (Smart_phone smartPhone : Smart_phone.smart_phoneLinkedList)
                                    smartPhone.displayData();
                                break;
                            case "TV":
                                for (Tv tv : Tv.TvLinkedList)
                                    tv.displayData();
                                break;
                            case "BOOK":
                                for (Book book : Book.bookLinkedList)
                                    book.displayData();
                                break;
                            case "CDDVD":
                                for (Cd_Dvd cdDv : Cd_Dvd.cd_dvdLinkedList)
                                    cdDv.displayData();
                                break;
                            default:
                                System.out.print("something go wrong admin employ line 197\n");
                                break;
                        }
                    }
                }
            }
            is_admin_tech_true = false;
        }
        if (is_admin_tech_true) {
            System.out.printf("No tech person named " + admin_Tech_name + " exists!\n");
        }
    }

    public static void Show_item_low_on_stock(String admin_Tech_name, Integer stock) {
        boolean is_admin_tech_true = true;
        for (Admin admin : Admin.Admin_list) {
            if (Objects.equals(admin.getName(), admin_Tech_name)) {
                if (Hair_care.hair_CareLinkedList.size() <= stock)
                    System.out.printf("\nHaircare: " + Hair_care.hair_CareLinkedList.size());
                if (Perfume.perfumeLinkedList.size() <= stock)
                    System.out.printf("\nPerfume: " + Perfume.perfumeLinkedList.size());
                if (Skin_care.skin_careLinkedList.size() <= stock)
                    System.out.printf("\nSkinCare: " + Skin_care.skin_careLinkedList.size());
                if (Desktop.desktopLinkedList.size() <= stock)
                    System.out.printf("\nDesktop: " + Desktop.desktopLinkedList.size());
                if (Laptop.laptopLinkedList.size() <= stock)
                    System.out.printf("\nLaptop: " + Laptop.laptopLinkedList.size());
                if (Tablet.tabletLinkedList.size() <= stock)
                    System.out.printf("\nTablet: " + Tablet.tabletLinkedList.size());
                if (Smart_phone.smart_phoneLinkedList.size() <= stock)
                    System.out.printf("\nSmartPhone: " + Smart_phone.smart_phoneLinkedList.size());
                if (Tv.TvLinkedList.size() <= stock)
                    System.out.printf("\nTv: " + Tv.TvLinkedList.size());
                if (Book.bookLinkedList.size() <= stock)
                    System.out.printf("\nBook:" + Book.bookLinkedList.size());
                if (Cd_Dvd.cd_dvdLinkedList.size() <= stock)
                    System.out.printf("\nCdDv:" + Cd_Dvd.cd_dvdLinkedList.size()+"\n");

                is_admin_tech_true = false;
                break;
            }

        }
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), admin_Tech_name)) {
                if (Hair_care.hair_CareLinkedList.size() <= stock)
                    System.out.printf("\nHaircare: " + Hair_care.hair_CareLinkedList.size());
                if (Perfume.perfumeLinkedList.size() <= stock)
                    System.out.printf("\nPerfume: " + Perfume.perfumeLinkedList.size());
                if (Skin_care.skin_careLinkedList.size() <= stock)
                    System.out.printf("\nSkinCare: " + Skin_care.skin_careLinkedList.size());
                if (Desktop.desktopLinkedList.size() <= stock)
                    System.out.printf("\nDesktop: " + Desktop.desktopLinkedList.size());
                if (Laptop.laptopLinkedList.size() <= stock)
                    System.out.printf("\nLaptop: " + Laptop.laptopLinkedList.size());
                if (Tablet.tabletLinkedList.size() <= stock)
                    System.out.printf("\nTablet: " + Tablet.tabletLinkedList.size());
                if (Smart_phone.smart_phoneLinkedList.size() <= stock)
                    System.out.printf("\nSmartPhone: " + Smart_phone.smart_phoneLinkedList.size());
                if (Tv.TvLinkedList.size() <= stock)
                    System.out.printf("\nTv: " + Tv.TvLinkedList.size());
                if (Book.bookLinkedList.size() <= stock)
                    System.out.printf("\nBook:" + Book.bookLinkedList.size());
                if (Cd_Dvd.cd_dvdLinkedList.size() <= stock)
                    System.out.printf("\nCdDv:" + Cd_Dvd.cd_dvdLinkedList.size()+"\n");
                is_admin_tech_true = false;
                break;
            }
        }
        if (is_admin_tech_true) {
            System.out.printf("No admin person named " + admin_Tech_name + " exists!\n");
        }
    }

    public static void Show_item_low_on_stock(String admin_Tech_name) {
        Integer stock = 100000; //System ignore bigger then 100.000 stock for ram safety
        boolean is_admin_tech_true = true;
        for (Admin admin : Admin.Admin_list) {
            if (Objects.equals(admin.getName(), admin_Tech_name)) {
                if (Hair_care.hair_CareLinkedList.size() <= stock)
                    System.out.printf("\nHaircare: " + Hair_care.hair_CareLinkedList.size());
                if (Perfume.perfumeLinkedList.size() <= stock)
                    System.out.printf("\nPerfume: " + Perfume.perfumeLinkedList.size());
                if (Skin_care.skin_careLinkedList.size() <= stock)
                    System.out.printf("\nSkinCare: " + Skin_care.skin_careLinkedList.size());
                if (Desktop.desktopLinkedList.size() <= stock)
                    System.out.printf("\nDesktop: " + Desktop.desktopLinkedList.size());
                if (Laptop.laptopLinkedList.size() <= stock)
                    System.out.printf("\nLaptop: " + Laptop.laptopLinkedList.size());
                if (Tablet.tabletLinkedList.size() <= stock)
                    System.out.printf("\nTablet: " + Tablet.tabletLinkedList.size());
                if (Smart_phone.smart_phoneLinkedList.size() <= stock)
                    System.out.printf("\nSmartPhone: " + Smart_phone.smart_phoneLinkedList.size());
                if (Tv.TvLinkedList.size() <= stock)
                    System.out.printf("\nTv: " + Tv.TvLinkedList.size());
                if (Book.bookLinkedList.size() <= stock)
                    System.out.printf("\nBook:" + Book.bookLinkedList.size());
                if (Cd_Dvd.cd_dvdLinkedList.size() <= stock)
                    System.out.printf("\nCdDv:" + Cd_Dvd.cd_dvdLinkedList.size()+"\n");
                is_admin_tech_true = false;
                break;
            }
        }
        for (Technician tech : Technician.Technician_list) {
            if (Objects.equals(tech.getName(), admin_Tech_name)) {
                //System.out.print("admin accessed");
                for (Hair_care hair_care : Hair_care.hair_CareLinkedList)
                    if (hair_care.getStock() <= stock)
                        System.out.printf("hair cair: " + hair_care.getStock());
                for (Perfume perfume : Perfume.perfumeLinkedList)
                    if (perfume.getStock() <= stock)
                        System.out.printf("perfume: " + perfume.getStock());
                for (Skin_care skinCare : Skin_care.skin_careLinkedList)
                    if (skinCare.getStock() <= stock)
                        System.out.printf("skinCare: " + skinCare.getStock());
                for (Desktop desktop : Desktop.desktopLinkedList)
                    if (desktop.getStock() <= stock)
                        System.out.printf("desktop: " + desktop.getStock());
                for (Laptop laptop : Laptop.laptopLinkedList)
                    if (laptop.getStock() <= stock)
                        System.out.printf("laptop: " + laptop.getStock());
                for (Tablet tablet : Tablet.tabletLinkedList)
                    if (tablet.getStock() <= stock)
                        System.out.printf("tablet: " + tablet.getStock());
                for (Smart_phone smartPhone : Smart_phone.smart_phoneLinkedList)
                    if (smartPhone.getStock() <= stock)
                        System.out.printf("smartPhone: " + smartPhone.getStock());
                for (Tv tv : Tv.TvLinkedList)
                    if (tv.getStock() <= stock)
                        System.out.printf("Tv: " + tv.getStock());
                for (Book book : Book.bookLinkedList)
                    if (book.getStock() <= stock)
                        System.out.printf("book:" + book.getStock());
                for (Cd_Dvd cdDv : Cd_Dvd.cd_dvdLinkedList)
                    if (cdDv.getStock() <= stock)
                        System.out.printf("cdDv:" + cdDv.getStock()+"\n");
                is_admin_tech_true = false;
                break;
            }
        }
        if (is_admin_tech_true) {
            System.out.printf("No admin person named " + admin_Tech_name + " exists!\n");
        }
    }

    public static void show_vip(String admin_Tech_name) {
        boolean is_admin_tech_true = true;
        for (Admin admin : Admin.Admin_list) {
            if (Objects.equals(admin.getName(), admin_Tech_name)) {
                for (Customers customer : Customers.customer_list)
                    if (Objects.equals(customer.getStatus(), "GOLDEN"))
                        customer.displayPersonalData();
                is_admin_tech_true = false;
                break;
            }
            for (Technician tech : Technician.Technician_list) {
                if (Objects.equals(tech.getName(), admin_Tech_name)) {
                    for (Customers customer : Customers.customer_list)
                        if (Objects.equals(customer.getStatus(), "GOLDEN"))
                            customer.displayPersonalData();
                    is_admin_tech_true = false;
                    break;
                }
            }
        }
        if (is_admin_tech_true) {
            System.out.printf("No admin person named " + admin_Tech_name + " exists!\n");
        }
    }

    //some string have : at the end of them so we need to remove them
    public static String[][] splitAndRemoveColon(String[] items) {
        String[][] splitItems = new String[items.length][];
        for (int i = 0; i < items.length; i++) {
            String[] parts = items[i].split(":");
            parts[parts.length - 1] = parts[parts.length - 1].trim(); // Remove trailing colon and spaces
            splitItems[i] = parts;
        }
        return splitItems;
    }
}
