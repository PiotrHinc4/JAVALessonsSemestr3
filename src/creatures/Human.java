package creatures;

public class Human<Car> extends Animal{
    private static final String DEFAULT_DATE_OF_LAST_SALARY="10.10.2022";
    private static final Double DEFAULT_SALARY=1234.56;
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car autoOwner;
    public rest.Phone phoneOwner;
    private Double salary;
    public String dateSalary;
    public Double cash;

    public Human() {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary=salary;
        this.dateSalary=dateSalary;
        this.dateSalary=DEFAULT_DATE_OF_LAST_SALARY;
        this.salary=DEFAULT_SALARY;
        this.cash=cash;
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
    public void getCar(Car auto) {
        System.out.println(auto);
    }
    public void setCar(double value, Car auto) {
        if (this.salary>value) {
            System.out.println("You bought a car for cash. Nice job ;)");
            autoOwner=auto;
        } else if (this.salary>value/12) {
            System.out.println("A car was purchased, but a loan was also obtained");
            autoOwner=auto;
        } else {
            System.out.println("Enroll in college and get a new job or go for a raise");
        }
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
}
