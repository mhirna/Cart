import org.junit.Test;

import static org.junit.Assert.*;

public class DiscountDecoratorTest {
    private Cart testDiscountCart = new DiscountDecorator(new Cart());

    @Test
    public void PriceAfterDiscount() throws Exception {
        int total = testDiscountCart.getTotalPrice();
        testDiscountCart.computeTotal();
        assertTrue(testDiscountCart.getTotalPrice() == 0.8 * total);
    }

}
