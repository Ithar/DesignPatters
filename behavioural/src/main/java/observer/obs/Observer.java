package observer.obs;

import observer.sub.Subject;
import observer.sub.SubjectImpl;

public abstract class Observer {

    protected Subject subject;
    public abstract void update();

}
