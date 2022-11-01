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

        /*Car porscheXXX = new Car("Porsche","XXX");
        porscheXXX.course=152000;
        porscheXXX.color="red";

        System.out.println(porscheXXX);*/
    }
}