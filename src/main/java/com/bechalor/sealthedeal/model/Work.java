package com.bechalor.sealthedeal.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String type;
    private double amount;
    private String description;

    @OneToMany(mappedBy = "work",cascade = CascadeType.ALL)
    private List<WorkHasConsumer> workHasConsumers=new LinkedList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<WorkHasConsumer> getWorkHasConsumers() {
        return workHasConsumers;
    }

    public void setWorkHasConsumers(List<WorkHasConsumer> workHasConsumers) {
        this.workHasConsumers = workHasConsumers;
    }
}
