package Day10;

import java.util.logging.Logger;

public class Ellipses {


    public static void main(String[] args) { // ellipse method allows us to use same method having different parameters
        add(2,3);                            // same methods can be initialized multiple number of times.
        add(2,3,4,5);
        add(2,3,4);


    }
    public static void add(int... values){
        int temp = 0;
        for (int value:values) {
             temp +=value;
        }
        Logger.getGlobal().info("Values after addition \t"  + temp);
    }
}
