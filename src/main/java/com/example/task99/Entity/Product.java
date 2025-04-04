package com.example.task99.Entity;

import lombok.Getter;
import lombok.Setter;

public class Product {
    private long id;
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private double price;


    public Product(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return (int) id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRetailer(Retailer retailer) {

    }
}
