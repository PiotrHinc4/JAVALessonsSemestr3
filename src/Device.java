public abstract class Device {
    static final Double DEFAULT_VALUE = 5000.00;
    String producer;
    //final (?)
    String model;
    //final (?)
    public Double value;
    public Integer yearOfProduction;

    public Device(String producer, String model, Double value, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.value = value;
        this.yearOfProduction = yearOfProduction;
    }
    public abstract void recharge(Integer percentage);
}