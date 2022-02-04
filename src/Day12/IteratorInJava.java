package Day12;
import java.util.ArrayList;
import java.util.Iterator;
/*
* Iterator in Java
* It basically used as a loop*/
public class IteratorInJava {
    public static void main(String[] args) {
        ArrayList<String> cars =  new ArrayList<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Mustang");
        cars.add("Ferrari");
        Iterator<String>   iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
