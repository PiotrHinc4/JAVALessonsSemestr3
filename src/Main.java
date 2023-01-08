import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import rest.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("1st Person:");
        Human person1 = new Human();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.cash=3451.78;
        System.out.println(person1);

        System.out.println("\n2nd Person:");
        Human person2 = new Human();
        person2.firstName = "Julia";
        person2.lastName = "Nowak";
        person2.cash=123.45;
        System.out.println(person2);

        System.out.println("\nCat:");
        Pet cat = new Pet("felis");
        person1.pet = cat;
        cat.name = "Mruczek";
        System.out.println(cat);

        cat.feed();
        for(int index=3;index>=0;index--) {
            cat.takeForAWalk();
        }

        System.out.println("\nDog:");
        Pet dog = new Pet("canis");
        person2.pet = dog;
        dog.name = "Ciapek";
        System.out.println(dog);

        dog.feed(1.5);
        dog.feed(1.5);

        System.out.println("\n1st car:");
        Car auto1 = new Car("Volkswagen","Passat",5000.00,1992,"black");
        person1.getCar(auto1);
        auto1.turnOn();

        System.out.println("\n2nd car:");
        Car auto2 = new Car("Ferrari","Y",2000000.00,2020,"red");
        System.out.println(auto2);
        auto2.turnOn();

        System.out.println("\nPhone:");
        rest.Phone phone = new rest.Phone("Xiaomi","Redmi",1200.00,2020);
        person2.phoneOwner=phone;
        System.out.println(phone);
        phone.turnOn();

        System.out.println("\n");
        System.out.println(person1.getSalary());
        person1.setSalary(5230.12,"10.11.2022");

        System.out.println("\n");
        person1.setCar(auto1.value,auto1);
        auto1.recharge(1);

        System.out.println("\nTrades:");
        cat.sell(person1,person2,150.00);
        cat.sell(person1,person2,100.00);
        person2.cash+=5000.00;
        auto1.sell(person2,person1,5000.00);
        auto1.sell(person1,person2,5000.00);
        phone.sell(person2,person1,1000.00);
    }
}