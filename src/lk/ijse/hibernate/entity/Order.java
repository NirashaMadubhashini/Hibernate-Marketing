package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "order")
public class Order {
    @Id
    private String orderId;


    @ManyToOne
    private Item item;

    @OneToOne
    private Customer customer;

    private double cost;
    private String date;
    private String time;

    public Order(String orderId, Item item, Customer customer, double cost, String date, String time) {
        this.orderId = orderId;
        this.item = item;
        this.customer = customer;
        this.cost = cost;
        this.date = date;
        this.time = time;
    }

    public Order() {
    }

    public Order(String orderId, Item item, double cost, String date, String time) {
        this.orderId = orderId;
        this.item = item;
        this.cost = cost;
        this.date = date;
        this.time = time;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", cost=" + cost +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }


}
