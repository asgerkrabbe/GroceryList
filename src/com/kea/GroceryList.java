package com.kea;

import java.util.ArrayList;

public class GroceryList {
    GroceryItem groceryItem = new GroceryItem();

    ArrayList<GroceryItem> itemArrayList = new ArrayList<>();


    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();
        Product product = new Product();
        groceryList.createList();

        for(GroceryItem var:groceryList.itemArrayList)

        System.out.println(groceryList.itemArrayList.get(0));

        groceryList.getTotalCost();
    }

    public void showProducts() {
    }

    public void createList() {
        GroceryItem groceryItem1 = new GroceryItem(3, new Product("Mælk", 10));
        GroceryItem groceryItem2 = new GroceryItem(1, new Product("Pasta", 7));
        GroceryItem groceryItem3 = new GroceryItem(2, new Product("Smør", 15));
        addItem(groceryItem1, itemArrayList);
        addItem(groceryItem2, itemArrayList);
        addItem(groceryItem3, itemArrayList);
    }

    public void addItem(GroceryItem groceryItem, ArrayList<GroceryItem> groceryItemOrder) {

    groceryItemOrder.add(groceryItem);

    }

    int totalCost = 0;
    public void getTotalCost() {
        for (int i = 0; i < itemArrayList.size(); i++) {
            totalCost += itemArrayList.get(i).getCost();

        }
        System.out.println(totalCost);
    }


}
