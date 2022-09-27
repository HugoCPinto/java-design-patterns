package org.example.patterns.singleton;

/**
 * Demonstrate how to create a singleton with eager initialization
 *
 * the instance is created when the class is loaded.
 * drawback: the instance is created even though client application might not be using it.
 * note: never use this approach!
 */
public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){
    }

    public static EagerInitializationSingleton getInstance(){
        return instance;
    }

    public String getHello(){
        return "EagerInitializationSingleton - Hello world!";
    }

}
