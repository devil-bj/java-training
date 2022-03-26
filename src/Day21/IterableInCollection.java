package Day21;//package JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableInCollection {
    public static void main(String[] args) {
        List<String> obj = new ArrayList<>();
        obj.add("B");
        obj.add("X");
        obj.add("Y");
        obj.add("Z");
        obj.add("G");


        Iterator itr = obj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

