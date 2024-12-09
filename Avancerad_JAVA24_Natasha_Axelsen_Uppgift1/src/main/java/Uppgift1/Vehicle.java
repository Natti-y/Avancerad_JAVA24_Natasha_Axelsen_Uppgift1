package Uppgift1;

// Abstract base class Vehicle that represents common attributes and behaviors for all vehicles.
public abstract class Vehicle {
    // The model of the vehicle (e.g., "Toyota Corolla").
    private String model;

    // The registration number of the vehicle (e.g., "ABC123").
    private String regNumber;

    // The rental price per day for the vehicle.
    private double rentalPriceDay;

    // Constructor to initialize the vehicle with its model, registration number, and rental price per day.
    public Vehicle(String model, String regNumber, double rentalPriceDay) {
        this.model = model;
        this.regNumber = regNumber;
        this.rentalPriceDay = rentalPriceDay;
    }

    // Getter method to retrieve the vehicle's model.
    public String getModel() {
        return model;
    }

    // Getter method to retrieve the vehicle's registration number.
    public String getRegNumber() {
        return regNumber;
    }

    // Getter method to retrieve the vehicle's rental price per day.
    public double getRentalPriceDay() {
        return rentalPriceDay;
    }

    // Abstract method to get the type of the vehicle (e.g., "Car", "Truck").
    public abstract String getVehicleType();

    // Abstract method to handle renting the vehicle for a specified number of days.
    public abstract void rentVehicle(int days);

    // Abstract method to handle returning the vehicle after rental.
    public abstract void returnVehicle();

    // Abstract method to calculate the total rental cost based on the number of rental days.
    public abstract double calculateRentalCost(int days);
}
