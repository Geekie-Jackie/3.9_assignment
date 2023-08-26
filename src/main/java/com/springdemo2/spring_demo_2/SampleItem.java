package com.springdemo2.spring_demo_2;

import org.springframework.stereotype.Component;

// Part 8: Dependency Injection through annotations
@Component // tells Spring Boot that this class is a component that can be injected into other classes.
public class SampleItem {

    private int id;
    private String name;
    private double price;
    private String desc;

    // Add your getters and setters

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
