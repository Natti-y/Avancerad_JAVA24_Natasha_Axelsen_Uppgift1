package Uppgift1;

import java.util.ArrayList;
import java.util.Scanner;

// The RentalServices class manages the vehicle rental system, including viewing, renting, and returning vehicles. It also maintains a list of available and rented vehicles.
public class RentalServices {
    // List to store available vehicles
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();

    // List to store rented vehicles
    private static ArrayList<Vehicle> rentedVehicles = new ArrayList<>();

    // The main method serves as the entry point for the application
    public static void main(String[] args) {
        // Initialize the vehicle inventory
        initializeVehicles();
        Scanner scanner = new Scanner(System.in);

        // Main menu loop for user interaction
        while (true) {
            System.out.println("\n--- Vehicle Rental Service ---");
            System.out.println("1. View available vehicles");
            System.out.println("2. Rent a vehicle");
            System.out.println("3. Return a vehicle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Handle user menu selection using a switch statement
            switch (choice) {
                case 1 -> viewVehicles(); // Display available vehicles
                case 2 -> rentVehicle(scanner); // Rent a selected vehicle
                case 3 -> returnVehicle(scanner); // Return a rented vehicle
                case 4 -> { // Exit the program
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice, try again."); // Handle invalid input
            }
        }
    }

    // Method to initialize the inventory with predefined vehicles
    private static void initializeVehicles() {
        vehicles.add(new Car("Toyota Corolla", "ABC123", 300, false)); // Non-electric car
        vehicles.add(new Car("Range Rover", "DEF456", 500, true)); // Electric car
        vehicles.add(new Car("Volvo Truck", "GHI789", 700, false)); // Truck
        vehicles.add(new Car("Mazda MX-5", "JKL012", 400, false)); // Convertible car
    }

    // Method to view the list of available vehicles
    private static void viewVehicles() {
        System.out.println("\nAvailable Vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleType() + ": " + vehicle.getModel() + " - " + vehicle.getRegNumber() +
                    " (Rental price per day: $" + vehicle.getRentalPriceDay() + ")");
        }
    }

    // Method to rent a vehicle
    private static void rentVehicle(Scanner scanner) {
        System.out.println("\nEnter the registration number of the vehicle you want to rent: ");
        String regNumber = scanner.next();

        // Search for the vehicle by registration number in the list of available vehicles
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getRegNumber().equalsIgnoreCase(regNumber)) {
                System.out.print("Enter the number of days you want to rent the vehicle: ");
                int days = scanner.nextInt();
                double cost = vehicle.calculateRentalCost(days); // Calculate rental cost
                vehicle.rentVehicle(days); // Mark the vehicle as rented
                System.out.println("Total cost: $" + cost);

                // Move the vehicle from the available list to the rented list
                rentedVehicles.add(vehicle);
                vehicles.remove(vehicle);
                return;
            }
        }
        System.out.println("Vehicle with registration number " + regNumber + " not found.");
    }

    // Method to return a rented vehicle
    private static void returnVehicle(Scanner scanner) {
        System.out.println("\nEnter the registration number of the vehicle you want to return: ");
        String regNumber = scanner.next();

        // Search for the vehicle by registration number in the rented vehicles list
        for (Vehicle vehicle : rentedVehicles) {
            if (vehicle.getRegNumber().equalsIgnoreCase(regNumber)) {
                vehicle.returnVehicle(); // Mark the vehicle as returned
                vehicles.add(vehicle); // Move the vehicle back to the available list
                rentedVehicles.remove(vehicle); // Remove it from the rented list
                return;
            }
        }
        System.out.println("Vehicle with registration number " + regNumber + " not found in rented vehicles.");
    }
}
