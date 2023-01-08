package creatures;

public class Pet extends Animal {
    public Pet(String specie) {
        super(specie);
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
