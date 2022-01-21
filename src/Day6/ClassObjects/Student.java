package Day6.ClassObjects;

import java.util.logging.Logger;

public class Student {  // students class with its methods.
    String name = "Jake Stephen";
    String sClass = " 12";
    String block = "Technology";
    String address = " Massachusetts";
    String stream = "Computer Science";
    String socialSecurityNumber = "098-765-4321";
    void information(){
        Logger.getGlobal().info("Name of Teacher: " + name + "\nSocial Security Number: " + socialSecurityNumber + "\nAddress: " + address );
    }
    void stream(){
        Logger.getGlobal().info(  "Stream:  " + stream + "\nBlock : " + block + "\nClass : " + sClass);
    }
}


