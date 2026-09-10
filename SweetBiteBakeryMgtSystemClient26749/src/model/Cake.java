package model;

import java.io.Serializable;



public class Cake implements Serializable {

    public static final long serialVersionUID = 1L;

    private int cakeId;

    private String cakeName;
    private String flavor;
    private String size;
    private double price;

    public Cake() {
    }

    public Cake(int cakeId, String cakeName, String flavor, String size, double price) {
        this.cakeId = cakeId;
        this.cakeName = cakeName;
        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }

    public int getCakeId() {
        return cakeId;
    }

    public void setCakeId(int cakeId) {
        this.cakeId = cakeId;
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}