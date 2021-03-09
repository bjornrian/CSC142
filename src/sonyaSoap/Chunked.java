package sonyaSoap;

import java.text.DecimalFormat;

public class Chunked extends Glycerin {

    DecimalFormat twoDecimal = new DecimalFormat("0.00");

    public Chunked(int size, String shape, String fragrance) {
        super(size, shape, fragrance);
        verifyShape(shape);
    }

    @Override
    public String pricePerOz() {
        return formatFeature("Price Per Ounce:", String.valueOf(twoDecimal.format(PRICE + 0.1)));
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
