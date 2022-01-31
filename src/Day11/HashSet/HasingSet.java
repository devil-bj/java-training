package Day11.HashSet;

import java.util.HashSet;
import java.util.logging.Logger;


/*
* add() method is used for adding data in hashset.
* contains() method is used for checking data.
* size() method is used for size of hash
* remove() is used for removing data
* clear() method is used for clearing all the data from the hash table.
* */
public class HasingSet {
    public static void main(String[] args) {
        HashSet<String> carsGroup = new HashSet<String>();
        carsGroup.add("Mazda");
        carsGroup.add("Camry");
        carsGroup.add("Toyota");
        carsGroup.add("Dodge");
        carsGroup.add("Mustang");
        carsGroup.add("Ford");

        System.out.println(carsGroup);
        System.out.println( carsGroup.clone());
        System.out.println( carsGroup.size());
        carsGroup.remove("Dodge");
        System.out.println(carsGroup);
        Logger.getGlobal().info(String.valueOf(carsGroup.contains("Camry")));


    }
}
