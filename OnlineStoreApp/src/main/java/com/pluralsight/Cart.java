package com.pluralsight;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cartItems = new ArrayList<>();

    public void addProduct(Product product) {
        cartItems.add(product);
        System.out.println(product.getName() + "added to cart.");
    }

    public void removeProduct(String sku) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getSku().equalsIgnoreCase(sku)) {
                cartItems.remove(i);
                System.out.println("Product with SKU "+ sku + "removed from the cart.");
                break;
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : cartItems) {
            total += product.getPrice();
        }
        return total;
    }

    public ArrayList<Product> getCartItems() {
        return cartItems;
    }

    public boolean isEmpty() {
        return cartItems.isEmpty();
    }

}
