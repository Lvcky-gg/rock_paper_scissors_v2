package learn;

import learn.players.PlayerHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// 3 A's of testing
// Arrange - set up test env
//Act - invoke methods, run code, etc
//Assert - check output if expected
class GameTest {
    //arrange
    Game game = new Game();
    //ties
    @Test
    void twoOfTheSame(){
        String res = game.determineWinner(PlayerHelper.ROCK, PlayerHelper.ROCK);
        assertNotNull(res);
        assertEquals(String.format("You both picked %s, Tie!", PlayerHelper.ROCK), res);
        String res2 = game.determineWinner(PlayerHelper.PAPER, PlayerHelper.PAPER);
        assertNotNull(res2);
        assertEquals(String.format("You both picked %s, Tie!", PlayerHelper.PAPER), res2);
        String res3 = game.determineWinner(PlayerHelper.SCISSORS, PlayerHelper.SCISSORS);
        assertNotNull(res3);
        assertEquals(String.format("You both picked %s, Tie!", PlayerHelper.SCISSORS), res3);
    }

    //happy path - win


    //losses


}