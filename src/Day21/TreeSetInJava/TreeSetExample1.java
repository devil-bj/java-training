package JavaCollection.TreeSetInJava;

import java.util.Iterator;
import java.util.TreeSet;

/*Tree Set mainly used for storing data in the set.
* it sorts the elements of the list.
* No duplicated data are presented.
* it is non-synchronized.*/

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet <String>  set = new TreeSet<>();
        set.add("Bijay");
        set.add("Ramesh");
        set.add("Ravi");
        set.add("Arya");
        set.add("Bijay");

        Iterator itr = set.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
