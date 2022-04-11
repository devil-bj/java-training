package Day21.JavaCollection.LinkListJava;

import java.util.Iterator;
import java.util.LinkedList;

class Book{
    String author;
    String title;
    String publication;
    Integer year;
    Integer id;
    Integer qty;

    public Book(Integer id ,String author, String title, String publication, Integer year, Integer qty) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publication = publication;
        this.year = year;
        this.qty = qty;
    }


}

public class JavaLinkLIstBookExample {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Riley and James", "C-Programming", "McGrawHill", 2010,5);
        Book b2 = new Book(102, "Ayush Sharma", "Calculus", "Oxford", 2010,5);
        Book b3 = new Book(103, "Mahesh Maharjan", "Statistics-I", "Kathmandu", 2015,5);
        Book b4 = new Book(104, "DB Satyal", "Computer Networking", "Dev Publication", 2020,5);
        Book b5 = new Book(105, "Bijay Pokhrel", "DBMS", "McGrawHill", 2010,5);

        LinkedList <Book> list  = new LinkedList<Book>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);

        Iterator <Book> b = list.iterator();
        while (b.hasNext()){
            Book c = b.next();
            System.out.println(" ID: " + c.id+ "\tAuthor: \t" + c.author + "\tTitle: \t" + c.title + "\tPublication:\t" + c.publication + "\tYear: \t" + c.year + "\tQuantity:\t"+ c.qty);
        }


    }
}
