import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class BonusDecoratorTest {
    private Cart testBonusCart = new BonusDecorator(new Cart());

    @Test
    public void ShipBonusPriceAfterShipping() throws Exception {
        int total = testBonusCart.getTotalPrice();
        testBonusCart.ship();
        assertTrue(testBonusCart.getTotalPrice() == total);
    }

    @Test
    public void ShipBonusGamesAfterShipping() throws Exception {
        int total = testBonusCart.getGames().size();
        testBonusCart.ship();
        assertTrue(testBonusCart.getGames().size() == total);
    }


}
