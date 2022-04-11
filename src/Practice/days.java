package Practice;

import java.util.EnumSet;
import java.util.Set;

public enum days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
class EnumExample2{
    public static void main(String[] args) {
        Set<days> daysSet = EnumSet.allOf(days.class);
        System.out.println("Set1 :" + daysSet);
        Set<days> daysSet1 = EnumSet.noneOf(days.class);
        System.out.println("Set1 :" + daysSet1);


    }
}
