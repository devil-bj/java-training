package Day8.Example2;

import java.util.logging.Logger;

public class EnumSwitch {
    enum  Categories {
        STARTER,
        BEGINNER,
        INTERMEDIATE,
        PROFESSIONAL,
        LEGEND,
    }
    public static void main(String []args){
     Categories cat =  Categories.LEGEND;
       switch (cat){
           case BEGINNER -> Logger.getGlobal().info("Beginner player:");
           case STARTER -> Logger.getGlobal().info("Level Second Player");
           case INTERMEDIATE ->Logger.getGlobal().info("Level Third Player");
           case PROFESSIONAL -> Logger.getGlobal().info("Level fourth Player");
           case LEGEND ->  Logger.getGlobal().info("Level fifth player");
           default -> Logger.getGlobal().info("Unknown Player Ranking");
       }
    }
}
