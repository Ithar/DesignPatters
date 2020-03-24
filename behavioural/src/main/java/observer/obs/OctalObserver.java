package observer.obs;

import observer.sub.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Notified Octal: " + Integer.toOctalString(subject.getState()));
    }
}
