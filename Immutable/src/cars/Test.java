package cars;

public class Test {

    public static void main(String[] args) {


        Car car1 = new Car("Emmanuel", "131-D-24650", "Ford", 140, 45000);
        System.out.println("Owner of car: " + car1.owner());
        System.out.println("Registration number: " + car1.reg());
        System.out.println("Make: " + car1.make());
        System.out.println("Kilometres traveled: " + car1.kilometres());
        System.out.println("Price of car: $" + car1.price());


        Change(car1.owner(), car1.reg(), car1.make(), car1.kilometres(), car1.price());
        System.out.println("");
        System.out.println("After Changing details: ");
        System.out.println("");
        System.out.println("Owner of car: " + car1.owner());
        System.out.println("Registration number: " + car1.reg());
        System.out.println("Make: " + car1.make());
        System.out.println("Kilometres traveled: " + car1.kilometres());
        System.out.println("Price of car: $" + car1.price());

    }

    private static void Change(String owner, String reg, String make, int kilometres, double price) {
        owner = "Joseph";
        reg = "123-E-46346";
        make = "Range rover";
        kilometres = 500;
        price = 150000;
    }
}

