import Game.ComputerGame;

import java.util.List;

interface DeliveryStrategy {
    boolean deliver(List<ComputerGame> games);
}
