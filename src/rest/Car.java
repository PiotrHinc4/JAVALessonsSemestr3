package rest;

import java.sql.SQLOutput;
import creatures.Human;

public abstract class Car extends Device {
    String color;

    public Car(String producer, String model, Double value, Integer yearOfProduction, String color){
        super(producer,model,value,yearOfProduction);
        this.color = color;
    }

    @Override
    public void recharge(Integer percentage) {
        System.out.println("Loading");
        System.out.println("Loading");
        System.out.println("Loading");
        System.out.println("Loading");
        System.out.println("Charged");
    }

    @Override
    public void turnOn() {
        System.out.println("The car is on");
    }

    @Override
    public String toString() {
        return "Producer: " + producer +
                "\nModel: " + model +
                "\nColor: " + color +
                "\nValue: " + value;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.autoOwner != null) {
            if (buyer.cash>price) {
                buyer.cash-=price;
                seller.cash+=price;
                buyer.autoOwner=seller.autoOwner;
                seller.autoOwner=null;
                System.out.println(buyer.firstName + " " + buyer.lastName + " have a new car (and less money in the account)");
            } else {
                System.out.println("Buyer don't have enought cash to buy the car");
            }
        } else {
            System.out.println("Seller don't have a car to sell");
        }
    }
    abstract void refuel();
}
