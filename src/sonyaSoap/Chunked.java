package sonyaSoap;

/**
 * Sonya’s offers one special  kind  of  glycerin  soap,  a
 * chunked  version  that  has  chunks  of  contrasting colors
 * in the bar
 */
public class Chunked extends Glycerin {
    public Chunked(int size, String shape, String fragrance) {
        super(size, shape, fragrance);
        verifyShape(shape);
    }

    @Override
    public String getName() {
        return "Chunked";
    }

    private void verifyShape(String shape) {
        if(shape.equals(Shape.SEAHORSE.getShape())) {
            throw new IllegalArgumentException("Invalid shape");
        }
    }

    @Override public double getPricePerOz() {
        return super.getPricePerOz() + 0.10;
    }
}
