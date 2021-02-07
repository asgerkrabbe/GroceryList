package com.kea;

import java.util.ArrayList;

public class GroceryList {
    ArrayList<Product> basket = new ArrayList<>();


    public static void main(String[] args) {
        GroceryItem groceryItem = new GroceryItem();
        GroceryList groceryList = new GroceryList();
        Product product = new Product();
        product.productLine();
        groceryList.showProducts();
    }


    public void showProducts(){
        Product product = new Product();

        for (int i = 0; i < product.productArrayList.size(); i++) {
            System.out.println(product.productArrayList.get(i));
        }
    }


    public void add(ArrayList basket) {
    basket.add(basket);
    }

    public void getTotalCost() {

    }

}
