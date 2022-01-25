package Day9.ArrayList;
import java.util.ArrayList;
import java.util.logging.Logger;

/*
* difference between array and the array list is that
* Array is fixed and items can't be added to insert item new array need to be created.
* ArrayList is unlike built-in Array */
class Array {
    public static void main(String []args){

        ArrayList name  = new ArrayList<String>();
        name.add("John");     // add() is used for adding elements on the array.
        name.add("Jay");
        name.add("Zeus");
        name.add("Jacob");
        name.add("Kevin");
        name.add("Jess");
        name.add("Brandon");
        name.add("BJ");
        name.add("Alvin");
        Logger.getGlobal().info("ArrayList Names: " + name);

        System.out.println(name.get(2));      //get() is used for finding the items from the arrayList.
        System.out.println(name.get(3));
        System.out.println(name.get(5));

        name.set(5, "Chris");   // set() is used for modifying items of the ArrayList.
        name.set(0, "Raul");
        Logger.getGlobal().info("ArrayList Names: " + name);

        name.remove(0);  // remove() is used for removing items from the Arraylist
        Logger.getGlobal().info("ArrayList Names: " + name);


        // name.size(); size() is used for finding the size of array.
        Logger.getGlobal().info("ArrayList Names: " + name.size());


        name.clear(); // clear() method is used for clearing all the items of the arrayList.
        Logger.getGlobal().info("ArrayList Names: " + name);


    }
}
