package JavaCollection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<> ();
        hashMap.put(1,"bijay");
        hashMap.put(2,"Sanjay");
        hashMap.put(3,"jay");
        hashMap.put(4,"Ajay");
        hashMap.put(5,"Buwa");
        // lets use duplicate values on hash map.
        hashMap.put(4,"Ajay");
        // so, it's store the current values on the key terms. mean it replace current with previous key.

        System.out.println("This is an example of hash map where key and values are stored");
        for (Map.Entry m : hashMap.entrySet()){
            System.out.println("Entry:" +m.getKey() +"Values :" + m.getValue());

        }

    }
}
