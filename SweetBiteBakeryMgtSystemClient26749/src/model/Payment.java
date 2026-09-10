package model;

import java.io.Serializable;
import java.util.Date;



public class Payment implements Serializable {

    public static final long serialVersionUID = 1L;

 
    private int paymentId;

    private double amount;

  
    private Date paymentDate;

    private String paymentMethod;

    
    private CakeOrder order;

    public Payment() {
    }

    public Payment(int paymentId, double amount, Date paymentDate, String paymentMethod, CakeOrder order) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.order = order;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public CakeOrder getOrder() {
        return order;
    }

    public void setOrder(CakeOrder order) {
        this.order = order;
    }
}