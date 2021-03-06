package lk.ijse.hibernate.entity;

import javafx.scene.control.Button;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

@Entity(name = "item")
public class Item {
    @Id
    private String itemCode;
    private String description;
    private String packSize;
    private int qtyOnHand;
    private double unitPrice;
    @Transient
    private Button update;
    @Transient
    private Button delete;

//    @OneToMany(mappedBy = "item",fetch = FetchType.EAGER)
//    private List<Order> orderList = new ArrayList<>();

    public Item() {
    }

    public Item(String itemCode, String description, String packSize, int qtyOnHand, double unitPrice, Button update,
                Button delete, List<Order> orderList) {
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
        this.update = update;
        this.delete = delete;
//        this.orderList = orderList;
    }

    public Item(String itemCode, String description, String packSize, int qtyOnHand, double unitPrice) {
        this.setItemCode(itemCode);
        this.setDescription(description);
        this.setPackSize(packSize);
        this.setQtyOnHand(qtyOnHand);
        this.setUnitPrice(unitPrice);
    }
//
//    public List<Order> getOrderList() {
//        return orderList;
//    }
//
//    public void setOrderList(List<Order> orderList) {
//        this.orderList = orderList;
//    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Button getUpdate() {
        return update;
    }

    public void setUpdate(Button update) {
        this.update = update;
    }

    public Button getDelete() {
        return delete;
    }

    public void setDelete(Button delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        return "ItemTm{" +
                "itemCode='" + itemCode + '\'' +
                ", description='" + description + '\'' +
                ", packSize='" + packSize + '\'' +
                ", qtyOnHand=" + qtyOnHand +
                ", unitPrice=" + unitPrice +
                ", update=" + update +
                ", delete=" + delete +
                '}';
    }
}
