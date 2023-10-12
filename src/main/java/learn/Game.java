package learn;

import learn.players.Computer;
import learn.players.Human;
import learn.players.PlayerHelper;
import learn.players.Player;

public class Game {
    // create a play method
    //need to determine the winner
    public void play(){
        System.out.printf("Welcome to %s | %s | %s | %n", PlayerHelper.ROCK, PlayerHelper.PAPER, PlayerHelper.SCISSORS);
        System.out.println();

        Player human = new Human();
        Player computer = new Computer();

        String humanMove = human.generateMove();
        System.out.println();
        System.out.println("good luck...");


        String computerMove = computer.generateMove();
        System.out.println(determineWinner(humanMove, computerMove));
    }
    /*
     * Determines the winner of the game
     * @param humanMove
     * @param computerMove
     * @return String
     * @example determineWinner("rock", "paper") -> "computer picked paper and you picked rock, you lose!"
     */
    public String determineWinner(String humanMove, String computerMove){
        if(computerMove.equals(humanMove)){
            return String.format("You both picked %s, Tie!", humanMove);
        }else if(computerMove.equals(PlayerHelper.PAPER) && humanMove.equals(PlayerHelper.SCISSORS)||
                computerMove.equals(PlayerHelper.ROCK) && humanMove.equals(PlayerHelper.PAPER) ||
                computerMove.equals(PlayerHelper.SCISSORS) && humanMove.equals(PlayerHelper.ROCK)){
            return String.format("computer picked %s and you picked %s, you win!", computerMove, humanMove);
        }else{
            return String.format("computer picked %s and you picked %s, you lose!", computerMove, humanMove);
        }
    }
}
