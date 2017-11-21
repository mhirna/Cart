import Game.ComputerGame;
import Game.ComputerGameParams;
import Game.Genre;
import Game.Platforms;

import java.util.ArrayList;

public class BonusDecorator extends CartDecorator{
    public BonusDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public boolean ship(){
        ArrayList<Genre> bonus = new ArrayList<>();
        bonus.add(Genre.ACTION);
        ArrayList<Platforms> bonusPlatform = new ArrayList<>();
        bonusPlatform.add(Platforms.WINDOWS);
        cart.addToCart(new ComputerGame(new ComputerGameParams("Bonus game", "Description", 16, 0, bonus, bonusPlatform)));
        return super.ship();
    }

}
