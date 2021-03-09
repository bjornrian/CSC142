package sonyaSoap;

public class TripleButter extends CoconutOil {
    public TripleButter(int size, String shape, String fragrance) {
        super(size, shape, fragrance, false);
    }

    @Override
    public String bubbleSize() {
        return formatFeature("Bubble Size Rating:", String.valueOf(BUBBLE_SIZE + 1));
    }

    @Override
    public String softness() {
        return formatFeature("Softness Rating:", String.valueOf(SOFTNESS + 1));
    }

    @Override
    public String pricePerOz() {
        return formatFeature("Price Per Ounce:", String.valueOf(PRICE + 0.11));
    }
}
