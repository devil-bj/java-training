package Day21;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

class LinkList {
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private void add(String ravi) {
    }
}
