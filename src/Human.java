public class Human {
    private static final String  DEFAULT_DATE_OF_LAST_SALARY="10.10.2022";
    private static final double  DEFAULT_SALARY=123.45;
    String firstName;
    String lastName;
    Animal pet;
    Car autoOwner;
    private Double salary;
    String dateSalary;

    Human() {
        this.salary=salary;
        this.dateSalary=dateSalary;
        this.dateSalary=DEFAULT_DATE_OF_LAST_SALARY;
        this.salary=DEFAULT_SALARY;
    }
    public void getter(){
        System.out.println("Date of last salary: " + this.dateSalary);
        System.out.println("Your salary: " + this.salary);
    }
    public void setter(Double salary, String dateSalary) {
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
}
