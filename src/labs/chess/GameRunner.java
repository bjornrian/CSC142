package labs.chess;

public class GameRunner {
    public static void main(String[] args) {
        Game g = new Game();
        Chess c = new Chess();
        ThreeDChess t = new ThreeDChess();

        Object og = g;
        Game gc = c;
        Game gt = t;
        //B: insert statements one at a time
        //Will the statement compile?
        // If yes, what are the static and dynamic types of the variable declared?
//        Game gx = gc;//1. Game, Chess
//        Game gx = og;//2. does not compile (needs cast)
//        Game gx = (Game) og;//3. Game, Game
//        Chess cx = (Chess) gt;//4. Chess, ThreeDChess
//        ThreeDChess tx = (ThreeDChess)gc;//NO

        //C) Finally, explain what would happen if each
        // of the following statements were inserted
        // ONE AT A TIME in the spot marked above.
        // Answer the following questions for each statement:
//        gc.players();//1. yes, no, 2
//        og.players;//2. no
//        t.players();//3. yes, no, 2
//        ((ThreeDChess) gc).hasMoveableBoard();//4. yes, yes
//        ((ThreeDChess) gt).hasMoveableBoard();//5. yes, no, true
    }

}
