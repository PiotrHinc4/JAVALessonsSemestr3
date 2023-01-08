package rest;

public class Diesel extends Car{
    public Diesel(String producer, String model, Double value, Integer yearOfProduction, String color) {
        super(producer, model, value, yearOfProduction, color);
    }

    @Override
    public void refuel() {
        System.out.println("Your car use a diesel. Refuel the car at the station at the diesel dispenser");
    }
}
