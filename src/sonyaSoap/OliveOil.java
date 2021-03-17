package sonyaSoap;

/**
 * Sonya’s offers several types of soaps, one of the main types being Olive Oil soap.
 */
public class OliveOil extends Soap{

    private static final int BUBBLE_SIZE = 2;
    private static final int SOFTNESS = 5;
    private static final double PRICE = 1.69;

    public OliveOil(int size, String shape, String fragrance, boolean exfoliating) {
        super(size, shape, fragrance, exfoliating, BUBBLE_SIZE, SOFTNESS, PRICE);
        validateShape(shape);
    }

    @Override
    public String getName() {
        return "Olive Oil";
    }

    private void validateShape(String shape) {
        if(shape.equals(Shape.BAR.getShape())) {
            throw new IllegalArgumentException("Error: Invalid shape.");
        }
    }
}
