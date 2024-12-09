package Uppgift1;

// The Rentable interface defines the contract for renting and returning vehicles.
// Any class that implements this interface must provide implementations
// for the methods declared here.
public interface Rentable {
// Method to handle renting a vehicle.

    void rentVehicle(int days);

    //Method to handle returning a rented vehicle.

    void returnVehicle();


    //Method to calculate the rental cost based on the number of rental days.
    double calculateRentalCost(int days);
}
