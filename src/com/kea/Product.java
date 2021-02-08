package com.kea;

import java.util.ArrayList;

public class Product {
    ArrayList<Product> productArrayList = new ArrayList<>();

    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Product() {
        productLine();
    }

        public void productLine(){
            productArrayList.add(new Product("Toiletpapir", 13));
            productArrayList.add(new Product("Mælk", 10));
            productArrayList.add(new Product("Smør", 15));
            productArrayList.add(new Product("Pasta", 7));
            productArrayList.add(new Product("Brød", 17));
        }

    public String getName() {
        return name;
    }

}
