package sonyaSoap;

public class CoconutOil extends Soap {

    public static final int BUBBLE_SIZE = 3;
    public static final int SOFTNESS = 4;
    public static final double PRICE = 1.49;

    public CoconutOil(int size, String shape, String fragrance, boolean exfoliating) {
        super(size, shape, fragrance, exfoliating, BUBBLE_SIZE, SOFTNESS, PRICE);
    }
}
