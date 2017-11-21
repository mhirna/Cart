import Game.ComputerGame;

import java.util.List;

public class Privat24Payment implements PaymentStrategy {

    @Override
    public boolean pay(double price) {
        System.out.println("Success. Paid with Privat24");
        return true;
    }
}
