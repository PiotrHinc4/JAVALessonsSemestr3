package creatures;

import java.sql.SQLOutput;

public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 12.3;
    private static final Double DEFAULT_CAT_WEIGHT = 3.2;
    private static final Double DEFAULT_BEAR_WEIGHT = 480.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public final String specie;
    public String name;
    public Boolean isAlive;
    private Double weight;

    public Animal(String specie){
        this.specie = specie;
        this.weight = weight;

        switch (this.specie) {
            case "canis":
                this.weight=DEFAULT_DOG_WEIGHT;
                break;
            case "felis":
                this.weight=DEFAULT_CAT_WEIGHT;
                break;
            case "ursus":
                this.weight=DEFAULT_BEAR_WEIGHT;
                break;
            default:
                this.weight=DEFAULT_ANIMAL_WEIGHT;
        }
        if (this.weight<=0) {
            this.isAlive = false;
        } else {
            this.isAlive = true;
        }
    }


    public void feed(){
        if (this.isAlive == true){
            this.weight += 0.5;
            System.out.println(this.name + " thanks for food. He weighs " + this.weight + "kg now");
        } else {
            System.out.println("Are you sick? I call to the police!!!");
        }
    }

    public void takeForAWalk(){
        this.weight-=1;
        if (this.weight<=0) {
            this.isAlive = false;
        }
        if (this.isAlive == true) {
            System.out.println("Nice walk. He weighs " + this.weight + "kg now");
        } else {
            System.out.println("What are you doing?! He is dead!!!");
        }
    }
    public String toString() {
        return "This is my pet " + name + ". He like you";
    }

}
