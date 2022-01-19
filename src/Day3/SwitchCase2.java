package Day3;

import java.util.logging.Logger;

public class SwitchCase2 { // these are the example of switch case statement in java. for String, int and for char.

    public static void main(String []args){
        String day  = "Sunday";
        Logger.getGlobal().info("This is used for selecting days ");
        switch (day) {
            case "Sunday" -> Logger.getGlobal().info(" Sunday is for Chest-Day");
            case "Monday" -> Logger.getGlobal().info("Monday is for Back & Shoulder Day");
            case "Tuesday" -> Logger.getGlobal().info("Tuesday is for Biceps and Triceps Day");
            case "Wednesday" -> Logger.getGlobal().info("Wednesday is for Abs Day");
            case "Thursday" -> Logger.getGlobal().info("Thursday is for chest and Biceps Day");
            case "Friday" -> Logger.getGlobal().info("Friday is for Leg Day");
            case "Saturday" -> Logger.getGlobal().info("Saturday is Rest Day");
            default -> Logger.getGlobal().info("Incorrect Selection!!!");
//            case 'A' -> Logger.getGlobal().info("A is Vowel Letter");
//            case 'E' -> Logger.getGlobal().info("E is Vowel Letter");
//            case 'I' -> Logger.getGlobal().info("I is Vowel Letter");
//            case 'O' -> Logger.getGlobal().info("O is Vowel Letter");
//            case 'U' -> Logger.getGlobal().info("U is Vowel Letter");
//            default -> Logger.getGlobal().info("Consonant Letters");
        }
    }
}
