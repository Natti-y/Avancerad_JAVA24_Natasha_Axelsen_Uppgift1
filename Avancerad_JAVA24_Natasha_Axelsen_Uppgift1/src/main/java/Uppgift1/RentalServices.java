package Uppgift1;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalServices {
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static ArrayList<Vehicle> rentedVehicles = new ArrayList<>();

    public static void main(String[] args) {
        initializeVehicles();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Vehicle Rental Service ---");
            System.out.println("1. View available vehicles");
            System.out.println("2. Rent a vehicle");
            System.out.println("3. Return a vehicle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> viewVehicles();
                case 2 -> rentVehicle(scanner);
                case 3 -> returnVehicle(scanner);
                case 4 -> {
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }

    private static void initializeVehicles() {
        vehicles.add(new Car("Toyota Corolla", "ABC123", 300, false));
        vehicles.add(new Car("Range Rover", "DEF456", 500, true));
        vehicles.add(new Car("Volvo Truck", "GHI789", 700, false));
        vehicles.add(new Car("Mazda MX-5", "JKL012", 400, false));
    }

    private static void viewVehicles() {
        System.out.println("\nAvailable Vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleType() + ": " + vehicle.getModel() + " - " + vehicle.getRegNumber() +
                    " (Rental price per day: $" + vehicle.getRentalPriceDay() + ")");
        }
    }

    private static void rentVehicle(Scanner scanner) {
        System.out.println("\nEnter the registration number of the vehicle you want to rent: ");
        String regNumber = scanner.next();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getRegNumber().equalsIgnoreCase(regNumber)) {
                System.out.print("Enter the number of days you want to rent the vehicle: ");
                int days = scanner.nextInt();
                double cost = vehicle.calculateRentalCost(days);
                vehicle.rentVehicle(days);
                System.out.println("Total cost: $" + cost);

                rentedVehicles.add(vehicle);
                vehicles.remove(vehicle);
                return;
            }
        }
        System.out.println("Vehicle with registration number " + regNumber + " not found.");
    }

    private static void returnVehicle(Scanner scanner) {
        System.out.println("\nEnter the registration number of the vehicle you want to return: ");
        String regNumber = scanner.next();

        for (Vehicle vehicle : rentedVehicles) {
            if (vehicle.getRegNumber().equalsIgnoreCase(regNumber)) {
                vehicle.returnVehicle();
                vehicles.add(vehicle);
                rentedVehicles.remove(vehicle);
                return;
            }
        }
        System.out.println("Vehicle with registration number " + regNumber + " not found in rented vehicles.");
    }
}
