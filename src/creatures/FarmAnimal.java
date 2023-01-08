package creatures;

public class FarmAnimal extends Animal implements Edible{
    FarmAnimal(String specie) {
        super(specie);
    }

    @Override
    public void beEaten() throws Exception {
        this.isAlive = false;
        this.setWeight(0.0);
        System.out.println("I hope you've had your fill, MORDERER");
    }

    @Override
    public boolean isPoisoned() {
        return false;
    }

    @Override
    public Double getNutriscore() {
        return null;
    }

    @Override
    public void feed(double foodWeight) {
        if (this.isAlive == true) {
            setWeight(getWeight()+1.5);;
            System.out.println(this.name + " thanks for food. He weighs " + getWeight() + "kg now");
        } else {
            System.out.println("Are you sick? I call to the police!!!");
        }
    }
}
