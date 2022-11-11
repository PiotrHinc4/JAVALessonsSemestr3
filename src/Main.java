public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("felis");
        cat.name = "Mruczek";

        Human person = new Human();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pet = cat;
        System.out.println("This is my pet "+ person.pet.name+". He like you");

        cat.feed();
        for(int index=3;index>=0;index--) {
            cat.takeForAWalk();
        }

        System.out.println("\n");
        Car auto = new Car("Volkswagen","Passat");
        auto.course=152000;
        auto.color="red";
        auto.value=5000.0;

        System.out.println("\n");
        person.getSalary();
        person.setSalary(5230.12,"10.11.2022");

        System.out.println("\n");
        person.getCar(auto);
        person.setCar(auto.value,auto);
    }
}