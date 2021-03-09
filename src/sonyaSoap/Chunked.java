package sonyaSoap;

public class Chunked extends Glycerin {

    public Chunked(int size, String shape, String fragrance) {
        super(size, shape, fragrance);
        verifyShape(shape);
    }

    @Override
    public String pricePerOz() {
        return formatFeature("Price Per Ounce:", String.valueOf(PRICE + 0.1));
    }

    private void verifySize(int size) {
        if(size == 3) {
            throw new IllegalArgumentException("Error: Invalid size.");
        }
    }

    private void verifyShape(String shape) {
        if(shape.equals(Shape.SEAHORSE.getShape())) {
            throw new IllegalArgumentException("Error: Invalid shape.");
        }
    }
}