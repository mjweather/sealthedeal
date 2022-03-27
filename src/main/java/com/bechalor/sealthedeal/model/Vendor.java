package com.bechalor.sealthedeal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String shopName;
    private String idPic;
    private String address;

    @OneToOne
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "vendor",cascade = CascadeType.ALL)
    private List<Ads> ads=new LinkedList<>();

    @OneToMany(mappedBy = "vendor",cascade = CascadeType.ALL)
    private List<Apartment> apartments=new LinkedList<>();

    @OneToMany(mappedBy = "vendor", cascade = CascadeType.ALL)
    private List<Message> ConsumerMessageList=new LinkedList<>();

    @OneToMany(mappedBy = "vendor",cascade = CascadeType.ALL)
    private Set<VendorHasFurniture> vendorHasFurnitures=new LinkedHashSet<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getIdPic() {
        return idPic;
    }

    public void setIdPic(String idPic) {
        this.idPic = idPic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Ads> getAds() {
        return ads;
    }

    public void setAds(List<Ads> ads) {
        this.ads = ads;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    public List<Message> getConsumerMessageList() {
        return ConsumerMessageList;
    }

    public void setConsumerMessageList(List<Message> consumerMessageList) {
        ConsumerMessageList = consumerMessageList;
    }

    public Set<VendorHasFurniture> getVendorHasFurnitures() {
        return vendorHasFurnitures;
    }

    public void setVendorHasFurnitures(Set<VendorHasFurniture> vendorHasFurnitures) {
        this.vendorHasFurnitures = vendorHasFurnitures;
    }
}
