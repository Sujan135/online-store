package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);


    public int showMainMenu() {
            System.out.println("\nWelcome to the Online Store");
            System.out.println("1. Display Products");
            System.out.println("2. Display cart");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            return scanner.nextInt();
    }

    public void displayProducts(ArrayList<Product> products) {
        System.out.println("\nProducts");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public String forSearchTerm() {
        System.out.println("Enter search item");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public String forSkuToAdd()  {
        System.out.println("Enter SKU to add to cart: ");
        return scanner.next();
    }

    public String forSkuToRemove() {
        System.out.println("Enter SKU to remove from cart");
        return scanner.next();
    }


    public int showProductsMenu() {
        System.out.println("\n1. Search Products");
        System.out.println("2. Add Product to Cart");
        System.out.println("3. Back to Home");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public int showCartMenu() {
        System.out.println("\n1. Remove Product from Cart");
        System.out.println("2. Checkout");
        System.out.println("3. Back to Home");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }





}
