package learn.players;

public class PlayerHelper {
    public static final String ROCK_ICON = "R";
    public static final String PAPER_ICON = "P";
    public static final String SCISSORS_ICON = "S";

    // moves
    public static final String ROCK = "Rock: " + ROCK_ICON;
    public static final String PAPER = "Paper: " + PAPER_ICON;
    public static final String SCISSORS = "Scissors: " + SCISSORS_ICON;

    //method that gets players move
    /*
     * Gets the player's move based on the choice
     * @param choice
     * @return String
     * @example getPlayerMove(1) -> "Rock"
     */
    public static String getPlayerMove(int choice) {
        String move = null;
        switch (choice) {
            case 1:
                move = ROCK;
                break;
            case 2:
                move = PAPER;
                break;
            case 3:
                move = SCISSORS;
                break;
        }
        return move;
    }
}
