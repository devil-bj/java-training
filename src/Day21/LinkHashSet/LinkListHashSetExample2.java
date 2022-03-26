package JavaCollection.LinkHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkListHashSetExample2 {
    public static void main(String[] args) {

        // Link List Hash-Set with duplicated values.
        LinkedHashSet<String> num = new LinkedHashSet<>();
        num.add("one");
        num.add("two");
        num.add("three");
        num.add("two");
        num.add("five");
        num.add("three");
        num.add("one");

        Iterator itr = num.iterator();

        for (String set:num
        ) {
            System.out.println(set);
        }
    }
}
