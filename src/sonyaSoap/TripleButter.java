package sonyaSoap;

/**
 * A special type of coconut oil soap is offered at Sonya's Soaps,
 * a “triple butter” soap that includes additional nut and fruit
 * butters.
 */
public class TripleButter extends CoconutOil {
    public TripleButter(int size, String shape, String fragrance) {
        super(size, shape, fragrance, false);
    }

    @Override
    public int getBubbleSize() {
        return super.getBubbleSize() + 1;
    }

    @Override
    public int getSoftness() {
        return super.getSoftness() + 1;
    }

    @Override public double getPricePerOz() {
        return super.getPricePerOz() + 0.11;
    }
}
