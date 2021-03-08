package sonyaSoap;

public abstract class Soap {
    private static final String FEATURE_FORMAT = "%-20s%s\n";

    private int size;
    private Shape shape;
    private Fragrance fragrance;
    private boolean exfoliating;
    private int bubbleSize;
    private int softness;
    private float pricePerOz;

    public Soap(int size, Shape shape, Fragrance fragrance, boolean exfoliating,
            int bubbleSize, int softness, float pricePerOz) {
        this.size = verifySize(size);
        this.shape = shape;
        this.fragrance = fragrance;
        this.exfoliating = exfoliating;
        this.bubbleSize = verifyRange(bubbleSize);
        this.softness = verifyRange(softness);
        this.pricePerOz = verifyNonNegative(pricePerOz);
    }

    public String size() {
        return formatFeature("Size:", String.valueOf(size));
    }

    public String shape() {
        return formatFeature("Shape:", String.valueOf(shape));
    }

    public String fragrance() {
        return formatFeature("Fragrance:", String.valueOf(fragrance));
    }

    public String exfoliation() {
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
        return "-------------------------------------\n" +
                getClass().getName() + "\n" + size() + shape() + fragrance() +
                exfoliation() + bubbleSize() + softness() + pricePerOz();
    }

    public static String formatFeature(String feature, String content) {
        return String.format(FEATURE_FORMAT, feature, content);
    }

    public static int verifySize(int size) {
        if (size != 3 && size != 6 && size != 10) {
            throw new IllegalArgumentException("Error: Size must be either 3, 6, or 10 ounces.");
        }
    }

    public static float verifyNonNegative(float pricePerOz) {
        if (pricePerOz < 0) {
            throw new IllegalArgumentException("Error: Price per ounce must be more than zero.");
        }
        return 1;
    }

    public static int verifyRange(int number) {
        if (number < 1 || number > 5) {
            throw new IllegalArgumentException("Error: Rating number must be between 1 and 5.");
        }
        return number;
    }
}
