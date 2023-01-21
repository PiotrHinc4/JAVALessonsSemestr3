package rest;

import java.sql.SQLOutput;
import creatures.*;
import rest.*;

public abstract class Car extends Device implements Comparable<Car>,sellable{
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
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        if(!seller.hasACar(this)){
            //wyjątek
            throw new Exception("Sprzedawca nie ma samochodu");
        }
        if (!buyer.canHaveMoreCars()) {
            //wyjątek
            throw new Exception("Kupujący nie ma miejsca na auto");
        }
        if (buyer.hasLessMoneyThen(price)){
            //wyjątek
            throw new Exception("Kupujący nie ma dość pieniędzy");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        seller.addMoney(price);
        buyer.collectMoney(price);
        System.out.println("Transakcja powiodła się");
    }
        /*if (seller.autoOwner != null) {
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
    }*/
    abstract void refuel();

    @Override
    public int compareTo(Car otherCar) {
        return this.value.compareTo(otherCar.value);
    }
}
