package Observer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ObservableTest {
    Customer customerTest = new Customer(35, "Volodymyr");
    Seller sellerTest = new Seller(40, "Anastasiya");
    List<Observer> observers = new ArrayList<Observer>();


    @Test
    public void addObserverTest() throws Exception {
        observers.add(customerTest);
        Observable observableTest = new Observable(observers);
        observableTest.addObserver(sellerTest);
        assertTrue(observableTest.getObservers().size() == 2);
    }

    @Test
    public void removeObserver() throws Exception {
        observers.add(customerTest);
        observers.add(sellerTest);
        Observable observableTest = new Observable(observers);
        observableTest.removeObserver(sellerTest);
        assertTrue(observableTest.getObservers().size() == 1);
    }

    @Test
    public void notifyObservers() throws Exception {
        observers.add(customerTest);
        observers.add(sellerTest);
        Observable observableTest = new Observable(observers);
        observableTest.notifyObservers();
    }

}