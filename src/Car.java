import java.sql.SQLOutput;
import creatures.Human;

public class Car extends Device {
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
}
