package com.bechalor.sealthedeal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;


@Entity
public class House_assistant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double price;
    private String type;
    private double rating;
    private String address;

    @OneToOne
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "house_assistant",cascade = CascadeType.ALL)
    private List<HouseAssistantHasConsumer> houseAssistantHasConsumer=new LinkedList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
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

    public List<HouseAssistantHasConsumer> getHouseAssistantHasConsumer() {
        return houseAssistantHasConsumer;
    }

    public void setHouseAssistantHasConsumer(List<HouseAssistantHasConsumer> houseAssistantHasConsumer) {
        this.houseAssistantHasConsumer = houseAssistantHasConsumer;
    }
}
