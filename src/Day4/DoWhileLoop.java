package Day4;

import java.util.logging.Logger;

public class DoWhileLoop {  // Example of Do-While looping
    public static void main(String []args){
        int num=1;
        do{         // first statement and then check the condition in while block.
            Logger.getGlobal().info("Count the number: \t" + num );
            num++;
        }
        while (num <10);
    }
}
