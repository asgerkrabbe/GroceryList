package com.kea;

public class GroceryItem {
    int quantity;
    Product product;

    public GroceryItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;

//test
    }

    public GroceryItem() {
        GroceryItem groceryItem1 = new GroceryItem(1, new Product("Mælk", 10));
    }

    public int getCost() {
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return "product name: " + product.getName() +
                "\nquantity: " + quantity +
                "\nprice: " + product.getPrice();
    }
}
