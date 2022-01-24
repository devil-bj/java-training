package Day8.Example2;


import java.util.logging.Logger;

public class EnumLoop {
    public static void main(String []args){
        for ( var cat : Categories.values() ){
            Logger.getGlobal().info("Values are: \t"  + cat);
        }
    }
}
enum  Categories {
    STARTER,
    BEGINNER,
    INTERMEDIATE,
    PROFESSIONAL,
    LEGEND,
}
