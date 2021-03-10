package sonyaSoap;

/**
 * Sonya’s offers several types of soaps, one of the main types being Coconut Oil soap.
 */
public class CoconutOil extends Soap {

    private static final int BUBBLE_SIZE = 3;
    private static final int SOFTNESS = 4;
    private static final double PRICE = 1.49;

    public CoconutOil(int size, String shape, String fragrance, boolean exfoliating) {
        super(size, shape, fragrance, exfoliating, BUBBLE_SIZE, SOFTNESS, PRICE);
    }
}
