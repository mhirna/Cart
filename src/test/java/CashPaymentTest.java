import org.junit.Test;

import static org.junit.Assert.*;

public class CashPaymentTest {
    Cart testCart = new Cart();
    PaymentStrategy paymentStrategy = new CashPayment();
    @Test
    public void paidSuccessfully() throws Exception {
        assertTrue(paymentStrategy.pay(100.4));
    }

}