package com.example.webProject.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id = 1l;

    @Column
    private int number;

    @Column
    private String name;

    @Column
    private int price;

    @Column
    private String amount;

    @Column
    private String picture;

    @Column
    private Date editionDate;

    @Column
    private Date expirationDate;

    public Item() {}

    public Item(int number, String name, int price, String amount, String picture, Date editionDate, Date expirationDate) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.picture = picture;
        this.editionDate = editionDate;
        this.expirationDate = expirationDate;
    }

    public Item(long id, int number, String name, int price, String amount, String picture, Date editionDate, Date expirationDate) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.picture = picture;
        this.editionDate = editionDate;
        this.expirationDate = expirationDate;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public int getNum() { return number; }

    public void setNum(int num) { this.number = num; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public String getAmount() { return amount; }

    public void setAmount(String amount) { this.amount = amount; }

    public String getPicture() { return picture; }

    public void setPicture(String picture) { this.picture = picture; }

    public Date getEditionDate() { return editionDate; }

    public void setEditionDate(Date editionDate) { this.editionDate = editionDate; }

    public Date getExpirationDate() { return expirationDate; }

    public void setExpirationDate(Date expirationDate) { this.expirationDate = expirationDate; }
}
