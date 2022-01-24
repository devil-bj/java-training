package Day7.Encapsulation;


import java.util.logging.Logger;

public class EncapsulatedData  {
  private  String socialNumber ;  // It inherits the properties of both branch bank and the central bank.
    String accountName = "Raju Rastogi";
    private String accountNumber = "055443322000011";
    String accountType = "Current";
    void information(){
        Logger.getGlobal().info("Client Name: " + accountName + " \n Client Account Number :"
                + accountNumber + "\nSocial Security Number: " + socialNumber +
                "\nAccount Type:" + accountType);
    }

    public String getSocialNumber() {  // getter and setter are mainly used for Encapsulation.
        return socialNumber;           // Encapsulation is the process of hiding data and methods.
                                       // private modifier is used to set the value private and only accessible within the class only
    }                                  // getter and setter are used to set and get the value of private data type.

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
