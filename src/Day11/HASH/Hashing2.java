package Day11.HASH;

import java.util.HashMap;
import java.util.logging.Logger;
/*
*
* remove() method is same like array and link list
* clear() method is also same like array and link list
* get() method is also same like array and link list
* size() method is also same like array and link list
* the only difference in adding data put() method is used in hash map */
public class Hashing2 {
    public static void main(String[] args) {  // String, integer they are not primitive data types they are more objects.
        HashMap<String, Integer>   studentNameAge = new HashMap<>();
        studentNameAge.put("Monika", 22);
        studentNameAge.put("Madan",23);
        studentNameAge.put("Samyog", 18);
        studentNameAge.put("Samir", 25);
        studentNameAge.put("Krishna", 29);
        System.out.println(studentNameAge.size());
        for (String i: studentNameAge.keySet()
             ) {
            Logger.getGlobal().info("Key is \t" + i  + "Value corresponding: " + studentNameAge.get(i));

        }
            }
}
