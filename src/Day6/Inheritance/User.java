package Day6.Inheritance;

import java.util.logging.Logger;
//Extends properties helps to inherit the properties of resp classes.
public class User extends BranchBank { // This is the example of Inheritance in JAVA.
    String socialNumber = "012-345-6789";  // It inherits the properties of both branch bank and the central bank.
    String accountName = "Raju Rastogi";
    String accountNumber = "055443322000011";
    String accountType = "Current";
    void information(){
        Logger.getGlobal().info("Client Name: " + accountName + " \n Client Account Number :"
                + accountNumber + "\nSocial Security Number: " + socialNumber +
                "\nAccount Type:" + accountType + "\nAccount Maintain at : " + branchName + "\nBank Name: " + bankName);
    }
}
