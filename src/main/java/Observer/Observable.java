package Observer;
import java.util.List;

public class Observable {
    private List<Observer> observers;
    public Observable(List<Observer> observers){
        this.observers = observers;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public boolean notifyObservers() {
        System.out.println("There is an update! Check it out!");
        for (Observer observer : observers){
            observer.update();
        }
        return true;
    }
}

