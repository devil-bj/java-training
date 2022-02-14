package Day20;

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

public class JavaIteratorExample {
    public static void main(String[] args) {

        ArrayList <String> nameData = new ArrayList<>();
        nameData.add("Bijay");
        nameData.add("Ajaya");
        nameData.add("Sanjaya");
        nameData.add("Jaya");

//        Iterator<String> it = nameData.iterator();
//        while(it.hasNext()){
//            it.next();
//            Logger.getGlobal().info(String.valueOf());
//        }
        Collection<Student> students  = new ArrayList<>();



        boolean sContains  = students.contains(new Student("Bijay",1));
        Logger.getGlobal().info(String.valueOf(sContains));

        // another method of in Iterator.

        boolean isEmptyObject = students.isEmpty();
        Logger.getGlobal().info(String.valueOf(isEmptyObject));

    }
}
