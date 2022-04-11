package Day21.JavaCollection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet <String> hset = new HashSet<>();
        hset.add("cat");
        hset.add("dog");
        hset.add("zebra");
        hset.add("lion");

        Iterator itr = hset.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
