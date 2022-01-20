package Day4;

/*lopping is the property of iterating or repeating until the condition is satisfied.
* generally there are while loop, Do-while loop, for loop, iterating looping and for in loop
* loops are very useful if we have to repeat things repeatedly*/
import java.util.logging.Logger;
//This is an example of while looping
public class LoopingInJava {
    public static void main(String[] args) {
        int i=1;
        while (i<5){ // while loops checks the condition.
            Logger.getGlobal().info("I love Programming\t" + "repeat times: " + i);
            i++; // performs the increment or decrement operation as per direction given.
        }
    }
}

