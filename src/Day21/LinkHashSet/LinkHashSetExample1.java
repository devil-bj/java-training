package JavaCollection.LinkHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSetExample1 {
    public static void main(String[] args) {
        LinkedHashSet <String> num = new LinkedHashSet<>();
        num.add("one");
        num.add("two");
        num.add("three");
        num.add("four");
        num.add("five");
        num.add("six");
        num.add("seven");

        Iterator itr = num.iterator();

        for (String set:num
             ) {
            System.out.println(set);
        }
    }
}
