package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;



public class CakeOrder implements Serializable {

    public static final long serialVersionUID = 1L;

    
    private int orderId;

    
    private Date orderDate;

    private int quantity;

    private double totalAmount;

    private Date deliveryDate;

    private String status;

    
    private Customer customer;

    
    
    private Set<Baker> bakers;

    public CakeOrder() {
    }

    public CakeOrder(int orderId, Date orderDate, int quantity, double totalAmount,
            Date deliveryDate, String status, Customer customer, Set<Baker> bakers) {

        this.orderId = orderId;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.customer = customer;
        this.bakers = bakers;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Baker> getBakers() {
        return bakers;
    }

    public void setBakers(Set<Baker> bakers) {
        this.bakers = bakers;
    }
}