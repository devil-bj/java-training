package Day8;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

import java.util.logging.Logger;

public class Enum {
    // Enum is same like class, but we cannot create an object like class from enum.
    // Enum value is Fixed or final value. Only unchangeable value are placed in enums.

    public static void main(String []args){
        Categories cat = Categories.BEGINNER;
        Logger.getGlobal().info("Category is:  \t" + cat);
    }


}
enum  Categories {
    STARTER,
    BEGINNER,
    INTERMEDIATE,
    PROFESSIONAL,
    LEGEND,
}