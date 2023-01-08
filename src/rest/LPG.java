package rest;

public class LPG extends Car{
    public LPG(String producer, String model, Double value, Integer yearOfProduction, String color) {
        super(producer, model, value, yearOfProduction, color);
    }

    @Override
    public void refuel() {
        System.out.println("Your car use a LPG. Refuel the car at the station at the LPG dispenser");
    }
}
