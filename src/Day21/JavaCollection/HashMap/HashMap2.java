package Day21.JavaCollection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        //HashMap add example.
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(100,"bijay");
        hashMap.put(102,"Sanjay");
        hashMap.put(103,"jay");
        hashMap.put(104,"Ajay");
        hashMap.put(105,"Buwa");

        System.out.println("Iterating HashMap of Java Class");
        for (Map.Entry mp: hashMap.entrySet()
             ) {
            System.out.println(mp.getKey() +""+mp.getValue());
        }
        // let'gs add another elements in the list. hashmap putIfAbsent() Method.
        hashMap.putIfAbsent(106,"Krishna");

        for (Map.Entry m: hashMap.entrySet()
             ) {
            System.out.println(m.getKey() +""+m.getValue());

        }
        // adding another object.
        HashMap<Integer, String> hashMap1 = new HashMap<Integer,String>();
        hashMap1.put(107,"Billi");
        hashMap1.put(108,"Lucky");
        hashMap1.putAll(hashMap);
        for (Map.Entry hmap:hashMap1.entrySet()
             ) {
            System.out.println(hmap.getKey() +""+hmap.getValue());

        }
    }


}
