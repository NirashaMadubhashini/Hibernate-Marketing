package lk.ijse.hibernate.entity;


import javafx.scene.control.Button;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

@Entity(name = "customer")
public class Customer {
    @Id
    private String customerId;
    private String title;
    private String name;
    private String address;
    private String city;
    private String postalCode;
    private String province;
    @Transient
    private Button update;
    @Transient
    private Button delete;


//    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
//    private List<Order> orderList = new ArrayList<>();


    public Customer() {
    }

    public Customer(String customerId, String title, String name, String address, String city, String postalCode,
                    String province, Button update, Button delete, List<Order> orderList) {
        this.customerId = customerId;
        this.title = title;
        this.name = name;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
        this.update = update;
        this.delete = delete;
//        this.orderList = orderList;
    }

    public Customer(String customerId, String title, String name, String address, String city, String postalCode, String province) {
        this.setCustomerId(customerId);
        this.setTitle(title);
        this.setName(name);
        this.setAddress(address);
        this.setCity(city);
        this.setPostalCode(postalCode);
        this.setProvince(province);
    }

//    public List<Order> getOrderList() {
//        return orderList;
//    }
//
//    public void setOrderList(List<Order> orderList) {
//        this.orderList = orderList;
//    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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
        return "CustomerTM{" +
                "customerId='" + customerId + '\'' +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", province='" + province + '\'' +
                ", update=" + update +
                ", delete=" + delete +
                '}';
    }
}
