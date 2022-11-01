public class Main {
    public static void main(String[] args) {
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

        System.out.println("\nTask #2");
        Car auto = new Car("Volkswagen","Passat");
        auto.course=152000;
        auto.color="red";
        person.autoOwner=auto;

        System.out.println(person.autoOwner);
    }
}