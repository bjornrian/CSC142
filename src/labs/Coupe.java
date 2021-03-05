package labs;

public class Coupe extends Car{
    public String vin;
    public String color;
    public double cost;
    public int doorCount;
    public Coupe(String vin, String color, double cost, int doorCount) {
        super(vin, color, cost, doorCount);
        this.vin = vin;
        this.color = color;
        this.cost = cost;
        this.doorCount = doorCount;
    }

    @Override public int getDoorCount() {
        return super.getDoorCount() - 2;
    }

    @Override public String toString() {
        return "Coupe " + super.toString();
    }
}
