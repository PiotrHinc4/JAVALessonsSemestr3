public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.name = "Szarik";

        Human me = new Human();
        me.firstName = "Piotr";
        me.pet = dog;
        System.out.println(me.pet.name);

        dog.feed();
        dog.takeForAWalk();

        Car porscheXXX = new Car("Porsche","XXX");
        porscheXXX.course=152000;
        porscheXXX.color="red";

        System.out.println(porscheXXX);
    }
}