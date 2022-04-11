package Day21.JavaCollection.HashSet;

import java.util.HashSet;

public class HashSetExample3 {
    public static void main(String[] args) {
        // Adding data to any position of the hashing list.

        HashSet <String> hashSet1 = new HashSet<>();
        hashSet1.add("Apple");
        hashSet1.add("Banana");
        hashSet1.add("Mango");
        System.out.println(hashSet1);
        // Removing the elements from the list
        hashSet1.remove("Mango");
        System.out.println(hashSet1);
        // Adding another list
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("Grapes");
        hashSet2.add("Carrot");
        hashSet2.add("Juniper");

        hashSet1.addAll(hashSet2);

        System.out.println(hashSet1);
    }
}
