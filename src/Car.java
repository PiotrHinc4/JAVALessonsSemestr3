public class Car {
    static final Double DEFAULT_CAR_VALUE = 5000.00;
    final String producer;
    final String model;
    Integer course;
    String color;
    public Double value;

    Car(String producer, String model){
        this.producer = producer;
        this.model = model;
        this.course = course;
        this.color = color;
        this.value = value;
        this.value=DEFAULT_CAR_VALUE;
    }
    public String toString() {
        return "Vehicle technical data:" +
                "\nProducer: " + producer +
                "\nModel: " + model +
                "\nColor: " + color +
                "\nCourse: " + course +
                "\nValue: " + value;
    }
}
