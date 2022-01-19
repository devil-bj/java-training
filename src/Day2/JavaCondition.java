package Day2;
/*
 * In this section we mainly check the condition and returns the statement
 * IF STATEMENT
 * IF-ELSE STATEMENT
 * ELSE-IF STATEMENT
 * NESTED STATEMENTS */

import java.util.logging.Logger;

public class JavaCondition  {              //IF STATEMENT ONLY

    public static  void main(String []args){
        double maths = 90, science = 85, social = 82, english = 90,health = 89;
        double sumPercent = ((maths+science+social+english+health)/500)*100;
        if (sumPercent>=40){
            Logger.getGlobal().info(String.valueOf("You Percentage : \t" + sumPercent + "%"));
        }

    }
}
