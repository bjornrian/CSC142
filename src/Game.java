import java.util.Arrays;

public class Game {
    public void players() { System.out.println("1 or more"); }
    Game g = new Game();
    Chess c = new Chess();
    ThreeDChess t = new ThreeDChess();

    Object og = g;
    Game gc = c;
    Game gt = t;
    Game gx = gc;
}


