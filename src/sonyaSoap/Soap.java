package sonyaSoap;

public abstract class Soap {
    private static final String FEATURE_FORMAT = "%-20s%s\n";
    private static final int MIN_BUBBLE_SIZE = 1;
    private static final int MAX_BUBBLE_SIZE = 5;
    private static final int MIN_SOFTNESS = 1;
    private static final int MAX_SOFTNESS = 5;

    private int size;
    private String shape;
    private String fragrance;
    private boolean exfoliating;
    private int bubbleSize;
    private int softness;
    private double pricePerOz;

    public Soap(int size, String shape, String fragrance, boolean exfoliating,
            int bubbleSize, int softness, double pricePerOz) {
        this.size = size;
        this.shape = shape;
        this.fragrance = fragrance;
        this.exfoliating = exfoliating;
        this.setBubbleSize(bubbleSize);
        this.setSoftness(softness);
        this.setPricePerOz(pricePerOz);
    }

    public int getSize() {
        return size;
    }

    public String getShape() {
        return shape;
    }

    public String getFragrance() {
        return fragrance;
    }

    public boolean getExfoliating() {
        return exfoliating;
    }

    public int getBubbleSize() {
        return bubbleSize;
    }

    public int getSoftness() {
        return softness;
    }

    public double getPricePerOz() {
        return pricePerOz;
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

    public String toString() {
        StringBuilder builder = new StringBuilder("-------------------------------------\n");
        builder.append(getClass().getName());
        builder.append("\n");
        builder.append(formatFeature("Size:", String.valueOf(size)));
        builder.append(formatFeature("Shape:", shape));
        builder.append(formatFeature("Fragrance:", fragrance));
        builder.append(formatFeature("Exfoliating:", String.valueOf(exfoliating)));
        builder.append(formatFeature("Bubble Size Rating:", String.valueOf(bubbleSize)));
        builder.append(formatFeature("Softness Rating:", String.valueOf(softness)));
        builder.append(formatFeature("Price Per Ounce:", String.valueOf(pricePerOz)));
        return String.valueOf(builder);
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
