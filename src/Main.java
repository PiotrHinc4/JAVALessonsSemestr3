public class Main {
    public static void main(String[] args) {
        //Task #1
        System.out.println("Task #1");
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

        //Task #2
        System.out.println("\nTask #2");
        Car auto = new Car("Volkswagen","Passat");
        auto.course=152000;
        auto.color="red";
        person.autoOwner=auto;

        System.out.println(person.autoOwner);

        //Tasks #3-4
        System.out.println("\nTasks #3-4");
        person.getter();
        person.setter(523.12,"10.11.2022");
    }
}