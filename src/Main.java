import creatures.Animal;

public class Main {
    public static void main(String[] args) {
        Human person = new Human();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        //Human toString

        Animal cat = new Animal("felis");
        person.pet = cat;
        cat.name = "Mruczek";
        //Animal toString

        cat.feed();
        for(int index=3;index>=0;index--) {
            cat.takeForAWalk();
        }

        System.out.println("\n");
        Car auto1 = new Car("Volkswagen","Passat",5000.00,1992,"black");
        System.out.println("\nFirst car: ");
        person.getCar(auto1);

        Car auto2 = new Car("Ferrari","Y",2000000.00,2020,"red");
        System.out.println("\nSecond car: ");
        person.getCar(auto2);

        System.out.println("\n");
        person.getSalary();
        person.setSalary(5230.12,"10.11.2022");

        System.out.println("\n");
        //
        person.setCar(auto1.value,auto1);
        auto1.recharge(1);
    }
}