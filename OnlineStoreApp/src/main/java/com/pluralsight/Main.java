package com.pluralsight;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Product> inventory;

    public static void main(String[] args) {
        inventory = Inventory.loadProducts("src/main/resources/DataFiles/products.csv");


    }
}
