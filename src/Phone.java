public class Phone extends Device {
    Double resolution;

    public Phone(String producer, String model, Double value, Integer yearOfProduction) {
        super("Xiaomi","Redmi",1200.00,2021);
        this.resolution=resolution;
    }
    @Override
    public void recharge(Integer percentage) {
        System.out.println("Loading");
        System.out.println("Loading");
        System.out.println("Loading");
        System.out.println("Loading");
        System.out.println("Charged");
    }
    @Override
    public void turnOn() {
        System.out.println("The phone is on");
    }
    @Override
    public String toString() {
        return "Your phone " + this.producer + " " +
                this.model + " is from " +
                this.yearOfProduction + " year.";
    }
}