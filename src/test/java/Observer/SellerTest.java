package Observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SellerTest {
    Seller sellerTest = new Seller(60, "Seller Petro");

    @Test
    public void update() throws Exception {
        sellerTest.update();
    }

}