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
        this.bubbleSize = verifyRange(1, 5, bubbleSize);
        this.softness = verifyRange(1, 5, softness);
        this.pricePerOz = verifyNonNegative(pricePerOz);
    }

    public String size() {
        return formatFeature("Size:", String.valueOf(size));
    }

    public String shape() {
        return formatFeature("Shape:", shape);
    }

    public String fragrance() {
        return formatFeature("Fragrance:", fragrance);
    }

    public String exfoliating() {
        return formatFeature("Exfoliating:", String.valueOf(exfoliating));
    }

    public String bubbleSize() {
        return formatFeature("Bubble Size Rating:", String.valueOf(bubbleSize));
    }

    public String softness() {
        return formatFeature("Softness Rating:", String.valueOf(softness));
    }

    public String pricePerOz() {
        return formatFeature("Price Per Ounce:", String.valueOf(pricePerOz));
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("-------------------------------------\n");
        builder.append(getClass().getName().substring(10) + " soap");
        builder.append("\n");
        builder.append(size());
        builder.append(shape());
        builder.append(fragrance());
        builder.append(exfoliating());
        builder.append(bubbleSize());
        builder.append(softness());
        builder.append(pricePerOz());
        return String.valueOf(builder);
    }

    public String formatFeature(String feature, String content) {
        return String.format(FEATURE_FORMAT, feature, content);
    }

    private double verifyNonNegative(double pricePerOz) {
        if (pricePerOz < 0) {
            throw new IllegalArgumentException("Error: Price per ounce must be more than zero.");
        }
        return pricePerOz;
    }

    private int verifyRange(int min, int max, int number) {
        if (number < min || number > max) {
            throw new IllegalArgumentException("Error: Rating number must be between " + min + " and " + max + ".");
        }
        return number;
    }
}
