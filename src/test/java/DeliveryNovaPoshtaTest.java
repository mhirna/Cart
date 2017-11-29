import Game.ComputerGame;
import Game.ComputerGameParams;
import Game.Genre;
import Game.Platforms;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DeliveryNovaPoshtaTest {
    DeliveryStrategy delivery = new DeliveryNovaPoshta();
    ArrayList<ComputerGame> testingGames = new ArrayList<>();
    ArrayList<Genre> genre = new ArrayList<>();
    ArrayList<Platforms> platform = new ArrayList<>();
    ComputerGame testGame = new ComputerGame(new ComputerGameParams("testGame", "very testing game", 16, 2000, genre, platform));

    @Test
    public void deliveredSuccessfully() throws Exception {
        testingGames.add(testGame);
        testingGames.add(testGame);
        assertTrue(delivery.deliver(testingGames));
    }

}