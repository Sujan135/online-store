package com.pluralsight;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Product> inventory;

    private static Cart cart = new Cart();
    private static UserInterface user = new UserInterface();

    public static void main(String[] args) {
        inventory = Inventory.loadProducts("src/main/resources/DataFiles/products.csv");

        boolean running = true;
        while (running) {
            int choice = user.showMainMenu();
            switch (choice) {
                case 1 -> showProducts();
                case 2 -> showCart();
                case 3 -> running = false;
                default -> System.out.println("Invalid option. Try again. ");
            }
        }
        System.out.println("Thanks for visiting!");
    }

    private static void showProducts() {
        boolean viewing = true;
        while (viewing) {
            user.displayProducts(inventory);
            int choice = user.showProductsMenu();
            switch (choice) {
                case 1 -> {
                    String search = user.forSearchTerm();
                    ArrayList<Product> results = searchProducts(search);
                    user.displayProducts(results);

                }
            }

        }
    }

    private static void showCart() {
        boolean viewing = true;
        while(viewing) {
            if (cart.isEmpty()) {
                System.out.println("Cart is empty:");
            }
        }
    }

    private static ArrayList<Product> searchProducts(String keyword) {
        ArrayList<Product> results = new ArrayList<>();
        for (Product product : inventory) {
            if (product.getName().equals(keyword) ||
                product.getDepartment().equals(keyword)||
                String.valueOf(product.getPrice()).equals(keyword)) {
                results.add(product);
            }
        }
        return results;
    }

}
