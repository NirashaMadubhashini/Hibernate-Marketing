package lk.ijse.hibernate.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity(name = "order")
public class Order {
    @Id
    private String orderId;


    @ManyToOne
    private Customer customer;

    private double cost;
    @CreationTimestamp
    private Date date;


    public Order(String orderId, Customer customer, double cost, Date date) {
        this.orderId = orderId;

        this.customer = customer;
        this.cost = cost;
        this.date = date;

    }

    public Order() {
    }

    public Order(String orderId, Item item, double cost, Date date) {
        this.orderId = orderId;
        this.cost = cost;
        this.date = date;

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }



    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
                '}';
    }


}
