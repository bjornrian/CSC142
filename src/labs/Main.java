package labs;

public class Main {

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("48375620192374568", "Champagne", 16432.00);
        Car myCar         = new Car("13291398531985312", "Blue", 32000.00, 4);
        Coupe myCoupe     = new Coupe("10935810351282124", "Red", 83123.00, 2);
        Truck myTruck     = new Truck("13291398531985312", "Blue", 32000.00,16000);

        System.out.println(myVehicle);
        System.out.println();
        System.out.println(myCar);
        System.out.println();
        System.out.println(myCoupe);
        System.out.println();
        System.out.println(myTruck);
    }

}

