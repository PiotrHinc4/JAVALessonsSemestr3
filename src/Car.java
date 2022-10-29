public class Car {
    final String producer;
    final String model;
    Integer course;
    String color;

    Car(String producer, String model){
        this.producer = producer;
        this.model = model;
        this.course = course;
        this.color = color;
    }
    public String toString() {
        return "Producer: " + this.producer + "\nModel: " + this.model;
    }
}
