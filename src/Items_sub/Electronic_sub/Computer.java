package Items_sub.Electronic_sub;
import Items_sub.Electronic;

public class Computer extends Electronic {
    private String operating_system;
    private String CPU_Type;
    private int RAM_Capacity;
    private int HDD_Capacity;

    public Computer(double price, String manufacturer, String brand,
                    double maximum_allowed_input_voltage, double maximum_power_consumption,
                    String operating_system, String CPU_Type, int RAM_Capacity, int HDD_Capacity) {
        super(price, manufacturer, brand, maximum_allowed_input_voltage, maximum_power_consumption);
        this.operating_system = operating_system;
        this.CPU_Type = CPU_Type;
        this.RAM_Capacity = RAM_Capacity;
        this.HDD_Capacity = HDD_Capacity;
    }
    public String getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }

    public String getCPU_Type() {
        return CPU_Type;
    }

    public void setCPU_Type(String CPU_Type) {
        this.CPU_Type = CPU_Type;
    }

    public int getRAM_Capacity() {
        return RAM_Capacity;
    }

    public void setRAM_Capacity(int RAM_Capacity) {
        this.RAM_Capacity = RAM_Capacity;
    }

    public int getHDD_Capacity() {
        return HDD_Capacity;
    }

    public void setHDD_Capacity(int HDD_Capacity) {
        this.HDD_Capacity = HDD_Capacity;
    }

    //This fucnton is used to display the data of the computer but it is not used in the program
    /*public void displayData() {
        System.out.println("Price: " + getPrice());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Brand: " + getBrand());
        System.out.println("Maximum Allowed Input Voltage: " + getMaximum_allowed_input_voltage());
        System.out.println("Maximum Power Consumption: " + getMaximum_power_consumption());
        System.out.println("Operating_system: " + getOperating_system());
        System.out.println("CPU_Type: "+ getCPU_Type());
        System.out.println("RAM_Capacity: "+ getRAM_Capacity());
        System.out.println("HDD_Capacity: " + getHDD_Capacity());
    }*/
}
