package observer.obs;

import observer.sub.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Notified Binary: " + Integer.toBinaryString(subject.getState()));
    }
}
