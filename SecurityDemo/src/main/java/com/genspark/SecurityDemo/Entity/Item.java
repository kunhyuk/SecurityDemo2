package com.genspark.SecurityDemo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_items")
public class Item {
    @Id
    @Column(name="p_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;
    private String itemName;
    private String itemType;

    private int price;

    public Item() {
    }

    public Item(int itemId, String itemName, String itemType, int price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemType = itemType;
        this.price = price;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}
