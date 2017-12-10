package Observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User userTest = new User(69, "Margaryta Stefashko");

    @Test
    public void updateTest() throws Exception {
        userTest.update();
    }

    @Test
    public void getAgeTest() throws Exception {
        assertTrue(userTest.getAge() == 69);
    }

    @Test
    public void setAgeTest() throws Exception {
        userTest.setAge(18);
        assertTrue(userTest.getAge() == 18);
    }

    @Test
    public void getName() throws Exception {
        assertTrue(userTest.getName() == "Margaryta Stefashko");
    }

    @Test
    public void setName() throws Exception {
        userTest.setName("Young Beautiful");
        assertTrue(userTest.getName() == "Young Beautiful");
    }

}