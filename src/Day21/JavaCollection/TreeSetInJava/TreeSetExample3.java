package Day21.JavaCollection.TreeSetInJava;

import java.util.Iterator;
import java.util.TreeSet;
 //Example to retrieve and remove the highest and lowest Value.
public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(2);
        set.add(12);
        set.add(23);
        set.add(19);
        set.add(21);

        System.out.println("Highest Data: " + set.pollFirst());
        System.out.println("Lowest Data: " + set.pollLast());
    }
}
