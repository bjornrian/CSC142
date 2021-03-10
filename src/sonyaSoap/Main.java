package sonyaSoap;

/**
 * This is the main driver to show all the details of the soap classes.
 *
 * @author Bjorn Rian
 */
public class Main {
    public static void main(String[] args) {
        Soap[] soaps = new Soap[5];
        Glycerin g1 = new Glycerin(Size.MEDIUM.getSize(), Shape.BAR.getShape(), Fragrance.PINEAPPLE.getFragrance());
        Chunked c1 = new Chunked(Size.LARGE.getSize(), Shape.SEASHELL.getShape(), Fragrance.MANGO.getFragrance());
        CoconutOil cO1 = new CoconutOil(Size.SMALL.getSize(), Shape.SEAHORSE.getShape(), Fragrance.COCONUT.getFragrance(), true);
        TripleButter t1 = new TripleButter(Size.LARGE.getSize(), Shape.SEASHELL.getShape(), Fragrance.MANGO.getFragrance());
        OliveOil o1 = new OliveOil(Size.MEDIUM.getSize(), Shape.SEAHORSE.getShape(), Fragrance.PLUMERIA.getFragrance(), false);
        soaps[0] = g1;
        soaps[1] = c1;
        soaps[2] = cO1;
        soaps[3] = t1;
        soaps[4] = o1;
        for (int idx = 0; idx < soaps.length; idx++) {
            System.out.println(soaps[idx].toString());
        }
    }
}
