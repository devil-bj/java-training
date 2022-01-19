package Day2;

import java.util.logging.Logger;

public class TernaryOperator {
    public static  void main(String []args){
        int day = 16;
        String result;
        result = (day<12) ? "This is Day-Time": "This is Night-Time"; //TERNARY OPERATOR IN JAVA.
        Logger.getGlobal().info(result);
    }
}
