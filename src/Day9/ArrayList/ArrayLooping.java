package Day9.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class ArrayLooping {
    public static void main(String []args){
        ArrayList <String> company = new ArrayList<String>();
        company.add("Amazon");
        company.add("Ebay");
        company.add("Apple");
        company.add("Microsoft");
        company.add("Tesla");
        company.add("Google");
        company.add("Yahoo");
        company.add("Youtube");
        Collections.sort(company);     // used for sorting an array items.

        for (int i = 0;  i<company.size(); i++){   // for loop ArrayList
            Logger.getGlobal().info(" ArrayList Items in loop: " +  company.get(i));
        }

        for(String i : company){   // foreach loop ArrayList
         System.out.println("Company's ArrayList by looping: \n"   + i);
        }

    }
}
