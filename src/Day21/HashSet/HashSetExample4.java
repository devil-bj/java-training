package JavaCollection.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Java HashSet from another collection.
public class HashSetExample4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ktm");
        arrayList.add("Brt");
        arrayList.add("Ith");
        arrayList.add("Dhr");

        HashSet <String> hashSet = new HashSet(arrayList);

        hashSet.add("bijay");
        hashSet.add("Jay");
        hashSet.add("Sanjay");

        Iterator itr = hashSet.iterator();
        for (String l:hashSet
             ) {
            System.out.println(l);
        }

    }
}
