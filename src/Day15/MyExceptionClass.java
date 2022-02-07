package Day15;

import java.io.IOException;
import java.util.logging.Logger;
/*
* Exception In Java.
* Example of IOException and RunTimeException
* */
public class MyExceptionClass {
    public static void main(String[] args) {
        ImageData imageData = new ImageData();

        try{
            imageData.getMyImage();
            imageData.downloadImage("www.facebook.com/photos");
        }
        catch(IOException | IndexOutOfBoundsException e){
            e.printStackTrace();
            Logger.getGlobal().info(e.getMessage());
        }/**We can use more catch blocks in Exception.
            Even, we can merge two catch blocks to one.
            or like | operator is used for merging.*/

//        try{
//
//        }
//        catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
//            Logger.getGlobal().info(e.getMessage());
//        }
    }
}
