package org.example.patterns.singleton;

/**
 * Demonstrate how to create a singleton with lazy initialization
 *
 * the instance is created when getInstance method is called.
 * drawback: works fine for none multi thread environments but could be a nightmare if multiple threads are inside the
 * if.
 * note: never use this approach when the environment is multi thread!
 */
public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){}

    public static LazyInitializationSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializationSingleton();
        }

        return instance;
    }

    public String getHello(){
        return "LazyInitializationSingleton - Hello world!";
    }
}
