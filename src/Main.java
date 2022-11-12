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
        Car auto1 = new Car("Volkswagen","Passat");
        auto1.course=152000;
        auto1.color="black";
        auto1.value=5000.0;
        System.out.println("\nFirst car: ");
        person.getCar(auto1);

        Car auto2 = new Car("Volkswagen","Passat");
        auto2.course=15000;
        auto2.color="red";
        auto2.value=2000000.0;
        System.out.println("\nSecond car: ");
        person.getCar(auto2);

        System.out.println("\n");
        person.getSalary();
        person.setSalary(5230.12,"10.11.2022");

        System.out.println("\n");
        //
        //person.setCar(auto.value,auto);
    }
}