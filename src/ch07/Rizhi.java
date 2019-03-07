package ch07;

import java.io.File;
import java.lang.reflect.Constructor;
import java.time.LocalDate;
import java.util.FormatFlagsConversionMismatchException;
import java.util.logging.*;

public class Rizhi {
    public static void main(String[] args) {

        Logger logger = Logger.getGlobal();
        logger.setUseParentHandlers(false);

        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
       /* Filter filter = new Filter() {
            @Override

            public boolean isLoggable(LogRecord record) {

                return record.getMessage().length() < 6 ?false : true;
            }
        };
logger.setFilter(filter);*/
        Formatter formatter = new Formatter() {
            @Override
            public String format(LogRecord record) {
                return LocalDate.now().toString() + ": " + record.getMessage() +"\n" ;
            }
        };
        handler.setFormatter(formatter);
        Logger.getGlobal().info("info");
        Logger.getGlobal().severe("severe");
        Logger.getGlobal().warning("warning");
        Logger.getGlobal().config("config");
        Logger.getGlobal().fine("fine");
        Logger.getGlobal().finer("finer");
        Logger.getGlobal().finest("finest");
    }
}
