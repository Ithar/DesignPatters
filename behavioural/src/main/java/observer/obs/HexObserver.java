package observer.obs;

import observer.sub.Subject;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Notified Hex: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
