package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Inventory {
        public static ArrayList<Product> loadProducts(String filename) {
        ArrayList<Product> inventory = new ArrayList<>();

        try {
            String filePath = "src/main/resources/DataFiles/products.csv";
            FileReader fileReader = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while((line = reader.readLine()) !=null) {
                String[] parts = line.split("\\|");
                String sku = parts[0];
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                String department = parts[3];
                Product product = new Product(sku, name, price, department);
                inventory.add(product);

            }

        }catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
        return inventory;

    }

}
