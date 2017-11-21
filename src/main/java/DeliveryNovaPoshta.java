import Game.ComputerGame;

import java.util.List;

public class DeliveryNovaPoshta implements DeliveryStrategy {
    @Override
    public boolean deliver(List<ComputerGame> games) {
        System.out.println("Delivery by Nova Poshta.");
        return true;
    }
}
