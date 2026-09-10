package model;

import java.io.Serializable;
import java.util.Set;



public class Baker implements Serializable {

    public static final long serialVersionUID = 1L;

   
    
    private int bakerId;

    private String fullName;
    private String phone;
    private String specialization;

   
                     
    private Set<CakeOrder> orders;

    public Baker() {
    }

    public Baker(int bakerId, String fullName, String phone, String specialization, Set<CakeOrder> orders) {
        this.bakerId = bakerId;
        this.fullName = fullName;
        this.phone = phone;
        this.specialization = specialization;
        this.orders = orders;
    }

    public int getBakerId() {
        return bakerId;
    }

    public void setBakerId(int bakerId) {
        this.bakerId = bakerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Set<CakeOrder> getOrders() {
        return orders;
    }

    public void setOrders(Set<CakeOrder> orders) {
        this.orders = orders;
    }
}