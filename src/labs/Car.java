package labs;

public class Car extends Vehicle{
    public String vin;
    public String color;
    public double cost;
    public int doorCount;

    public Car(String vin, String color, double cost, int doorCount) {
        super(vin, color, cost);
        this.vin = vin;
        this.color = color;
        this.cost = cost;
        this.doorCount = doorCount;
    }

    public int getDoorCount(){
        return this.doorCount;
    }

    public double calcPrice() {
        return super.cost * 1.1;
    }

    public String toString() {
        return "Car: " + super.toString() + String.format("\nPrice: %s, Door Count: %s", this.calcPrice(), this.doorCount);
    }
}
