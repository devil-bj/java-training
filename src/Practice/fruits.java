package Practice;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public enum fruits {
    APPLE,
    BANANA,
    MANGO,
    GRAPES,
    ORANGES,
    SUGARCANE,
    WATERMELON;

}

class EnumExample{
public static void main(String []args){
    Set <fruits> enumSet = EnumSet.of(fruits.APPLE,fruits.SUGARCANE);

    Iterator itr = enumSet.iterator();

    while (itr.hasNext()){
        System.out.println("Data is : " + itr.next());
    }
}
}









