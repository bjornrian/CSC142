package labs;

public class Vehicle {
    public String vin;
    public String color;
    public double cost;

    public Vehicle(String vin, String color, double cost) {
        this.vin = vin;
        this.color = color;
        this.cost = cost;
    }

    public String getVin() {
        return vin;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return String.format("Vin: %s, Color: %s, Cost: $%,.2f", vin, color, cost);
    }

}
