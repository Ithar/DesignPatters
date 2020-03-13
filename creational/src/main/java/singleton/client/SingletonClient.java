package singleton.client;

import singleton.*;

public class SingletonClient {

    public static void main(String[] args) {

        // Not thread safe; possible race condition
        lazyApproach();
        System.out.println("\n==================\n");

        // Thread safe Synchronized; bad performance due to synchronization
        synchronizedApproach();
        System.out.println("\n==================\n");

        // Thread safe Synchronized; double locking
        doubleLockingApproach();
        System.out.println("\n==================\n");

        // Thread safe, no synchronization but always created
        eagerApproach();
        System.out.println("\n==================\n");

        //  Bull Pugh approach (recommended)
        staticInnerClassApproach(); // StaticInnerSingleton
    }

    private static void lazyApproach() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.setData("'LazySingleton' implementation.");
        System.out.println(lazySingleton.getData() + " > " + lazySingleton);
        lazySingleton = null;
        lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton.getData() + " > " + lazySingleton);
    }

    private static void synchronizedApproach() {
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        synchronizedSingleton.setData("'SynchronizedSingleton' implementation.");
        System.out.println(synchronizedSingleton.getData() + " > " + synchronizedSingleton);
        synchronizedSingleton = null;
        synchronizedSingleton = SynchronizedSingleton.getInstance();
        System.out.println(synchronizedSingleton.getData() + " > " + synchronizedSingleton);
    }

    private static void doubleLockingApproach() {
        DoubleLockingSingleton doubleLockingSingleton = DoubleLockingSingleton.getInstance();
        doubleLockingSingleton.setData("'DoubleLockingSingleton' implementation.");
        System.out.println(doubleLockingSingleton.getData() + " > " + doubleLockingSingleton);
        doubleLockingSingleton = null;
        doubleLockingSingleton = DoubleLockingSingleton.getInstance();
        System.out.println(doubleLockingSingleton.getData() + " > " + doubleLockingSingleton);
    }

    private static void eagerApproach() {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.setData("'EagerSingleton' implementation.");
        System.out.println(eagerSingleton.getData() + " > " + eagerSingleton);
        eagerSingleton = null;
        eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton.getData() + " > " + eagerSingleton);
    }

    private static void staticInnerClassApproach() {
        StaticInnerSingleton staticInnerSingleton = StaticInnerSingleton.getInstance();
        staticInnerSingleton.setData("'StaticInnerSingleton' implementation.");
        System.out.println(staticInnerSingleton.getData() + " > " + staticInnerSingleton);
        staticInnerSingleton = null;
        staticInnerSingleton = StaticInnerSingleton.getInstance();
        System.out.println(staticInnerSingleton.getData() + " > " + staticInnerSingleton);

    }

}
