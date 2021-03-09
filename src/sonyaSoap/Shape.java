package sonyaSoap;

public enum Shape {
    BAR("Bar"), SEASHELL("Seashell"), SEAHORSE("Seahorse");

    private String shape;

    private Shape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
