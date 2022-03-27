package com.bechalor.sealthedeal.model;

import javax.persistence.*;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Furniture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String address;
    private double price;
    private int quantity;
    private Date date;
    private String description;
    private String product_name;


    @OneToMany(mappedBy = "furniture",cascade = CascadeType.ALL)
    private Set<VendorHasFurniture> furnituresHasVendor=new LinkedHashSet<>();

    @OneToMany(mappedBy = "furniture",cascade = CascadeType.ALL)
    private Set<ConsumerHasFurniture> furnituresHasConsumer=new LinkedHashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Set<VendorHasFurniture> getFurnituresHasVendor() {
        return furnituresHasVendor;
    }

    public void setFurnituresHasVendor(Set<VendorHasFurniture> furnituresHasVendor) {
        this.furnituresHasVendor = furnituresHasVendor;
    }

    public Set<ConsumerHasFurniture> getFurnituresHasConsumer() {
        return furnituresHasConsumer;
    }

    public void setFurnituresHasConsumer(Set<ConsumerHasFurniture> furnituresHasConsumer) {
        this.furnituresHasConsumer = furnituresHasConsumer;
    }
}
