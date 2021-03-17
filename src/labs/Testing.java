package labs;

import java.util.ArrayList;
import java.util.Iterator;

public class Testing {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add( 12 );
        nums.add( 32 );
        nums.add( 15 );
        nums.add( 2, 11 );
        nums.add( 6 );
        int s = nums.size();
        int sum = 0;
        Iterator<Integer> it = nums.iterator();
        while( it.hasNext() ) {
            int n = it.next();
            if ( n % 2 == 1 )
                sum = sum + n;
        }
        nums.remove( 0 );
        System.out.println(s);
        System.out.println(sum);
        System.out.println(nums.get(0));
    }
}
