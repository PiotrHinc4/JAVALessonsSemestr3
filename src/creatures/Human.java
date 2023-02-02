package creatures;
import rest.*;

import java.util.Arrays;
import java.util.Comparator;

public class Human extends Animal{
    private static final String DEFAULT_DATE_OF_LAST_SALARY="10.10.2022";
    private static final Double DEFAULT_SALARY=1234.56;
    private static final int DEFAULT_GARAGE_SIZE = 3;
    private static final String SPECIES_OF_HUMAN = "Homo sapiens";
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car[] garage;
    public Car car;
    public rest.Phone phoneOwner;
    private Double salary;
    public String dateSalary;
    public Double cash;

    public Human() {
        super(SPECIES_OF_HUMAN);
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary=salary;
        this.dateSalary=dateSalary;
        this.dateSalary=DEFAULT_DATE_OF_LAST_SALARY;
        this.salary=DEFAULT_SALARY;
        this.cash=cash;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }
    public Human(Integer garageSize){
        super(SPECIES_OF_HUMAN);
        salary=DEFAULT_SALARY;
        this.garage = new Car[garageSize];
    }
    public String getSalary() {
        return "Date of last salary: " + this.dateSalary + "\nYour salary: " + this.salary;
    }
    public void setSalary(Double salary, String dateSalary) {
        if(salary>0) {
            this.dateSalary=dateSalary;
            this.salary=salary;
            System.out.println("Data in the accounting system has been changed");
            System.out.println("Please collect the annex to the contract from Mrs. Hanna from the HR department");
            System.out.println("ZUS and US know about your the salarys change. There is no point in hiding it ;)");
            System.out.println("Your new salary: " + salary);
        } else {
            System.out.println("Salary must be greater than 0");
        }
    }
    public Car getCar(Car auto,Integer parkingLotNumber) {
        //walidacja
        return this.garage[parkingLotNumber];
    }
    public void setCar(double value, Car auto, Integer parkingLotNumber) {
        if (this.salary>value) {if (car.value < this.salary)
        {
            System.out.println("Successful purchase , payment method: cash");
            if (parkingLotNumber >= garage.length)
            {
                System.out.println("sorry, ale mam za mały garaż");
            }
            else if (parkingLotNumber < 0) System.out.println("Ogarnij się");
            else if (this.garage[parkingLotNumber] != null) System.out.println("sorry, miejsce zajęte");
            else this.garage[parkingLotNumber] = car;
        }
        else if (this.salary > car.value / 12)
        {
            System.out.println("Successful purchase, payment method: credit");
            if (parkingLotNumber >= garage.length)
            {
                System.out.println("sorry, ale mam za mały garaż");
            }
            else if (parkingLotNumber < 0) System.out.println("Ogarnij się");
            else if (this.garage[parkingLotNumber] != null) System.out.println("sorry, miejsce zajęte");
            else this.garage[parkingLotNumber] = car;
        } else {
            System.out.println("Do something with your life because you cant afford this car :(");
        }
        }
    }
    public Double getValueOfAllCars() {
        //sumowanie wartości wszystkich samochodów w pętli
        return null;
    }
    public void sortCarsByValue(){
        CarByValueComparator comparator = new CarByValueComparator();
        Arrays.sort(this.garage,comparator);
    }
    public void beEaten() throws Exception{
        throw new Exception("This is imposible");
    }
    public String toString(){
        return "My name is " + firstName + " " + lastName + ". Nice to meet you";
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

    public boolean hasACar(Car car) {
        boolean hasACar=false;
        for(int i=0;i<this.garage.length;i++){
            if(car.equals(this.garage[i])){
                hasACar=true;
            }
        }
        return hasACar;
    }

    public boolean canHaveMoreCars() {
        int sum=0;
        for(int i=0;i<this.garage.length;i++){
            if(car.equals(this.garage[i])){
                sum++;
            }
        }
        if (sum<DEFAULT_GARAGE_SIZE){
            return true;
        } else {
            return false;
        }
    }

    public boolean hasLessMoneyThen(Double price) {
        if (price<cash) {
            return true;
        } else {
            return false;
        }
    }

    public void removeCar(Car car) {
        boolean carRemovedFromGarage = false;
        for(int i=0;i<=DEFAULT_GARAGE_SIZE;i++){
            if (carRemovedFromGarage==false) {
                if (this.garage[i] == car) {
                    this.garage[i] = null;
                    carRemovedFromGarage=true;
                }
            }
        }
    }

    public void addCar(Car car) {
        boolean carAddedToGarage = false;
        for(int i=0;i<=DEFAULT_GARAGE_SIZE;i++){
            if (carAddedToGarage==false) {
                if (this.garage[i] != null) {
                    this.garage[i] = car;
                    carAddedToGarage=true;
                }
            }
        }
    }

    public void addMoney(Double price) {
        this.cash=+price;
    }

    public void collectMoney(Double price) {
        this.cash=-price;
    }
}
