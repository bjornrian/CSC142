package sonyaSoap;

public class Glycerin extends Soap {

    private static final int BUBBLE_SIZE = 2;
    private static final int SOFTNESS = 3;
    private static final double PRICE = 1.29;

    public Glycerin(int size, Shape shape, Fragrance fragrance) {
        super(size, shape, fragrance, false, BUBBLE_SIZE, SOFTNESS, PRICE);
    }
}
