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
    /*public static Items ID_founder(Integer Item_Id){
        for(Hair_care Temp : Hair_care.hair_CareLinkedList){
            if (Objects.equals(Temp.getId(), Item_Id)){
                return Temp;
            }

        }
        for(Perfume Temp : Perfume.perfumeLinkedList){
            if (Objects.equals(Temp.getId(), Item_Id)){
                return Temp;
            }

        }
        for(Skin_care Temp : Skin_care.skin_careLinkedList){
            if (Objects.equals(Temp.getId(), Item_Id)){
                return Temp;
            }

        }
        for(Desktop Temp : Desktop.desktopLinkedList){
            if (Objects.equals(Temp.getId(), Item_Id)){
                return Temp;
            }

        }
        for(Laptop Temp : Laptop.laptopLinkedList){
            if (Objects.equals(Temp.getId(), Item_Id)){
                return Temp;
            }

        }
        for(Tablet Temp : Tablet.tabletLinkedList){
            if (Objects.equals(Temp.getId(), Item_Id)){
                return Temp;
            }

        }
        for(Smart_phone Temp : Smart_phone.smart_phoneLinkedList){
            if (Objects.equals(Temp.getId(), Item_Id)){
                return Temp;
            }

        }
        for(Tv Temp : Tv.TvLinkedList){
            if (Objects.equals(Temp.getId(), Item_Id)){
                return Temp;
            }

        }
        for(Book Temp : Book.bookLinkedList){
            if (Objects.equals(Temp.getId(), Item_Id)){
                return Temp;
            }

        }
        for(Cd_Dvd Temp : Cd_Dvd.cd_dvdLinkedList){
            if (Objects.equals(Temp.getId(), Item_Id)){
                return Temp;
            }
        }return null;
    }*/
}
