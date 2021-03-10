package sonyaSoap;

public class Chunked extends Glycerin {
    public Chunked(int size, String shape, String fragrance) {
        super(size, shape, fragrance);
        verifyShape(shape);
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
