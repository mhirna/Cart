import org.junit.Test;

import static org.junit.Assert.*;

public class Privat24PaymentTest {
    Cart testCart = new Cart();
    PaymentStrategy paymentStrategy = new Privat24Payment();

    @Test
    public void paidSuccessfully() throws Exception {
        assertTrue(paymentStrategy.pay(10.2));
    }

}