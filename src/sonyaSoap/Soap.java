package sonyaSoap;

public abstract class Soap {
    private static final String FEATURE_FORMAT = "%-20s%s\n";
    private static final int MIN_BUBBLE_SIZE = 1;
    private static final int MAX_BUBBLE_SIZE = 5;
    private static final int MIN_SOFTNESS = 1;
    private static final int MAX_SOFTNESS = 5;

    private int size;
    private Shape shape;
    private Fragrance fragrance;
    private boolean exfoliating;
    private int bubbleSize;
    private int softness;
    private double pricePerOz;

    public Soap(int size, Shape shape, Fragrance fragrance, boolean exfoliating,
            int bubbleSize, int softness, double pricePerOz) {
        this.size = size;
        this.shape = shape;
        this.fragrance = fragrance;
        this.exfoliating = exfoliating;
        this.setBubbleSize(bubbleSize);
        this.setSoftness(softness);
        this.setPricePerOz(pricePerOz);
    }

    private void setPricePerOz(double pricePerOz) {
        verifyNonNegative(pricePerOz);
        this.pricePerOz = pricePerOz;
    }

    private void setSoftness(int softness) {
        verifyRange(MIN_SOFTNESS, MAX_SOFTNESS, softness);
        this.softness = softness;
    }

    private void setBubbleSize(int bubbleSize) {
        verifyRange(MIN_BUBBLE_SIZE, MAX_BUBBLE_SIZE, bubbleSize);
        this.bubbleSize = bubbleSize;
    }

    public String getSize() {
        return formatFeature("Size:", String.valueOf(size));
    }

    public String getShape() {
        return formatFeature("Shape:", String.valueOf(shape));
    }

    public String getFragrance() {
        return formatFeature("Fragrance:", String.valueOf(fragrance));
    }

    public String getExfoliation() {
        return formatFeature("Exfoliating:", String.valueOf(exfoliating));
    }

    public String getBubbleSize() {
        return formatFeature("Bubble Size Rating:", String.valueOf(bubbleSize));
    }

    public String getSoftness() {
        return formatFeature("Softness Rating:", String.valueOf(softness));
    }

    public String getPricePerOz() {
        return formatFeature("Price Per Ounce:", String.valueOf(pricePerOz));
    }

    public String toString() {
        return "-------------------------------------\n" +
                getClass().getName() + "\n" + getSize() + getShape() + getFragrance() +
                getExfoliation() + getBubbleSize() + getSoftness() + getPricePerOz();
    }

    private String formatFeature(String feature, String content) {
        return String.format(FEATURE_FORMAT, feature, content);
    }

    private void verifyNonNegative(double pricePerOz) {
        if (pricePerOz < 0) {
            throw new IllegalArgumentException("Error: Price per ounce must be more than zero.");
        }
    }

    private void verifyRange(int min, int max, int number) {
        if (number < min || number > max) {
            throw new IllegalArgumentException("Error: Rating number must be between " + min + " and " + max + ".");
        }
    }
}
