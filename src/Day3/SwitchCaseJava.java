package Day3;

import java.util.logging.Logger;

public class SwitchCaseJava {
    public static  void main(String []args){
        int choice = 5;
        Logger.getGlobal().info("This is used for selecting days ");
        switch (choice) {
            case 1 -> Logger.getGlobal().info("Today is Sunday");
            case 2 -> Logger.getGlobal().info("Today is Monday");
            case 3 -> Logger.getGlobal().info("Today is Tuesday");
            case 4 -> Logger.getGlobal().info("Today is Wednesday");
            case 5 -> Logger.getGlobal().info("Today is Thursday");
            case 6 -> Logger.getGlobal().info("Today is Friday");
            case 7 -> Logger.getGlobal().info("Today is Saturday");
            default -> Logger.getGlobal().info("Invalid Choice");
        }

        }
    }

