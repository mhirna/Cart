import Game.ComputerGame;
import Game.ComputerGameParams;
import Game.Genre;
import Game.Platforms;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class CartTest {
    Cart testCart = new Cart();
    ArrayList<Genre> bonus = new ArrayList<>();
    ArrayList<Platforms> bonusPlatform = new ArrayList<>();
    ComputerGame testGame = new ComputerGame(new ComputerGameParams("testGame", "very testing game", 16, 2000, bonus, bonusPlatform));

    @Test
    public void shipStatusBeforeShipment() throws Exception {
        assertFalse(testCart.isShipped());
    }

    @Test
    public void shipStatusAfterShipment() throws Exception {
        testCart.ship();
        assertTrue(testCart.isShipped());
    }

    @Test
    public void paymentTypeValid() throws Exception {
        PaymentStrategy payment = testCart.generatePaymentMethod();
        assertTrue(payment instanceof PaymentStrategy);
    }

    @Test
    public void deviveryTypeValid() throws Exception {
        DeliveryStrategy delivery = testCart.generateDeliveryMethod();
        assertTrue(delivery instanceof DeliveryStrategy);
    }

    @Test
    public void addToCartAddToTotal() throws Exception {
        int total = testCart.getTotalPrice();
        testCart.addToCart(testGame);
        assertTrue(testCart.getTotalPrice() == total + testGame.getParams().getPrice());
    }

    @Test
    public void addToCartAddToGames() throws Exception {
        int total = testCart.getGames().size();
        testCart.addToCart(testGame);
        assertTrue(testCart.getGames().size() == total + 1);
    }

    @Test
    public void generatePaymentMethodValid() throws Exception {
        assertTrue(testCart.generatePaymentMethod() instanceof PaymentStrategy);
    }

    @Test
    public void generateDeliveryMethod() throws Exception {
        assertTrue(testCart.generateDeliveryMethod() instanceof DeliveryStrategy);
    }

    @Test
    public void computeTotal() throws Exception {
        assertTrue(testCart.computeTotal() == testCart.getTotalPrice());
    }
}