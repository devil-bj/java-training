package Day5;

import java.util.logging.Logger;

public class FunctionCalling {
    // Simple Function example without parameters
    static   String name="Yajib Pokhrel";
    static  double phoneNumber =9819382048d;
    static String sClass= "Master's";
    static String rollNumber= "6159";
    static String address="Irving Texas";
    static String emergencyContactNumber = "4698553585";
    public static void main(String []args){
        information();
    }

   static void information(){
        Logger.getGlobal().info("Student Information:\n" + "Name:\t" + name + "Class: \t" + sClass + "Address: \t" + address + " Emergency Contact \t" + emergencyContactNumber);
    }
}
