package Uppgift1;

public interface Rentable {
    void rentVehicle(int days);
    void returnVehicle();
    double calculateRentalCost(int days);
}

