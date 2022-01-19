package Day1;

import java.util.logging.Logger;

public class JavaBoolean {
    public static void main(String[] args){
        int x=10;
        int y=5;
        Logger.getGlobal().info(String.valueOf(x>y));  // It provides true or false value according to the condition.

        boolean mathsIsFun = true;
        boolean historyIsBoring = false;
        Logger.getGlobal().info(String.valueOf(mathsIsFun));   // show the stored boolean value true.
        Logger.getGlobal().info(String.valueOf(historyIsBoring)); // shows the stored boolean value false.

        Logger.getGlobal().info(String.valueOf(12<9));

    }
}
