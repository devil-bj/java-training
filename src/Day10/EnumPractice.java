package Day10;

import java.util.EnumSet;
import java.util.logging.Logger;

public class EnumPractice {        //enum switch case practice.
    public static void main(String []args){
        int day = WeekDay.FRIDAY.getAbbr();
        switch(day){
            case 1 -> Logger.getGlobal().info("First day of the week shop is open" );
            case 2 -> Logger.getGlobal().info("Second day of the week shop is open" );
            case 3 -> Logger.getGlobal().info("Third day of the week shop is open" );
            case 4 -> Logger.getGlobal().info("Fourth day of the week shop is open" );
            case 5 -> Logger.getGlobal().info("Fifth day of the week shop opens from 09:00 AM to 04:00 PM" );
            case 6 -> Logger.getGlobal().info("First Weekday shop opens for only 3  hours ");
            case 7 -> Logger.getGlobal().info("Second WeekDay shop is completely closed" );
            default -> Logger.getGlobal().info("Invalid selection");
        }

        EnumSet <WeekDay> always = EnumSet.allOf(WeekDay.class); //EnumSet is responsible for giving list of all the items belonging of enum class.
        EnumSet<WeekDay> never = EnumSet.noneOf(WeekDay.class); //
        EnumSet<WeekDay> range = EnumSet.range(WeekDay.MONDAY,WeekDay.FRIDAY);
        EnumSet<WeekDay> onlyMwd = EnumSet.of(WeekDay.MONDAY,WeekDay.WEDNESDAY,WeekDay.FRIDAY);
        System.out.println(always);
        System.out.println(never);
        System.out.println(range);
        System.out.println(onlyMwd);

    }
    }

