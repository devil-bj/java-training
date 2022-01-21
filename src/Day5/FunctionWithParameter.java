package Day5;

import java.util.logging.Logger;

public class FunctionWithParameter {
    // this is simple example of Function with argument and parameter passing.
    static   String name;
    static  double phoneNumber ;
    static String sClass;
    static String rollNumber= "6159";
    static String address="Irving Texas";
    static String emergencyContactNumber = "4698553585";
    public static void main(String []args){
        information("Vijay Pokhrel",9819382048d,"Master's");
    }

    static void information(String name, double phoneNumber,String sClass){
        Logger.getGlobal().info("Student Information:\n" + "Name:\t" + name + "Class: \t" + sClass + "Address: \t" + address + " Emergency Contact \t" + emergencyContactNumber);
    }
}
