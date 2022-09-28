package org.example.patterns;

import org.example.patterns.singleton.EagerInitializationSingleton;
import org.example.patterns.singleton.LazyInitializationSingleton;
import org.example.patterns.singleton.StaticBlockSingleton;
import org.example.patterns.singleton.ThreadSafeSingleton;

import java.util.logging.Logger;

/**
 * just a main...
 */
public class Main {

    private static final Logger LOGGER = Logger.getLogger( Main.class.getName() );

    public static void main(String[] args) {
        // singleton
        LOGGER.info(EagerInitializationSingleton.getInstance().getHello());
        LOGGER.info(StaticBlockSingleton.getInstance().getHello());
        LOGGER.info(LazyInitializationSingleton.getInstance().getHello());
        LOGGER.info(ThreadSafeSingleton.getInstance().getHello());
        LOGGER.info(ThreadSafeSingleton.getInstanceWithBetterPerformance().getHello());

    }
}