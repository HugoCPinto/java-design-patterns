package org.example.patterns;

import org.example.patterns.singleton.EagerInitializationSingleton;
import java.util.logging.Logger;

/**
 * just a main...
 */
public class Main {

    private static final Logger LOGGER = Logger.getLogger( Main.class.getName() );

    public static void main(String[] args) {
        LOGGER.info(EagerInitializationSingleton.getInstance().getHello());
    }
}