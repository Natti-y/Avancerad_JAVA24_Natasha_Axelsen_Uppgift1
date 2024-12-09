package Uppgift1;

public abstract class Vehicle {
    private String model;
    private String regNumber;
    private double rentalPriceDay;

    public Vehicle(String model, String regNumber, double rentalPriceDay) {
        this.model = model;
        this.regNumber = regNumber;
        this.rentalPriceDay = rentalPriceDay;
    }

    public String getModel() {
        return model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public double getRentalPriceDay() {
        return rentalPriceDay;
    }

    public abstract String getVehicleType();
    public abstract void rentVehicle(int days);
    public abstract void returnVehicle();
    public abstract double calculateRentalCost(int days);
}
