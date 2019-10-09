package javaexamples;

public class SimpleSingleton {
    // initialize instance when loading class
    private static final SimpleSingleton instance = new SimpleSingleton();

    // private constructor prevents outside instantiation
    private SimpleSingleton() { }

    // public method to access instance
    public static SimpleSingleton getInstance() {
        return instance;
    }
}