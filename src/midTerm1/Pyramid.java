package midTerm1;

public class Pyramid {
    private static final double DENOMINATOR = 3.0;
    private static final double NUMERATOR = 1.0;
    public String name;
    private double baseArea;
    private double height;

    public Pyramid(String name){
        validateInput(name);
        this.name = name;
        this.baseArea = 1;
        this.height = 1;
    }
    public Pyramid(String name, double baseArea, double height){
        validateInput(name);
        this.name = name;
        this.baseArea = baseArea;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }
    public double getBaseArea(){
        return this.baseArea;
    }
    public double getHeight(){
        return this.height;
    }

    public void setBaseArea(double baseArea){
        if (baseArea <= 0) {
            throw new IllegalArgumentException("Base area value cannot be less than or equal to zero");
        }
        this.baseArea = baseArea;
    }
    public void setHeight(double height){
        if (height <= 0) {
            throw new IllegalArgumentException("Height value cannot be less than or equal to zero");
        }
        this.height = height;
    }

    public double getVolume(){
        return (NUMERATOR / DENOMINATOR) * this.baseArea * this.height;
    }

    private void validateInput(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name value cannot be empty or equal to null.");
        }
    }
}
