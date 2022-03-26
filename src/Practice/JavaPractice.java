package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public class JavaPractice {

    public static void main(String[] args) {
        Collection<String> name = new ArrayList<>() ;

        name.add("Apple");
        name.add("Banana");
        name.add("Mango");
        name.add("Orange");
        name.add("Grapes");

    System.out.println("Name before deletion of objects: \t"+name);
    name.remove("Mango");
    System.out.println("Name After deletion of objects : \t" +name);

    }


}
