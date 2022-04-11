package Day21.JavaCollection.TreeSetInJava;

import java.util.Iterator;
import java.util.TreeSet;
//  example of traversing elements in descending order.
public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Bijay");
        set.add("Ramesh");
        set.add("Ravi");
        set.add("Arya");
        set.add("Bijay");

        Iterator itr = set.descendingIterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
