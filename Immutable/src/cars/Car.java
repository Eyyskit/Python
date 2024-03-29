package cars;

final class Car {

    // final so its value can't be changed.
    final private String owner;
    final private String reg;
    final private String make;
    final private int kilometres;
    final private double price;

    //geetter methods are removed and replaced by constructor so as theyy dont get changed by object
    public Car(String owner, String reg, String make, int kilometres, double price) {
        this.owner = owner;
        this.reg = reg;
        this.make = make;
        this.kilometres = kilometres;
        this.price = price;
    }

    public String owner() {
        return owner;
    }

    public String reg() {
        return reg;
    }

    public String make() {
        return make;
    }

    public int kilometres() {
        return kilometres;
    }

    public double price() {
        return price;
    }
}
