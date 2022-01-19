package Day1;

import java.util.Locale;
import java.util.logging.Logger;

class JavaString {   // Java String
     static String fName = "Bijay";
     static String lName = "Pokhrel";
     static String address = "Irving Texas";
     static  String Phone = "4698553585";
  public static void main(String []args){
      String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      Logger.getGlobal().info(String.valueOf(txt.length()));  // Shows the length of the String.
      Logger.getGlobal().info(txt.toLowerCase(Locale.ROOT));// Changes the upper case to lower case letter.

      String fullName  = fName + lName;  // + sum two string.
        Logger.getGlobal().info(fullName);
        String name = fName.concat(lName);  // concatenation of two Strings same like + operator.
        Logger.getGlobal().info(name);

    }
}
