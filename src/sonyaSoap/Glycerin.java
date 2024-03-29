package sonyaSoap;

/**
 * Sonya’s offers several types of soaps, one of the main types being Glycerin soap.
 */
public class Glycerin extends Soap {

    private static final int BUBBLE_SIZE = 2;
    private static final int SOFTNESS = 3;
    private static final double PRICE = 1.29;
    private static final boolean EXFOLIATING = false;

    public Glycerin(int size, String shape, String fragrance) {
        super(size, shape, fragrance, EXFOLIATING, BUBBLE_SIZE, SOFTNESS, PRICE);
        verifySize(size);
        verifyFragrance(fragrance);
    }

    @Override
    public String getName() {
        return "Glycerin";
    }

    private void verifySize(int size) {
        if (size == Size.SMALL.getSize()) {
            throw new IllegalArgumentException("Error: Invalid size.");
        }
    }

    private void verifyFragrance(String fragrance) {
        if (fragrance.equals(Fragrance.OCEAN_BREEZE.getFragrance())) {
            throw new IllegalArgumentException("Error: Invalid fragrance.");

        }
    }


}
