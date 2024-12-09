package Uppgift1;

public class Car extends Vehicle implements Rentable    {
    private boolean isElectric;

    public Car(String model, String registrationNumber, double rentalPricePerDay, boolean isElectric) {
        super(model, registrationNumber, rentalPricePerDay);
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }

    @Override
    public void rentVehicle(int days) {
        System.out.println(getModel() + " (Registration: " + getRegNumber() + ") rented for " + days + " days.");
    }

    @Override
    public void returnVehicle() {
        System.out.println(getModel() + " (Registration: " + getRegNumber() + ") returned.");
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalPriceDay() * days;
    }
}
