package com.kea;

import java.util.ArrayList;

public class Product {
    ArrayList<Product> productArrayList = new ArrayList<>();

    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {}

    public int getPrice() {
        return price*quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }/*
    public ArrayList getProductList(ArrayList productArrayList){
        return productArrayList;
    }*/

    public void productLine() {
        productArrayList.add(new Product("Toiletpapir", 13, 0));
        productArrayList.add(new Product("Mælk", 10, 0));
        productArrayList.add(new Product("Smør", 15, 0));
        productArrayList.add(new Product("Pasta", 7, 0));
        productArrayList.add(new Product("Brød", 17, 0));
    }

}
