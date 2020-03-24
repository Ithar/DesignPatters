package observer.sub;

import observer.obs.Observer;

public interface Subject {

    void setState(int state);
    int getState();
    void register(Observer observer);
    void unregister(Observer observer);
}
