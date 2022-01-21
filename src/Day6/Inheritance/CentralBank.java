package Day6.Inheritance;

import java.util.logging.Logger;

public class CentralBank {
    String bankName="KRISHI BIKASH BANK LIMITED";
    int swiftCode= 12345;
    String bankType = "Agricultural Bank";
    String bankCategory = "A Graded Bank";
    String headOfficePhone = "021-1235674";
    void operation(){
        Logger.getGlobal().info("Controls and Manages all the other branches");
        Logger.getGlobal().info("Bank Name : " + bankName + "\nSwift Code: " + swiftCode + "\nBank Type :"  + bankType + "\nBank Category: " + bankCategory);
    }
}
