package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name, address, phone;
    private List<Vehicle> inventory;
    private Object addVechile;

    public Dealership(String name) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
    }

    public String getName() {
        this.name= name ;
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public List<Vehicle> getInventory() {
        this.inventory = new ArrayList<>();
        System.out.println("Inventory of" + name + ":");
        return inventory;
    }

    public void displayInventory() {
    }

    public static void addVehicle(Vehicle vehicle) {
    Dealership dealership = new Dealership("Yordiana's Dealership");



    }
}
