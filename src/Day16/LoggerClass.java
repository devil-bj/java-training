package Day16;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerClass {
    private  static final Logger logger = Logger.getLogger(LoggerClass.class.getSimpleName());
    public static void main(String[] args) {
        logger.setLevel(Level.OFF);// in here you can set level like OFF. OFF is responsible for switching off the level. others are many.
        logger.info("This is a info message");
        logger.warning("This is a warning message from logger");
        logger.config("This is a configuration method.");
        logger.severe("This is a severe logger");

    }

}
