package Day6.ClassObjects;

import java.util.logging.Logger;

public class Teachers {  // Teachers class with its method.
    String name= "Dr Otto Octavius";
    String faculty = "Science & Technology";
    String address = " Washington DC";
    String socialSecurityNumber = "012-345-6789";
    String subject = " Java language ";

     void information(){
         Logger.getGlobal().info("Name of Teacher: " + name + "\nSocial Security Number: " + socialSecurityNumber + "\nAddress: " + address );
    }
     void faculty(){
         Logger.getGlobal().info(  "Faculty: " + faculty + "\nPreferred Subject: " + subject);
     }

}
