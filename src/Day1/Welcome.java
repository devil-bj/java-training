package Day1;

import java.util.logging.Logger;

public class Welcome {
   static boolean mathIsFun = false;
    boolean historyIsBoring = true;
   static int age=5;
   static String name= "Ram Bhattarai";
   static  double phone = 9819382048d;
    public static void main(String[] args){
        System.out.println("Hello!\t"+ name +"\n***Information of User***\n");
        System.out.println("UserName:" + name + "\nUserAge:" + age + "\nUserPhone:" + phone);
        Logger.getGlobal().info(String.valueOf(mathIsFun));  // java boolean
    }
}
