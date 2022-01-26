package Day9.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JavaArrayList2 { // integer types of for and for each loop
    public static void main(String []args){
        ArrayList <Integer>  number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(45);
        number.add(66);
        number.add(75);
        number.add(65);
        number.add(100);
        number.add(101);
        number.add(89);
        number.add(5);
        Collections.sort(number);                       // sorts the list of an ArrayList

        System.out.println(number.get(2));
        number.set(9, 12);
        System.out.println(number.get(9));
        number.remove(9);
        System.out.println(number);
        System.out.println(number.size());
                                              // for loop in java

        for(int i=0; i< number.size(); i++){
                    System.out.println(number.get(i));

        }

                                                      //for-each looping in java
        for (int numb:number
             ) {
                                    System.out.println(numb);

        }


    }

}
