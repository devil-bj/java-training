package JavaCollection.HashSet;
import java.util.HashSet;

//Let's see a HashSet example where we are adding books to set and printing all the books.

class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class HashSetExample5 {
    public static void main(String[] args) {
        Book b1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        HashSet <Book> set = new HashSet<>();
        set.add(b1);
        set.add(b2);
        set.add(b3);

        for (Book books:set
             ) {
            System.out.println(books.author + books.name + books.publisher+ books.id + books.quantity);
        }
    }
}
