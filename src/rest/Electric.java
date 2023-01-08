package rest;

public class Electric extends Car{
    public Electric(String producer, String model, Double value, Integer yearOfProduction, String color) {
        super(producer, model, value, yearOfProduction, color);
    }

    @Override
    public void refuel() {
        System.out.println("You have electric car. Drive to the charging station for electric cars and connect the car");
    }
}
