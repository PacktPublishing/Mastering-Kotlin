package javaexamples;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    // private constructor prevents outside instantiation
    private ThreadSafeSingleton() { }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            // synchronized to prevent simultaneous access from
            // multiple threads
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    // initialize if not already created
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}