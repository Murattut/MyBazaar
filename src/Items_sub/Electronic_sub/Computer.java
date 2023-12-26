package Items_sub.Electronic_sub;
import Items_sub.Electronic;

public class Computer extends Electronic {
    private String operating_system;
    private String CPU_Type;
    private Integer RAM_Capacity;
    private Integer HDD_Capacity;

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

    public Integer getRAM_Capacity() {
        return RAM_Capacity;
    }

    public void setRAM_Capacity(int RAM_Capacity) {
        this.RAM_Capacity = RAM_Capacity;
    }

    public Integer getHDD_Capacity() {
        return HDD_Capacity;
    }

    public void setHDD_Capacity(int HDD_Capacity) {
        this.HDD_Capacity = HDD_Capacity;
    }
}
