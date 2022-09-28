package org.example.patterns.singleton;

/**
 * Demonstrate how to create a safe thread singleton
 *
 * the instance is created when getInstance method is called.
 * note: use this approach when the environment is multi thread!
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    /**
     * synchronized method reduces the performance
     */
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * instead synchronized method synchronize if
     */
    public static ThreadSafeSingleton getInstanceWithBetterPerformance(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public String getHello(){
        return "ThreadSafeSingleton - Hello world!";
    }
}
