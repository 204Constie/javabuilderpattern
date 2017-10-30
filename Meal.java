package com.company;

/**
 * Created by constie on 30.10.2017.
 */
class Meal {
    private String name;
    private String description;
    private int price;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
