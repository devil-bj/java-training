package Day21.JavaCollection.TreeSetInJava;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample4 {
    public static void main(String[] args) {
        Set <String> set = new TreeSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("three");
        set.add("four");

        Iterator itr = set.iterator();


    }
}
