package com.pluralsight;

import static com.pluralsight.DealershipFileManager.readDealershipFromFile;

public class Program {
    public static void main(String[] args) {
            // Test reading from file
            Dealership dealership = readDealershipFromFile("inventory.csv");
            if (dealership != null) {
                System.out.println("Successfully read dealership from file:");
                dealership.displayInventory();
            } else {
                System.out.println("Failed to read dealership from file.");
            }
    }
}
