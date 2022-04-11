package Day21.JavaCollection.LinkListJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList <String> ll = new LinkedList<>();
        ll.add("bina");
        ll.add("Rama");
        ll.add("Shanti");
        ll.add("Sushmita");

        // now creating an iterator

        Iterator <String> itr = ll.iterator();
         while (itr.hasNext()){
             String res = itr.next();
             System.out.println(res);
         }

         // now again creating another class of linked list

        LinkedList <String>  ll2 = new LinkedList<>();
         ll2.add("Sangita");
         ll2.add("Binita");
         ll2.add("Kabita");
         ll2.add("Sarita");

         ll.addAll(ll2);
         System.out.println(ll);


        LinkedList <String>  ll3 = new LinkedList<>();
        ll3.add("Samjhana");
        ll3.add("Asmita");
        ll3.add("Dipika");
        ll3.add("Navina");

        // IN this link list we are trying to add the elements on the position 1.
        ll.addAll(1, ll3);
        System.out.println(ll);

        // adding elements on specific position

        ll.addFirst("Bijay");
        ll.addLast("Ajay");
        System.out.println(ll);


        // Now trying to remove the elements from the position.
        ll.remove(2);
        System.out.println(ll);


    }

}
