package rest;

import creatures.Human;
import rest.Device;

public class Phone extends Device {
    Double resolution;

    public Phone(String producer, String model, Double value, Integer yearOfProduction) {
        super("Xiaomi","Redmi",1200.00,2021);
        this.resolution=resolution;
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
        System.out.println("The phone is on");
    }
    @Override
    public String toString() {
        return "Your phone " + this.producer + " " +
                this.model + " is from " +
                this.yearOfProduction + " year.";
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phoneOwner != null) {
            if (buyer.cash>price) {
                buyer.cash-=price;
                seller.cash+=price;
                buyer.phoneOwner=seller.phoneOwner;
                seller.phoneOwner=null;
                System.out.println(buyer.firstName + " " + buyer.lastName + " have a new phone");
            } else {
                System.out.println("Buyer don't have enought cash to buy the phone");
            }
        } else {
            System.out.println("Seller don't have a phone to sell");
        }
    }
}