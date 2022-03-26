package Day21;

import java.io.*;
import java.util.ArrayList;

public class JavaSerializationDeserialization {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList <String> al = new ArrayList<>();
        al.add("bijay");
        al.add("ajay");
        al.add("Sanjay");
        al.add("samyog");
        al.add("samir");
        al.add("syon");
        al.add("Jay");
        al.add("Shreyan");
        al.add("rihan");


        // Serialization in  java.
        try{
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();

            // Deserialization of java

            FileInputStream fis = new FileInputStream("File");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList list = (ArrayList)ois.readObject();
            System.out.println(list);
        }
        catch (Exception e){
            System.out.println("Error is Caught: ");
        }


    }
}
