package com.pluralsight;

public class Product {
    String sku;
    String name;
    double price;
    String department;

    public Product(String sku, String name, double price, String department) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.department = department;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDepartment() {
        return department;
    }

    public String toString(){

        return sku + " | " + name + " | " + price + " | " + department;
    }
}
