import Game.ComputerGame;

import java.util.List;

public class DeliveryNHL implements DeliveryStrategy {
    @Override
    public boolean deliver(List<ComputerGame> games) {
        System.out.println("Delivered by NHL");
        return true;
    }
}
