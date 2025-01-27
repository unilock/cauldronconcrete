package me.andante.cauldronconcrete;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CauldronConcrete implements ModInitializer {
    public static final String MOD_ID = "cauldronconcrete";
    public static final String MOD_NAME = "Cauldron Concrete";

    public static Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        log("Initialized");
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
    public static void log(String message) {
        log(Level.INFO, message);
    }
}
