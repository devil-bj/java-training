package JavaCollection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {

    // Hash Set does not allow duplicated elements.
    // let's see following example.
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        hset.add("cat");
        hset.add("dog");
        hset.add("zebra");
        hset.add("lion");
        hset.add("cat");
//
//        Iterator itr = hset.iterator();
//
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
        for (String l:hset
             ) {
            System.out.println(l);
        }

    }
}
