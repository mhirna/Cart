import Game.ComputerGame;

import java.util.List;

public class CashPayment implements PaymentStrategy{

    @Override
    public boolean pay(double price) {
        System.out.println("Paid with cash. Success. Best wishes.");
        return true;
    }
}
