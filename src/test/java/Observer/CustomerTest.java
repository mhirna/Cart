package Observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customerTest = new Customer(22, "Volodymyr Ivanovych");
    @Test
    public void update() throws Exception {
        customerTest.update();
    }

}