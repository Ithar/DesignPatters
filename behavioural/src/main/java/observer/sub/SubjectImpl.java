package observer.sub;

import observer.obs.Observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    @Override
    public synchronized void register(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {

        for (Observer observer : observers) {
            observer.update();
        }
    }

}
