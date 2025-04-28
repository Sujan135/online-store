package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);


    public void showMainMenu() {
        while(true) {
            System.out.println("\nWelcome to the Online Store");
            System.out.println("1. Display Products");
            System.out.println("2. Display cart");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }

        }
    }

}
