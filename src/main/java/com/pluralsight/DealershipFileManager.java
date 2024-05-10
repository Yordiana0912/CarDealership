package com.pluralsight;

import java.io.*;

public class DealershipFileManager  {
        // read dealership data from file
        public static Dealership readDealershipFromFile(String filename ){
            Dealership dealership = null;
            try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
                String name = reader.readLine();
                if (name != null){
                    dealership= new Dealership(name.trim());
                    String line;
                    while ((line = reader.readLine()) != null);{
                        String[] parts = line.split("\\|");
                        if (parts.length == 4){
                            int vinNumber = Integer.parseInt(parts[0].trim());
                            int year = Integer.parseInt(parts[1].trim());
                            String maker = parts[2].trim();
                            String model = parts[3].trim();
                            String color= parts[4].trim();
                            double price = Double.parseDouble(parts[5].trim());
                            int odometer = Integer.parseInt(parts[6].trim());
                            Dealership.addVehicle(new Vehicle((vinNumber , year, maker, model, color, price, odometer));
                        }
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return dealership;
        }

    public static void writeToDealershipFile(Dealership dealership, String filename) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(dealership.getName());
            writer.newLine();
            for(Vehicle vehicle : dealership.getInventory()) {
                writer.write(vehicle.getVinNumber() + "|" + vehicle.getYear() + "|" + vehicle.getMaker() + "|" + vehicle.getModel() + "|" +
                        vehicle.getColor() + "|" + vehicle.getPrice() + "|" + vehicle.getOdometer());
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
