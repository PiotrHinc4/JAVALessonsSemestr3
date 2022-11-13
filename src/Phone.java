public class Phone extends Device {
    Double resolution;

    public Phone() {
        super("Xiaomi","Redmi",1200.00,2021);
        this.resolution=resolution;
    }
    public String toString() {
        return "Your phone " + this.producer + " " +
                this.model + " is from " +
                this.yearOfProduction + " year";
    }

    @Override
    public void recharge(Integer percentage) {
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("naładowane");
    }
    //All from this class (toString)
}