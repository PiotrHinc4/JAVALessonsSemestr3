package rest;
import creatures.Human;

public interface sellable {
    public void sell(Human seller, Human buyer, Double price);
}
