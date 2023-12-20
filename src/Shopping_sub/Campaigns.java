package Shopping_sub;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class Campaigns {
    public static LinkedList<Campaigns> campaign_list = new LinkedList<>();
    private LocalDate startDate;
    private LocalDate endDate;
    private String itemType;
    private Integer discount_rate;
    public Campaigns(String startDate, String endDate, String itemType, Integer discount_rate){
        this.startDate = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.endDate = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.itemType=itemType;
        this.discount_rate=discount_rate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Integer getDiscount_rate() {
        return discount_rate;
    }

    public void setDiscount_rate(Integer discount_rate) {
        this.discount_rate = discount_rate;
    }
}
