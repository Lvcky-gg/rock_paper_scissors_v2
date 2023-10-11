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

    @Test
    void rockShouldBeatScissors(){
        String res = game.determineWinner(PlayerHelper.ROCK, PlayerHelper.SCISSORS);
        assertNotNull(res);
        assertEquals(String.format("computer picked %s and you picked %s, you win!", PlayerHelper.SCISSORS, PlayerHelper.ROCK), res);
    }
    @Test
    void scissorsShouldBeatPaper(){
        String res = game.determineWinner(PlayerHelper.SCISSORS, PlayerHelper.PAPER);
        assertNotNull(res);
        assertEquals(String.format("computer picked %s and you picked %s, you win!", PlayerHelper.PAPER, PlayerHelper.SCISSORS), res);
    }
    @Test
    void paperShouldBeatRock(){
        String res = game.determineWinner(PlayerHelper.PAPER, PlayerHelper.ROCK);
        assertNotNull(res);
        assertEquals(String.format("computer picked %s and you picked %s, you win!", PlayerHelper.ROCK, PlayerHelper.PAPER), res);
    }


    //losses
    @Test
    void rockShouldNotBeatPaper(){
        String res = game.determineWinner(PlayerHelper.ROCK, PlayerHelper.PAPER);
        assertNotNull(res);
        assertEquals(String.format(String.format("computer picked %s and you picked %s, you lose!", PlayerHelper.PAPER, PlayerHelper.ROCK)), res);

    }
    @Test
    void paperShouldNotBeatScissors(){
        String res = game.determineWinner(PlayerHelper.PAPER, PlayerHelper.SCISSORS);
        assertNotNull(res);
        assertEquals(String.format(String.format("computer picked %s and you picked %s, you lose!", PlayerHelper.SCISSORS, PlayerHelper.PAPER)), res);


    }
    @Test
    void scissorsShouldNotBeatRock(){
        String res = game.determineWinner(PlayerHelper.SCISSORS, PlayerHelper.ROCK);
        assertNotNull(res);
        assertEquals(String.format(String.format("computer picked %s and you picked %s, you lose!", PlayerHelper.ROCK, PlayerHelper.SCISSORS)), res);


    }


}