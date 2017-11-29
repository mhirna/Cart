import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartDecoratorTest {
    Cart testCart = new CartDecorator(new Cart());

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
    public void computeTotal() throws Exception {
        assertTrue(testCart.computeTotal() == testCart.getTotalPrice());
    }

}