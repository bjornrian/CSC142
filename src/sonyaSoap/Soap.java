package sonyaSoap;

import java.text.DecimalFormat;

/**
 * This is the parent class of all the soap types. All of the subclasses inherit
 * from this class. If the subclasses have special properties or rules, they will
 * override those.
 */
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
    private String name = "Soap";

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

    public String getName() {
        return name;
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

    /**
     * @return a formatted list of features for a soap type.
     */
    public String toString() {
        DecimalFormat twoDecimal = new DecimalFormat("0.00");
        StringBuilder builder = new StringBuilder("-----------------------------\n");
        builder.append(getName() + " soap");
        builder.append("\n");
        builder.append(formatFeature("Size:", String.valueOf(getSize())));
        builder.append(formatFeature("Shape:", getShape()));
        builder.append(formatFeature("Fragrance:", getFragrance()));
        builder.append(formatFeature("Exfoliating:", String.valueOf(getExfoliating())));
        builder.append(formatFeature("Bubble Size Rating:", String.valueOf(getBubbleSize())));
        builder.append(formatFeature("Softness Rating:", String.valueOf(getSoftness())));
        builder.append(formatFeature("Price Per Ounce:", String.valueOf(twoDecimal.format(getPricePerOz()))));
        return builder.toString();
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
