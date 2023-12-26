package Items_sub;
public class Items {
    private static int nextId = 1;
    private Integer Id;
    private Double price;
    public Items(Double price){
        this.price = price;
        this.Id =nextId++;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
