package labs;

import java.util.ArrayList;
import java.util.Iterator;

public class Testing {
    public static void main(String[] args) {
        mystery3(0);
    }

    public static void mystery3(int n) {
        if (n <= 0) {
            System.out.print("*");
        } else if (n % 2 == 0) {
            System.out.print("(");
            mystery3(n - 1);
            System.out.print(")");
        } else {
            System.out.print("[");
            mystery3(n - 1);
            System.out.print("]");
        }
    }
}
