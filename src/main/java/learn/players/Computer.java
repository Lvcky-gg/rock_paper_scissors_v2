package learn.players;

import java.util.Random;

public class Computer implements Player{
    @Override
    public String generateMove() {
        Random random = new Random();
        int choice = random.nextInt(3)+1;
        return PlayerHelper.getPlayerMove(choice);
    }
}
