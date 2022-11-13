public class Car extends Device{
    Integer course;
    String color;

    public Car(String producer, String model, Double value, Integer yearOfProduction, String color){
        super(producer,model,value,yearOfProduction);
        this.color = color;
    }
    public String toString() {
        return  "\nProducer: " + producer +
                "\nModel: " + model +
                "\nColor: " + color +
                "\nValue: " + value;
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
}
