package com.pluralsight;

public class Vehicle {
    private int vinNumber;
    private int year;
    private String maker, model, color ;
    private double price;
    private int odometer;

    public Vehicle(int vinNumber, int year, String maker, String model, String color, double price, int odometer) {
        this.vinNumber = vinNumber;
        this.year = year;
        this.maker = maker;
        this.model = model;
        this.color = color;
        this.price = price;
        this.odometer = odometer;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
