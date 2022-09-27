package org.example.patterns.singleton;

/**
 * Demonstrate how to create a singleton with eager initialization
 *
 * the instance is created when the class is loaded but is possible to catch exceptions here
 * drawback: the instance is created even though client application might not be using it.
 * note: never use this approach!
 */
public class StaticBlockSingleton {

    private static final StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    static {
        try{
            instance = new StaticBlockSingleton();
        }catch (Exception exception){
            throw new RuntimeException();
        }

    }

     public static StaticBlockSingleton getInstance(){
        return instance;
     }

     public String getHello(){
        return "StaticBlockSingleton - Hello world!";
     }
}
