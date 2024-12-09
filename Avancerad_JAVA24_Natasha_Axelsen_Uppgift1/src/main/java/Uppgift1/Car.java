package Uppgift1;

// The Car class is a specific vehicle class that extends the abstract Vehicle class and implements the Rentable interface.
public class Car extends Vehicle implements Rentable {
    // Indicates whether the car is electric
    private boolean isElectric;

    // Constructor to initialize a car with its model, registration number, rental price per day, and whether it is electric.
    public Car(String model, String registrationNumber, double rentalPricePerDay, boolean isElectric) {
        super(model, registrationNumber, rentalPricePerDay); // Calls the superclass constructor
        this.isElectric = isElectric; // Sets whether the car is electric
    }

    // Getter to check if the car is electric
    public boolean isElectric() {
        return isElectric;
    }

    // Overrides the abstract method from the Vehicle class to specify the vehicle type
    @Override
    public String getVehicleType() {
        return "Car"; // Defines the vehicle type as "Car"
    }

    // Implementation of the rentVehicle method from the Rentable interface
    // Prints details about the rental duration
    @Override
    public void rentVehicle(int days) {
        System.out.println(getModel() + " (Registration: " + getRegNumber() + ") rented for " + days + " days.");
    }

    // Implementation of the returnVehicle method from the Rentable interface
    // Prints a message indicating the car has been returned
    @Override
    public void returnVehicle() {
        System.out.println(getModel() + " (Registration: " + getRegNumber() + ") returned.");
    }

    // Implementation of the calculateRentalCost method from the Rentable interface
    // Calculates the rental cost based on the rental price per day and number of days
    @Override
    public double calculateRentalCost(int days) {
        return getRentalPriceDay() * days; // Total rental cost
    }
}
