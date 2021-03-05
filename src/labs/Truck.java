package labs;

public class Truck extends Car{
    public String vin;
    public String color;
    public double cost;
    public double towingCapacity;

    public Truck(String vin, String color, double cost, double towingCapacity) {
        super(vin, color, cost, (int) towingCapacity);
        this.vin = vin;
        this.color = color;
        this.cost = cost;
        this.towingCapacity = towingCapacity;
    }

    @Override public double calcPrice() {
        return super.cost * 1.15;
    }

    public String toString() {
        return "Truck: " + super.toString() + String.format("Price: %s, Towing Capacity: %s", calcPrice(), towingCapacity);

    }}
