package Day21;

import java.util.Iterator;
import java.util.Vector;

public class VectorList {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Ravi");
        vector.add("Vijay");
        vector.add("Ravi");
        vector.add("Ajay");
        Iterator it = vector.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
