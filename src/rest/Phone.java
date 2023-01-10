package rest;
import creatures.Human;
import rest.Device;
import java.util.List;

public class Phone extends Device {
    private static final String DEFAULT_APPLICATION_SERVER = "https://play.google.com";
    private static final String DEFAULT_APPLICATION_VERSION = "last-stable";
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phoneOwner != null) {
            if (buyer.cash>price) {
                buyer.cash-=price;
                seller.cash+=price;
                buyer.phoneOwner=seller.phoneOwner;
                seller.phoneOwner=null;
                System.out.println(buyer.firstName + " " + buyer.lastName + " have a new phone");
            } else {
                System.out.println("Buyer don't have enought cash to buy the phone");
            }
        } else {
            System.out.println("Seller don't have a phone to sell");
        }
    }
    public void installAnApp(String appName,String appVersion,String appServer){
        System.out.println("Checking disk space. Parental control check. Checking payments");
        System.out.println("App download and installing");
        System.out.println("Installed " + appName + " (Version: " + appVersion + " Server: " + appServer+")\n");
    }
    public void installAnApp(String appName,String appVersion){
        installAnApp(appName,appVersion,DEFAULT_APPLICATION_SERVER);
    }
    public void installAnApp(String appName){
        installAnApp(appName,DEFAULT_APPLICATION_VERSION);
    }
    public void installAnApp(List<String> appNames) {
        for(String appName:appNames){
            this.installAnApp(appName);
        }
    }
}