public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 12.3;
    private static final Double DEFAULT_CAT_WEIGHT = 3.2;
    private static final Double DEFAULT_BEAR_WEIGHT = 480.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    final String specie;
    String name;
    Boolean isAlive;
    Double weight;

    Animal(String specie){
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


    void feed(){
        if (this.isAlive == true){
            this.weight += 0.5;
            System.out.println("dzięki za żarcie");
        } else {
            System.out.println("Wszystko dobrze? Dobrze się czujesz?");
        }
    }

    void takeForAWalk(){
        if (this.isAlive == true) {
            this.weight -= 0.5;
            System.out.println("Fajny spacer");
            if (this.weight<=0) {
                this.isAlive = false;
            }
        } else {
            System.out.println("Dzwonię na policję!");
        }
    }
}
