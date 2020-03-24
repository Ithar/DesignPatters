package observer.client;

import observer.obs.BinaryObserver;
import observer.obs.HexObserver;
import observer.obs.Observer;
import observer.obs.OctalObserver;
import observer.sub.Subject;
import observer.sub.SubjectImpl;

public class Client {

    public static void main(String[] args) {

        Subject subject = new SubjectImpl();

        Observer binary = new BinaryObserver(subject);
        Observer octal = new OctalObserver(subject);
        Observer hex = new HexObserver(subject);

        subject.register(binary);
        subject.register(octal);
        subject.register(hex);

        subject.setState(445);

        subject.unregister(octal);
        subject.unregister(hex);

        subject.setState(6578);

    }
}
