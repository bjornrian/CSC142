public class TesterBot {
    public static void main(String[] args) {
        int x = 5;
        do {

            System.out.print( x + " " );
            x -= 2;
        } while ( x < 0 );
        System.out.println( "Final x = " + x );
    }
}
