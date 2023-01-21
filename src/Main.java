import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import rest.Car;
import rest.Diesel;
import rest.Electric;
import rest.LPG;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("1st Person:");
        Human person1 = new Human();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.cash=3451.78;
        System.out.println(person1);

        System.out.println("\n2nd Person:");
        Human person2 = new Human();
        person2.firstName = "Julia";
        person2.lastName = "Nowak";
        person2.cash=123.45;
        System.out.println(person2);

        System.out.println("\nCat:");
        Pet cat = new Pet("felis");
        person1.pet = cat;
        cat.name = "Mruczek";
        System.out.println(cat);

        cat.feed();
        for(int index=3;index>=0;index--) {
            cat.takeForAWalk();
        }

        System.out.println("\nDog:");
        Pet dog = new Pet("canis");
        person2.pet = dog;
        dog.name = "Ciapek";
        System.out.println(dog);

        dog.feed(1.5);
        dog.feed(1.5);

        System.out.println("\n1st car:");
        Diesel auto1 = new Diesel("Volkswagen","Passat",5000.00,1992,"black");
        person1.getCar(auto1);
        auto1.turnOn();
        auto1.refuel();

        System.out.println("\n2nd car:");
        Electric auto2 = new Electric("Ferrari","Y",2000000.00,2020,"red");
        System.out.println(auto2);
        auto2.turnOn();
        auto2.refuel();

        System.out.println("\nPhone:");
        rest.Phone phone = new rest.Phone("Xiaomi","Redmi",1200.00,2020);
        person2.phoneOwner=phone;
        System.out.println(phone);
        phone.turnOn();

        System.out.println("\n");
        System.out.println(person1.getSalary());
        person1.setSalary(5230.12,"10.11.2022");

        System.out.println("\n");
        person1.setCar(auto1.value,auto1);
        auto1.recharge(1);

        System.out.println("\nTrades:");
        cat.sell(person1,person2,150.00);
        cat.sell(person1,person2,100.00);
        person2.cash+=5000.00;
        auto1.sell(person2,person1,5000.00);
        auto1.sell(person1,person2,5000.00);
        phone.sell(person2,person1,1000.00);


        System.out.println("\n\nApp installation:");
        List<String> appList=new ArrayList<>();
        appList.add("Messenger");
        appList.add("Whatsapp");
        phone.installAnApp("Bank","1.0","https://www.microsoft.com/pl-pl/store/apps/");
        phone.installAnApp("Snapchat","5.2");
        phone.installAnApp("Snake");
        phone.installAnApp(appList);

        System.out.println("Task 1 from presentation:");
        int[] tab1 = new int[10];
        for(int i=0;i<10;i++){
            tab1[i]=i+101;
        }
        for(int i=0;i<10;i++){
            System.out.println(tab1[i]);
        }

        System.out.println("\nTask 2 from presentation:");
        int[] tab2 = new int[10];
        for(int i=0;i<10;i++) {
            tab2[i] = (i+1)*10;
        }

        for(int i=0;i<10;i++){
            System.out.println(tab2[i]);
        }

        System.out.println("\nTask 3 from presentation:");
        boolean[] tab3 = new boolean[20];
        for(int i=0;i<20;i++){
            if(i%2==0) {
                tab3[i]=true;
            } else {
                tab3[i]=false;
            }
        }

        for (int i=0;i<20;i++){
            System.out.println(tab3[i]);
        }

        System.out.println("\nTask 4 from presentation:");
        int[] tab4 = new int[100];
        for(int i=0;i<100;i++){
            tab4[i]=i%10;
        }

        for(int i=0;i<100;i++){
            System.out.println(tab4[i]);
        }
    }
}