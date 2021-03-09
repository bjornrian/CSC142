package sonyaSoap;

public enum Size {
    SMALL(3), MEDIUM(6), LARGE(10);

    private int size;

    private Size(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
