package Day11.HASH;

import java.util.HashMap;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class HashInJava {
    public static void main(String[] args) {
        HashMap <String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Nepal","Kathmandu");
        capitalCities.put("China", "Beijing");
        capitalCities.put("India", "Delhi");
        capitalCities.put("Pakistan", "Islamabad");
        capitalCities.put("Bangladesh", "Male");
        capitalCities.put("USA", "Washington DC");

        Logger.getGlobal().info((capitalCities.get("USA")));
//        System.out.println(capitalCities);

        // looping in hash of java
        for(String i : capitalCities.values()){    // if values only wanted then
//            System.out.println(i);
        }

        for(String i: capitalCities.keySet()){  // if key wanted
//            System.out.println(i);
            Logger.getGlobal().info( "Key "   + i + "value" + capitalCities.get(i) );
        }


    }
}
