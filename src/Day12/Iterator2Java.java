package Day12;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2Java {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(15);
        numbers.add(5);
        numbers.add(22);
        numbers.add(25);
        numbers.add(12);
        numbers.add(11);
        numbers.add(8);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if (i<10){
                iterator.remove();
            }

        }
        System.out.println(numbers);
    }
}



