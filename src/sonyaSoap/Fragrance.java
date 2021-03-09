package sonyaSoap;

public enum Fragrance {
    COCONUT("Coconut"),
    MANGO("Mango"),
    PLUMERIA("Plumeria"),
    PINEAPPLE("Pineapple"),
    OCEAN_BREEZE("Ocean Breeze");

    private String fragrance;

    Fragrance(String fragrance) {
        this.fragrance = fragrance;
    }

    public String getFragrance() {
        return fragrance;
    }
}
